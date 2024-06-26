package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootMvcProj19TilesIntegrationApplication   {
	
	@Bean
    public TilesConfigurer createTilesConfigurer() {
        TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions("/WEB-INF/tiles.xml");
        return configurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver() {
        TilesViewResolver resolver = new TilesViewResolver();
        return resolver;
    }
    
	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj19TilesIntegrationApplication.class, args);
	}

}
