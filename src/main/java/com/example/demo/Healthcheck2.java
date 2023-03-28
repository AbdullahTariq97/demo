package com.example.demo;

import org.springframework.boot.actuate.health.AbstractReactiveHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class Healthcheck2 extends AbstractReactiveHealthIndicator {

    @Override
    protected Mono<Health> doHealthCheck(Health.Builder builder) {
        return Mono.just(Health.down().withDetails(Map.of("componentName", "downstream2")).build());
    }
}
