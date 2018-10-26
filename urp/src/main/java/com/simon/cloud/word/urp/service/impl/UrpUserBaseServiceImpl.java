package com.simon.cloud.word.urp.service.impl;

import com.simon.cloud.word.api.entities.UrpLogin;
import com.simon.cloud.word.api.entities.UrpUserBase;
import com.simon.cloud.word.api.enums.LoginTypeEnum;
import com.simon.cloud.word.api.enums.UserStatusEnum;
import com.simon.cloud.word.api.framework.web.ReturnValue;
import com.simon.cloud.word.api.vo.UrpUserVO;
import com.simon.cloud.word.urp.mapper.UrpLoginMapper;
import com.simon.cloud.word.urp.mapper.UrpUserBaseMapper;
import com.simon.cloud.word.urp.service.UrpUserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UrpUserBaseServiceImpl implements UrpUserBaseService {

    @Autowired
    UrpUserBaseMapper urpUserBaseMapper;

    @Autowired
    UrpLoginMapper urpLoginMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public ReturnValue createUrpUser(UrpUserVO record) {
        //生成基本用户信息
        UrpUserBase userBase = new UrpUserBase();
        userBase.setUserStatus(UserStatusEnum.NORMAL.getCode());
        userBase.setAddTime(new Date());
        urpUserBaseMapper.insertSelective(userBase);
        //生成用户PC登陆信息
        UrpLogin login = new UrpLogin();
        login.setUserId(userBase.getId());
        login.setAddTime(new Date());
        login.setLoginName(record.getLoginName());
        login.setLoginPassword(passwordEncoder.encode(record.getLoginPassword()));
        login.setLoginType(LoginTypeEnum.WEB_NORMAL.getCode());
        return ReturnValue.success(urpLoginMapper.insertSelective(login)).setMessage("注册成功");
    }
}
