package com.backend.uppgift2.models;

/**
 * Created by Max Erling
 * Date: 2021-04-09
 * Copyright: MIT
 * Class: Java20B
 */
public class Response {

    private boolean status;
    private String message;

    public Response(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
