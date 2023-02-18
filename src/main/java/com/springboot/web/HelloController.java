package com.springboot.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

/*

@RestController
컨트롤러를 JSON 반환하는 컨트롤러로 변환

@GetMapping
HTTP Method인 Get의 요청을 받을 수 있게 API 생성
-> /hello 요청이 오면 hello를 return

 */