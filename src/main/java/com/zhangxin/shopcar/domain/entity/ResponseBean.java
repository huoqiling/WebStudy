package com.zhangxin.shopcar.domain.entity;

/**
 * 返回
 */
public class ResponseBean {

    public static final String SUCCESS = "success";
    public static final String FAIL = "fail";

    private String responseMsg;
    private String errorMessage;
    private Object data;

    public ResponseBean(String responseMsg, Object data) {
        this.responseMsg = responseMsg;
        this.data = data;
    }

    public ResponseBean(String responseMsg, String errorMessage) {
        this.responseMsg = responseMsg;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
