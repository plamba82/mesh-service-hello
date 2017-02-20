package com.sample.api.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.sample.api.model.Product;

@Component
public class ProductsApiController implements ProductsApi {

		@Override
		public ResponseEntity<List<Product>> productsGet(
			 @RequestParam(value = "sku", required = true) String sku,
			@RequestParam(value = "limit", required = true) int limit) {
		// do some magic!
		System.out.println("Product details");
		List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		product.setProductId("MNAC2LL/A");
		products.add(product);
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}

}
