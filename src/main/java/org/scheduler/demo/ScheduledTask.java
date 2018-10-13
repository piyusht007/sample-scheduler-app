package org.scheduler.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Component
public class ScheduledTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);

    @Value("${app.name}")
    private String applicationName;

    @PostConstruct
    public void init() {
        LOGGER.info("Running Application: {}", applicationName);
    }

    @Scheduled(fixedDelay = 5000)
    public void process() {
        final Instant start = Instant.now();

        LOGGER.info("Started at: {}", getCurrentDateTime(start));
        LOGGER.info("Doing something ...");

        final Instant end = Instant.now();
        
        LOGGER.info("Finished at: {}", getCurrentDateTime(end));
        LOGGER.info("Total execution time (in seconds): {}", Duration.between(start, end).getSeconds());
    }

    private LocalDateTime getCurrentDateTime(Instant instant) {
        return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
    }
}
