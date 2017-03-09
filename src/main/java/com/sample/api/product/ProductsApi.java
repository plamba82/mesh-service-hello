package com.sample.api.product;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.api.model.Product;

/**
 * testAPI for product
 * @author plamb1
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
@RestController
@RequestMapping("/")
public interface ProductsApi {

    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> productsGet(@RequestParam(value = "sku", required = true) String sku,
         @RequestParam(value = "limit", required = true) int limit);

}
