package com.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}






/*

MyBatis에서는 DAO(Data Access Object) 라고하는 DB Layer 접근자
JPA에서는 Repository라고 하며 인터페이스를 사용
JpaRepository<Entity 클래스, PK 타입>을 상속하면 기본적인 CRUD 메서드가 생성된다.
Entity 클래스와 리포는 반드시 같은 패키지에서 관리한다.

 */