package com.d2s.cotizador.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggerUtil {
    private final Logger logger;

    public LoggerUtil(Class cls) {
        this.logger = LoggerFactory.getLogger(cls);
    }

    public Logger getLogger() {
        return logger;
    }
}
