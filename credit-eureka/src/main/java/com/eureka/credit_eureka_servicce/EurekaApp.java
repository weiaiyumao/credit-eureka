package com.eureka.credit_eureka_servicce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {
    	SpringApplication.run(EurekaApp.class, args);
    }
    
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
        builder.sources(this.getClass());  
        return super.configure(builder);  
    }  
}
