package com.spring.k8s.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFei
public class K8SDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8SDiscoveryApplication.class, args);
	}

}
