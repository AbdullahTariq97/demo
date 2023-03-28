package com.example.demo;

import org.springframework.boot.actuate.health.AbstractReactiveHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class HealthCheck1 extends AbstractReactiveHealthIndicator {

    @Override
    protected Mono<Health> doHealthCheck(Health.Builder builder) {
        return Mono.just(Health.up().withDetails(Map.of("componentName", "downstream1")).build());
    }
}
