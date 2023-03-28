package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;
import uk.sky.alto.webflux.healthcheck.HealthCheckHandler;

@Controller
public class HealthCheckController {

    private final HealthCheckHandler healthCheckHandler;

    @Autowired
    public HealthCheckController(HealthCheckHandler healthCheckHandler) {
        this.healthCheckHandler = healthCheckHandler;
    }

    @GetMapping("/healthcheck")
    public Mono<ResponseEntity<String>> getHealthcheck() {
        return healthCheckHandler.healthcheck();
    }
}
