package com.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)

public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount  = 1000;

        mvc.perform(get("/hello/dto")
                .param("name", name)
                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));

    }
}

/*

@RunWith(SpringRunner.class)
스프링 부트 테스트와 JUnit 연결자 역할을 함

@WebMvcTest
스프링 테스트 어노테이션 중 web에 집중ㅎㄹ 수 있는 -> @Controller, @ControllerAdvice 사용 가능 / @Service, @Component, @Repository 사용 불가

@AutoWired
스프링 빈 주입

private MockMvc mvc
웹 API 테스트 시 사용, 스프링 MVC테스트의 시작점, HTTP GET,POST테스트 가능

mvc.perform()
MockMvc를 통해 /hello 주소로 HTTP GET 요청

.andExpect(status().isOk())
mvc.perform 결과 검증, HTTP Header Status 검증 -> 404, 500 과 같은 == 200인지 확인

.andExpect(content().string(hello))
mvc.perform 결과 검증, 응답 내용 검증

 */