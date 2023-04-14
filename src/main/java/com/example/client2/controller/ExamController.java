package com.example.client2.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")
public class ExamController {



    private final RestTemplate restTemplate;

    public ExamController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/get")
    public ResponseEntity<String> getString(){

        ResponseEntity<String> rest = restTemplate.getForEntity("http://localhost:8443/api/get",String.class);
        return ResponseEntity.ok(rest.getBody());
    }

}
