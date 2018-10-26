package com.simon.cloud.word.api.enums;

public enum UserStatusEnum {

    NORMAL("1", "正常"),
    DELETE("2", "删除"),
    FROZEN("3", "冻结");

    private String code;
    private String name;

    UserStatusEnum(String code, String name){
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
