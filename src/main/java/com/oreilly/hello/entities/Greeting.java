package com.oreilly.hello.entities;

import java.util.Objects;

public class Greeting {
    private String message = "Hello, World!";

    public Greeting(String s) {
        message = s;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Greeting)) return false;
        Greeting greeting = (Greeting) o;

        return Objects.equals(message, greeting.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
