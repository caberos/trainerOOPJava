package com.jalasoft.project.exceptions;

import com.jalasoft.project.response.response.Response;

/**
 * @author HP
 * @version 1.1
 */
public class ErrorResponse<T> extends Response {
    private String error;

    public ErrorResponse(T status, String error) {
        super(status);
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
