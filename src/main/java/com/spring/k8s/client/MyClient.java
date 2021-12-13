package com.spring.k8s.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "myClient")
public interface MyClient {

    @GetMapping("/test")
    String getMapping();

}
