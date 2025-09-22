package com.thinking.machines.webrock.scopes;

import javax.servlet.http.HttpServletRequest;

public class RequestScope
{
    private HttpServletRequest httpRequest;

    // constructor
    public RequestScope(HttpServletRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    // method to set attribute
    public void setAttribute(String key, Object value) {
        httpRequest.setAttribute(key, value);
    }

    // method to get attribute
    public Object getAttribute(String key) {
        return httpRequest.getAttribute(key);
    }
}
