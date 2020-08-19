package com.jalasoft.project.response.response;

/**
 * @author HP
 * @version 1.1
 */
public class OKResponse<T> extends Response {
    private String message;
    private String pid;

    public OKResponse(T status, String message, String pid) {
        super(status);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
