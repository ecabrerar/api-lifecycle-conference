/**
 * 
 */
package com.eudriscabrera.examples.java.rest;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

/**
 * @author ecabrerar
 * @since Jul 31, 2021
 */
@Schema(name="ProductList", description="POJO that represents the product contents.")
public class ProductList {

	
	@Schema(required = true)
    private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	 public int getTotal() {
	        return products.size();
	    }
}
