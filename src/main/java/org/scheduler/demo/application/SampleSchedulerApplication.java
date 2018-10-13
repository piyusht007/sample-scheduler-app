package org.scheduler.demo.application;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = "org.scheduler.demo")
@SpringBootApplication
@EnableScheduling
public class AsyncTransactionProcessorApplication {

    public static void main(final String[] args) {
        new SpringApplicationBuilder(AsyncTransactionProcessorApplication.class).web(WebApplicationType.NONE).run(args);
    }
}
