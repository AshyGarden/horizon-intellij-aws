package com.spring.jpa.api.boardapi.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ano")
    private int articleNumber; //pk

    private String articleImg; // 주 이미지
    private String interactionImg; // 보조 이미지(이펙트 등)

    @Column(nullable = false)
    private String articleTitle; //기사제목

    @Column(nullable = false)
    private int articleTime; //기사시간

    @Column(nullable = false)
    private int articleDate; //기사
}
