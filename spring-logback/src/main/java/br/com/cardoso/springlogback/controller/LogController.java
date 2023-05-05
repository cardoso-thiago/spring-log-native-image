package br.com.cardoso.springlogback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("Logando com Logback");
        return "Hello World";
    }
}
