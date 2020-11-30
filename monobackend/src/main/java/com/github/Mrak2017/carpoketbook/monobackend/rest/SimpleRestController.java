package com.github.Mrak2017.carpoketbook.monobackend.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping
    public String getSimpleData() {
        return "SimpleRestController working";
    }
}
