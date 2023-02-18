package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
@SpringBootApplication
스프링 부트 자동 설정, 스프링 Bean 읽기와 생성 등 자동으로 해줌
그리고 이 애노테이션을 기준으로 설정을 읽기 때문에 클래스는 항상 프로젝트 최상단에 위치해야 함

SpringApplication.run
내장 WAS 실행, 톰캣 설치 필요 없다. -> 언제 어디서나 같은 환경에서 스프링 부트 배포 가능
 */
