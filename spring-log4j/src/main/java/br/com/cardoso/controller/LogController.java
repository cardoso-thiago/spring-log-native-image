package br.com.cardoso.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger LOGGER = LogManager.getLogger(LogController.class);

    @GetMapping("/hello")
    public String hello() {
        LOGGER.info("Logando com Log4J");
        return "Hello World";
    }
}
