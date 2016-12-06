package com.sony.retro.retro;

/**
 * Created by sony on 12/6/2016.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}