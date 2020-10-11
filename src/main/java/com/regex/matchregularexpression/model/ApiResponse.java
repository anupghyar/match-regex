package com.regex.matchregularexpression.model;

public class ApiResponse {

    String match;
    boolean error = false;

    public ApiResponse() {
    }

    public ApiResponse(String match, boolean error) {
        this.match = match;
        this.error = error;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
