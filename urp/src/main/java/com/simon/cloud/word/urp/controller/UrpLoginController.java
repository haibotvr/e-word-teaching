package com.simon.cloud.word.urp.controller;

import com.simon.cloud.word.api.framework.annotation.BeanValid;
import com.simon.cloud.word.api.framework.web.ReturnValue;
import com.simon.cloud.word.api.vo.UrpUserVO;
import com.simon.cloud.word.urp.service.UrpLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("urpLogin")
@RestController
public class UrpLoginController {

    @Autowired
    private UrpLoginService urpLoginService;

    @PostMapping("login")
    @BeanValid
    public ReturnValue login(@RequestBody UrpUserVO record){
        return urpLoginService.login(record);
    }

}
