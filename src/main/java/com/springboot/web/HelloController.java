package com.springboot.web;


import com.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}

/*

@RestController
컨트롤러를 JSON 반환하는 컨트롤러로 변환

@GetMapping
HTTP Method인 Get의 요청을 받을 수 있게 API 생성
-> /hello 요청이 오면 hello를 return

@RequestParam
와부에서 API로 넘긴 파라미터를 가져오는 어노테이션


 */