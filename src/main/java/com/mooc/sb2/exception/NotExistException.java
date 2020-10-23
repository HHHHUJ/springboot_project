package com.mooc.sb2.exception;

public class NotExistException extends RuntimeException {
    private static final long serialVersionUID = -277891939915574508L;
    private String id;

    public NotExistException(String id) {
        super("Not Exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
