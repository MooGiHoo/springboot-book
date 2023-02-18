package com.springboot.web.dto;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

/*

JUnit의 assertThat이 아닌 assertj의 assertThat을 사용한다 (둘 다 테스트)
장점 - 추가적으로 필요한 라이브러리가 없다, 자동완성을 확실하게 지원해준다.



 */