package com.simon.cloud.word.api.framework.filter;

import com.simon.cloud.word.api.framework.kits.JsonUtil;
import com.simon.cloud.word.api.framework.kits.WebUtil;
import com.simon.cloud.word.api.framework.web.ReturnValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * simon.wei
 */
@Slf4j
public class CustomCorsFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        //设置过滤器内返回的返回值类型
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");      //为安全起见，可配置允许访问的请求方地址。这里配置成*号，是允许所有访问。
        httpServletResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");        //为安全起见，也可配置成只允许POST请求
        httpServletResponse.addHeader("Access-Control-Allow-Headers", "Content-Type, token");      //这里要注意，token是自定义的请求头当中带的token，在这里必须添加，否则你永远获取不到。
        httpServletResponse.addHeader("Access-Control-Max-Age", "1800");//30 min
        //判断请求类型,只接受application/json请求
        if(!WebUtil.isContentTypeJson(httpServletRequest)){
            JsonUtil.mapper.writeValue(httpServletResponse.getWriter(), ReturnValue.error().setMessage("not supported"));
            return;
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}