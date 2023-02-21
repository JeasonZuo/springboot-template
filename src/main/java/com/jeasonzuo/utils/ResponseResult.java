package com.jeasonzuo.utils;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private int resCode;
    private String message;
    private T data;
    private long timestamp ;

    public ResponseResult (){
        this.timestamp = System.currentTimeMillis();
    }


    public static <T> ResponseResult<T> success(T data) {
        ResponseResult<T> ResponseResult = new ResponseResult<>();
        ResponseResult.setResCode(ResponseCode.RC100.getCode());
        ResponseResult.setMessage(ResponseCode.RC100.getMessage());
        ResponseResult.setData(data);
        return ResponseResult;
    }

    public static <T> ResponseResult<T> fail(int code, String message) {
        ResponseResult<T> ResponseResult = new ResponseResult<>();
        ResponseResult.setResCode(code);
        ResponseResult.setMessage(message);
        return ResponseResult;
    }
}