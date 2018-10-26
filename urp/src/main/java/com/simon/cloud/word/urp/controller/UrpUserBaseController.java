package com.simon.cloud.word.urp.controller;

import com.simon.cloud.word.api.framework.web.ReturnValue;
import com.simon.cloud.word.api.vo.UrpUserVO;
import com.simon.cloud.word.urp.service.UrpUserBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("urpUserBase")
public class UrpUserBaseController {

    @Autowired
    UrpUserBaseService urpUserBaseService;

    @PostMapping("createUrpUser")
    public ReturnValue createUrpUser(@RequestBody UrpUserVO record){
        return urpUserBaseService.createUrpUser(record);
    }


}
