package com.eudriscabrera.examples.java.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "API Lifecycle", version = "1.0",description = "Batflip API", contact = @Contact(name = "BatFlip Inc",email = "info@batlic.com")))
@ApplicationPath("/api")
public class RestApplication extends Application {

}
