package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.zaxxer.hikari.HikariConfig;

import jakarta.servlet.MultipartConfigElement;

@SpringBootApplication
public class BootMvcProj17FileUploadingDownloadingApplication {
	
	@Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(DataSize.ofMegabytes(3)); // Set maximum file size to 3 MB
        factory.setMaxRequestSize(DataSize.ofMegabytes(3)); // Set maximum request size to 3 MB
        return factory.createMultipartConfig();
	}
    @Bean(name = "multipartResolver")
    public MultipartResolver multipartResolver() {
        return new StandardServletMultipartResolver();
    }
    
    @Bean
    public ViewResolver createIRVR() {
    	InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    	resolver.setPrefix("/WEB-INF/pages/");
    	resolver.setSuffix(".jsp");
    return resolver;
    }

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj17FileUploadingDownloadingApplication.class, args);
	}

}
