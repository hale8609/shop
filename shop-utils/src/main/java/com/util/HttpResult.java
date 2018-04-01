package com.util;

public class HttpResult {

    private String code;
    private String msg;
    private Object result;


    public HttpResult() {
        code = CODE_SUCCESS;
        msg = "成功";
    }

    public HttpResult(Object result) {
        code = CODE_SUCCESS;
        msg = "成功";
        this.result = result;
    }

    public HttpResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCodeAndMsg(String code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public interface CodeConstants{
        String SUCCESS="0000";
    }

    public static final String CODE_SUCCESS = "0000";
    public static final String CODE_FAILED = "0001";

    /*登录失效*/
    public static final String CODE_LOGIN_FAILURE = "0002";
    public static final String PARAMETER_CAN_NOT_BE_EMPTY = "0003";

    /*账号或者密码不能为空*/
    public static final String CODE_ACCOUNT_OR_PASSWORD_CAN_NOT_BE_NULL = "1001";
    /*账号或者密码不正确*/
    public static final String CODE_ACCOUNT_OR_PASSWORD_INCORRECT = "1002";



}
