package com.amazonaws.serverless.sample.springboot2;

import com.amazonaws.serverless.sample.springboot2.controller.PetsController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * <a href="https://github.com/awslabs/aws-serverless-java-container/wiki/Quick-start---Spring-Boot2#avoid-component-scan">
 * Forgo {@link SpringBootApplication} to avoid running a {@link ComponentScan}
 * </a>
 */
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@Import({
//        PetsController.class,
//        ColdStartOptimizations.class
//})
@SpringBootApplication
public class Application {

    // silence console logging
    @Value("${logging.level.root:OFF}")
    String message = "";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}