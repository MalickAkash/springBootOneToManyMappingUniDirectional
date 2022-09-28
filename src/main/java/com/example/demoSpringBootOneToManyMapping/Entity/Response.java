package com.example.demoSpringBootOneToManyMapping.Entity;

import org.springframework.http.HttpStatus;

public class Response {
    public HttpStatus status;
    public String message;
    public Object object;

    public Response() {
    }

    public Response(HttpStatus status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage(String s) {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject(Object object) {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
