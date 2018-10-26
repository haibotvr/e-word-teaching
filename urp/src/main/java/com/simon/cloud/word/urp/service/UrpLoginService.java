package com.simon.cloud.word.urp.service;

import com.simon.cloud.word.api.framework.web.ReturnValue;
import com.simon.cloud.word.api.vo.UrpUserVO;

public interface UrpLoginService {

    ReturnValue login(UrpUserVO record);

}
