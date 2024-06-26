
package com.nt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class BootMvcProj16FileUploadingDownloadingApplication {
	
	@Bean(name="multipartResolver")
	public CommonsMultipartResolver multipartResolver(){
	    CommonsMultipartResolver multipart = new CommonsMultipartResolver();
	    multipart.setMaxUploadSize(3 * 1024 * 1024);
	    return multipart;
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj16FileUploadingDownloadingApplication.class, args);
	}

}
