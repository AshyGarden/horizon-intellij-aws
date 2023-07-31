package com.spring.jpa.api.newsapi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder @Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_no")
    private int aNo; //기사 번호

    @Column(name = "article_img1")
    private String img1; //기사 이미지1

    @Column(name = "article_img2")
    private String img2; //기사 이미지2

    @Column(name = "article_title")
    private String title; //기사 제목

    @Column(name = "article_time")
    private int time; //기사 시간

    @Column(name = "article_date")
    private LocalDateTime date; //기사 게시 날짜




}
