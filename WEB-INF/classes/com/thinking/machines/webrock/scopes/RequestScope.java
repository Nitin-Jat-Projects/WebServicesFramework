package com.thinking.machines.webrock.scopes;

public class RequestScope
{
    private HttpRequest httpRequest;

    // constructor
    public RequestScope(HttpRequest httpRequest) {
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
