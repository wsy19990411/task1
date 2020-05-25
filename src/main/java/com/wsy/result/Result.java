package com.wsy.result;

import com.wsy.enums.MsgEnums;

/**
 * @program: task1
 * @description:
 * @author: wsy
 * @create: 2020-05-18 16:11
 **/
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    private Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }
    private Result(MsgEnums codeMsg){
        if(codeMsg==null) return;
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    /*
    成功时的Result
     */
    public static <T> Result<T> success(T data){
        return new Result<>(data);
    }

    /*
    失败时的Result
    */
    public static <T> Result<T> error(MsgEnums codeMsg){
        return new Result<>(codeMsg);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
