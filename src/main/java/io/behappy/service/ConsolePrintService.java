package io.behappy.service;

import java.util.Arrays;

public final class ConsolePrintService implements PrintService {

    ConsolePrintService() {}

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void print(String... messages) {
        Arrays.stream(messages).forEach(System.out::println);
    }

    @Override
    public void print(Object obj) {
        System.out.println(obj);
    }

    @Override
    public void print(Object... objects) {
        Arrays.stream(objects).forEach(System.out::println);
    }

}
