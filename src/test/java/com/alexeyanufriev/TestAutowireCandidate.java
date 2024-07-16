package com.alexeyanufriev;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.task.ThreadPoolTaskExecutorBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.Executor;

@SpringBootTest
@EnableAutoConfiguration
public class TestAutowireCandidate {

    @Test
    void test() {
    }

    @SpringBootConfiguration
    static class TestConfig {

        @Bean(autowireCandidate = false)
        Executor executor() {
            return new ThreadPoolTaskExecutorBuilder()
                    .corePoolSize(1)
                    .maxPoolSize(2)
                    .build();
        }

    }

}
