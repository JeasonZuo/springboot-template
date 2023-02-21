package com.jeasonzuo.utils;

public enum ResponseCode {
    /**success**/
    RC100(100,"Succeed"),
    /**fail**/
    RC999(999,"Failed"),
    /**access_denied**/
    RC401(401,"Access denied"),
    /**server error**/
    RC500(500,"Server error"),

    INVALID_TOKEN(2001,"访问令牌不合法"),
    ACCESS_DENIED(2003,"没有权限访问该资源"),
    CLIENT_AUTHENTICATION_FAILED(1001,"客户端认证失败"),
    USERNAME_OR_PASSWORD_ERROR(1002,"用户名或密码错误"),
    UNSUPPORTED_GRANT_TYPE(1003, "不支持的认证模式");


    /**自定义状态码**/
    private final int code;
    /**自定义描述**/
    private final String message;

    ResponseCode(int code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

