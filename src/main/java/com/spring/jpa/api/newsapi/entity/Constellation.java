package com.spring.jpa.api.newsapi.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "board")
public class Constellation {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_no")
    private int number; //pk

    @Column(name = "article_title")
    private String title; //기사제목(일반) - 이게 들어오면 main을 안씀

    @Column(name = "article_date")
    private String date; //기사 날짜

    @Column(name = "article_time")
    private String time; //기사시간(07시)

    @Column(name = "article_img1")
    private String img1; //이미지 경로1

    @Column(name = "article_img2")
    private String img2; //이미지 경로2

    @Column(name = "article_comment", length = 3000)
    private String comment; //설명

}