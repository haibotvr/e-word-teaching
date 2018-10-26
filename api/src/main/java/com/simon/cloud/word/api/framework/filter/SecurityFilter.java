package com.simon.cloud.word.api.framework.filter;

import com.simon.cloud.word.api.framework.kits.JsonUtil;
import com.simon.cloud.word.api.framework.kits.JwtHelper;
import com.simon.cloud.word.api.framework.common.LeafConstant;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class SecurityFilter extends OncePerRequestFilter{

    /**
     * 封装，不需要过滤的list列表
     */
    protected static List<Pattern> patterns = new ArrayList<>();

    @Override
    protected void initFilterBean() throws ServletException {
        super.initFilterBean();
        Pattern pattern = Pattern.compile("/urp/urpLogin/login");
        patterns.add(pattern);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest,
                                    HttpServletResponse httpServletResponse,
                                    FilterChain filterChain) throws ServletException, IOException {
        //获取请求路径
        String uri = httpServletRequest.getRequestURI();
        //打印请求路径日志
        logger.info(uri);
        //是否需要过滤，如不需要直接跳转到下一个filter
        if(isInclude(uri)){
            filterChain.doFilter(httpServletRequest, httpServletResponse);
            return;
        }
        //获取请求中header参数
        Claims claims = JwtHelper.parseJWT(httpServletRequest.getHeader(LeafConstant.HTTP_TOKEN));
        httpServletRequest.getSession().setAttribute(
                LeafConstant.SESSION_USER,
                JsonUtil.toString(claims.get(LeafConstant.SESSION_USER, LinkedHashMap.class))
        );
        //继续执行下面的Filter
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    /**
     * 检查是否需要过滤
     */
    private boolean isInclude(String uri) {
        for (Pattern pattern: patterns){
            Matcher matcher = pattern.matcher(uri);
            if(matcher.matches()){
                return true;
            }
        }
        return false;
    }
}
