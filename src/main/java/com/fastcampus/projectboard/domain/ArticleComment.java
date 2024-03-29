package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;    //게시글(ID) - 객체지향적 표현 : Class를 자료형으로 사용
    private String content;     //본문

    private LocalDateTime createdAt;    //생성일시
    private String createdBy;           //생성자
    private LocalDateTime modifiedAt;   //수정일시
    private String modifiedBy;          //수정자
}
