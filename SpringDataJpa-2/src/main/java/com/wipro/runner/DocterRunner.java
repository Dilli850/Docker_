package com.wipro.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wipro.service.IDocterService;

@Component
public class DocterRunner implements CommandLineRunner {

    @Autowired
    private IDocterService docterService;

    // Logger is now a class-level constant, initialized properly
    private static final Logger logger = LoggerFactory.getLogger(DocterRunner.class);

    @Override
    public void run(String... args) throws Exception {
        // Replacing System.out.println with logger
        String isDeleted = docterService.deleteDocterById(13);

        // Log the result with appropriate log level (e.g., info)
        if (isDeleted != null) {
            logger.info("Doctor with ID 13 was deleted successfully.");
        } else {
            logger.warn("Doctor with ID 13 could not be found or deleted.");
        }	
    }
}
