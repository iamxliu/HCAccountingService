package com.hardcore.accounting.controllers;

import com.hardcore.accounting.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {


    private AtomicLong atomicLong = new AtomicLong();
    @GetMapping("v1/greeting")
    public Greeting sayHello(@RequestParam("name") String name) {
        return new Greeting(atomicLong.incrementAndGet(), String.format("Hello,%s", name));
    }
}
