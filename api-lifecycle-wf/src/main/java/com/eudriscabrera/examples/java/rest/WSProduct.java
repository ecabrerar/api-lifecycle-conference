/**
 * 
 */
package com.eudriscabrera.examples.java.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeIn;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;
import org.eclipse.microprofile.openapi.annotations.security.SecuritySchemes;



/**
 * @author ecabrerar
 * @since Jul 31, 2021
 */

/*
@SecuritySchemes(value = {@SecurityScheme(securitySchemeName = "api_key",
type = SecuritySchemeType.APIKEY,
apiKeyName = "api_key",
in = SecuritySchemeIn.HEADER),
@SecurityScheme(securitySchemeName = "http_secure",
	  type = SecuritySchemeType.HTTP,
	  scheme = "bearer",
	  bearerFormat = "JWT")}
)
*/
@Path("/catalog")
public class WSProduct {

	@GET
	@Path("/products")
	@Produces("application/json")
	@Operation(summary = "Get all products")
	@APIResponse(
	        responseCode = "200",
	        description = "Get all products.",
	        content = @Content(
	            mediaType = "application/json",
	            schema = @Schema(
	                type = SchemaType.OBJECT,
	                implementation = ProductList.class)))
	public Response getProducts() {		


		return Response.ok(new ProductResource().getProducts()).build();

	}

	@GET
	@Path("/product/{code}")
	@Produces("application/json")
	@Operation(summary = "Get a product by code")
	@APIResponses(
	        value = {
	            @APIResponse(
	                responseCode = "404", 
	                description = "Missing code",
	                content = @Content(mediaType = "text/plain")),
	            @APIResponse(
	                responseCode = "200",
	                description = "Get a product by code.",
	                content = @Content(mediaType = "application/json",
	                schema = @Schema(implementation = Product.class))) })
	public Response getSpeaker(@PathParam("code") String code) {
		
		return Response.ok(new ProductResource().getProducts().stream()
				.filter(product -> product.getCode().equals(code))
				.map(product -> product)
				.collect(Collectors.toList())).build();
	}

	static class ProductResource {

		private List<Product> getProducts() {

			List<Product> products = new ArrayList<>();
			products.add(new Product("PDU-10", "Baseball Glove", "Baseball Glove", 72, 79.84));
			products.add(new Product("PDU-11", "Baseball Bat", "Baseball Bat", 20, 179.84));
			products.add(new Product("PDU-12", "Baseball Jersey", "Baseball Jersey", 100, 50.84));
			products.add(new Product("PDU-13", "Baseball Cap", "Baseball Cap", 30, 69.84));
			products.add(new Product("PDU-15", "Softball Glove", "Softball Glove", 32, 79.84));

			return products;
		}
	}

	interface IPrueba{
		void prender();
		void procesar(String s);
		void apagar();
	}
	
	
	
}
