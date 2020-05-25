package com.wsy.enums;

public enum MsgEnums {
    LOGIN_FAILED(1,"登陆失败"),
    LOGIN_SUCCESS(0,"登陆成功"),
    SESSION_MSG(2,"session信息")
    ;

    private Integer code;
    private String msg;

    private MsgEnums(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
