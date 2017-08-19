package io.behappy.service;

public interface PrintService {
    void print(String message);

    void print(String... messages);

    void print(Object obj);

    void print(Object... objects);
}
