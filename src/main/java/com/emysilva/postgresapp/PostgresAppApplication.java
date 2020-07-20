package com.emysilva.postgresapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostgresAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresAppApplication.class, args);
    }

}
