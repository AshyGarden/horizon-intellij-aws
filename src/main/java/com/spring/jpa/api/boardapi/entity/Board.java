package com.spring.jpa.api.boardapi.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//public class Board {
//
//    @Id
//    //@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "board_no")
//    private int number; //pk
//
//    @Column(name = "article_main")
//    private String main; //메인 기사 (맨위의 기사) -이게 들어오면 title을 안씀
//
//    @Column(name = "article_name")
//    private String title; //기사제목(일반) - 이게 들어오면 main을 안씀
//
//    @Column(name = "article_date")
//    private String date; //기사날짜
//
//    @Column(name = "article_time")
//    private String time; //기사시간(07시)
//
//    @Column(name = "article_img1")
//    private String img1; //이미지 경로1
//
//    @Column(name = "article_img1_eff")
//    private String img1Eff; //이미지 경로1 효과
//
//    @Column(name = "article_comment")
//    private String comment; //설명
//
//}
