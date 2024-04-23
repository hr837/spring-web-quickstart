package com.duang.springwebquickstart.pojo;

public class Result {
    private Boolean status;
    private String message;
    private Integer code;

    private Object data;


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(Boolean status, String message, Integer code, Object data) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;
    }


    public static Result success() {
        return new Result(true, "处理成功", 0, null);
    }

    public static Result success(Object data) {
        return new Result(true, "处理成功", 0, data);
    }

    public static Result error(String message) {
        return new Result(false, message, -1, null);
    }

    public static Result error(String message, Integer code) {
        return new Result(false, message, code, null);
    }


    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", code=" + code +
                '}';
    }
}
