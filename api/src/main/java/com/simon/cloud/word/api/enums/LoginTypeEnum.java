package com.simon.cloud.word.api.enums;

public enum LoginTypeEnum {

    WEB_NORMAL("1","PC端登陆普通登陆"),
    WEB_WECHAT("2","PC端微信登陆");

    private String code;
    private String name;

    LoginTypeEnum(String code,String name){
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
