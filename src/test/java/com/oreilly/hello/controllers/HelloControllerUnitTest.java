package com.oreilly.hello.controllers;

import org.junit.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.Assert.assertEquals;

public class HelloControllerUnitTest {

    @Test
    public void sayHello() {
        HelloController helloController = new HelloController();
        String result = helloController.sayHello("Dolly", new BindingAwareModelMap());
        assertEquals("hello", result);
    }
}
