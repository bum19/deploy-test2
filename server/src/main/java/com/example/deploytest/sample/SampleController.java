package com.example.deploytest.sample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SampleController {
    @GetMapping
    public String helloWorld() {
        return "몸살때매 죽겠다 어우.. 근데 배포안되니까 짜증..마지막인사";
    }
}
