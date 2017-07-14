package com.hubezoo.frontendpro.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan("com.hubezoo.frontendpro")
@EnableAutoConfiguration
@SpringBootApplication
public class StaticResources extends WebMvcConfigurerAdapter  {

    private static String staticResourcesPath="/assets/**";
 
 
 
 public static void main(String[] args) {
        SpringApplication.run(StaticResources.class, args);
    }
    
 @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	 System.out.println("Entered into addResources");
        registry.addResourceHandler("/assets/").addResourceLocations(staticResourcesPath);
        
    }    
}
