package com.example.demo;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MetricsConfiguration {

    @Bean
    Gauge downstreamDependencyGauge(CollectorRegistry collectorRegistry) {
        return Gauge.build()
                .name("downstream_dependency")
                .help("Metrics for downstream dependency health.")
                .labelNames("dependency")
                .register(collectorRegistry);
    }

    @Bean
    CollectorRegistry collectorRegistry(){
        return new CollectorRegistry();
    }
}
