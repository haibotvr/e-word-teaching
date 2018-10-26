package com.simon.cloud.word.urp.service.impl;

import com.simon.cloud.word.api.entities.UrpLogin;
import com.simon.cloud.word.api.entities.UrpLoginExample;
import com.simon.cloud.word.api.entities.UrpUserBase;
import com.simon.cloud.word.api.enums.UserStatusEnum;
import com.simon.cloud.word.api.framework.kits.JwtHelper;
import com.simon.cloud.word.api.framework.web.ReturnValue;
import com.simon.cloud.word.api.vo.UrpUserVO;
import com.simon.cloud.word.urp.mapper.UrpLoginMapper;
import com.simon.cloud.word.urp.mapper.UrpUserBaseMapper;
import com.simon.cloud.word.urp.service.UrpLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UrpLoginServiceImpl implements UrpLoginService {

    @Autowired
    UrpLoginMapper urpLoginMapper;

    @Autowired
    UrpUserBaseMapper urpUserBaseMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public ReturnValue login(UrpUserVO record) {
        //查询用户
        UrpLoginExample example = new UrpLoginExample();
        UrpLoginExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(record.getLoginName());
        List<UrpLogin> users = urpLoginMapper.selectByExample(example);
        //返回结果分类
        if(CollectionUtils.isEmpty(users)){
            return ReturnValue.error().setMessage("用户名或密码错误");
        }else if(users.size() > 1){
            return ReturnValue.error().setMessage("查询到多个用户");
        }else{
            UrpLogin urpLogin = users.get(0);
            if(passwordEncoder.matches(record.getLoginPassword(), urpLogin.getLoginPassword())){
                //查询用户基本信息
                UrpUserBase urpUserBase = urpUserBaseMapper.selectByPrimaryKey(urpLogin.getUserId());
                //如果用户基本信息不存在，不能登陆
                if(urpUserBase == null){
                    return ReturnValue.error().setMessage("用户基本信息不存在");
                }
                //如果用户状态不是正常，不能登陆
                if(!UserStatusEnum.NORMAL.getCode().equals(urpUserBase.getUserStatus())){
                    return ReturnValue.error().setMessage("用户状态异常");
                }
                //组装用户登陆信息
                record.setLoginType(urpLogin.getLoginType());
                record.setId(urpLogin.getUserId());
                record.setLoginPassword(urpLogin.getLoginPassword());
                record.setUserName(urpUserBase.getUserName());
                record.setUserRealName(urpUserBase.getUserRealName());
                record.setUserStatus(urpUserBase.getUserStatus());
                return ReturnValue.success(JwtHelper.createJWT(record)).setMessage("登陆成功");
            }
            return ReturnValue.error().setMessage("用户名或密码错误");
        }
    }
}
