/**
 * 
 */
package com.sample.api.product.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main application component for REST Controller.
 * @author plamb1
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.sample.api.product", "com.sample.api.model"})
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

}