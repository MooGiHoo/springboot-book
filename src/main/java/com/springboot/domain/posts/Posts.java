package com.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}


/*

주요 어노테이션을 클래스에 가깝게
@Entity
JPA 어노테이션
테이블과 링크될 클래스임을 표시, 카멜케이스 -> 언더스코어

@NoArgsConstructor -> 기본 생성자 자동 추가
@Getter -> 클래스 내 모든 필드 Getter 메서드 추가
lombok의 어노테이션

@Id
테이블의 PK
@GeneratedValue
PK의 생성 규칙, strategy = GenerationType.IDENTITY -> AutoIncrement

@Column
테이블의 컬럼 선언, 기본값 외에 추가로 변경하고 싶으면 사용함
선언하지 않아도 필드는 자동으로 컬럼이 된다.

@Builder
해당 클래스의 빌더 패턴 클래스 생성



 */