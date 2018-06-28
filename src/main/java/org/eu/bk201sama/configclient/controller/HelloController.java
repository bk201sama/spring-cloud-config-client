package org.eu.bk201sama.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${nickName}")
    private String nickName;

    @GetMapping("/hello")
    public String hello() {
        return "hello " + nickName;
    }

}
