package com.fudan.reservation.dto;

import java.io.Serializable;

/**
 * @autor yud1
 * @date 2023/5/5 20:15
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private Integer code;

    private String message;

    private T data;

    public Result() {
    }

    public Result(boolean success, Integer code, String message, T data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    /**
     *  成功返回时调用
     */
    public static <T> Result<T> ofSuccess(T data) {
        return new Result<T>(true, 200, "success", data);
    }

    /**
     *
     * 错误返回时调用
     */
    public static <T> Result<T> ofFail(Integer code, String message) {
        return new Result<T>(false, code, message);
    }
}
