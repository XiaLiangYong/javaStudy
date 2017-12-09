package com.example.demo.hello;

/**
 * Created by alibeibei on 2017/12/6.
 */
public class StorageException extends RuntimeException {

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
