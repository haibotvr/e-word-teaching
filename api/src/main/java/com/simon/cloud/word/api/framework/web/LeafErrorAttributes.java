package com.simon.cloud.word.api.framework.web;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

@Component
public class LeafErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes request, boolean includeStackTrace) {
        Map<String, Object> resultMap = super.getErrorAttributes(request, includeStackTrace);
        resultMap.put("code", ReturnValue.error().getCode());
        resultMap.put("success", false);
        return resultMap;
    }
}
