package com.casmir.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.casmir.org.model.FileStoragePojo;

@EnableConfigurationProperties({FileStoragePojo.class})
@SpringBootApplication
public class SpringBootFileUploadAndDownloadAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFileUploadAndDownloadAppApplication.class, args);
	}

}
