package com.patterns.aop.calculator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.patterns.aop.calculator.Calculator")
    public void logEvent() {
        LOGGER.info("Logging the event");
    }
}