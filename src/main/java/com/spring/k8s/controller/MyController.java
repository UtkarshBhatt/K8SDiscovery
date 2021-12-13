package com.spring.k8s.controller;

import com.spring.k8s.client.MyClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("k8s")
@RequiredArgsConstructor
public class MyController {

    private final MyClient myClient;

    @GetMapping("/test")
    public String getTestMsg() {
        String mapping = myClient.getMapping();
        System.out.println(mapping);
        return "TEST";
    }

}
