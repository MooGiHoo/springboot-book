package com.springboot.web.domain.posts;


import com.springboot.domain.posts.Posts;
import com.springboot.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기() {
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("KimNamGyu")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}

/*

@After
Junit에서 단위 테스트가 끝날 때마다 수행되는 메서드 지정
잔여 데이터를 지우는 용도로 사용한다

postsRepository.save
테이블 posts에 insert/update 쿼리 실행
id 값이 있으면 update, 없으면 insert

postsRepository.findAll
테이블 posts에서 모든 데이터 조회

@SpringBootTest
H2 데이터베이스를 자동으로 실행해준다.


 */
