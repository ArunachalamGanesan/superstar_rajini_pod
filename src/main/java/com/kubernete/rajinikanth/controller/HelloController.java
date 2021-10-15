package com.kubernete.rajinikanth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rajini")
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> sendResponse(){
        String response = new String("Kanna nan oruthdava sonna nooru thadava sonna mathiri");
        log.info("response: {}",response);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
