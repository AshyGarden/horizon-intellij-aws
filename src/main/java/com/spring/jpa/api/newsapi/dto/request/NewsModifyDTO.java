package com.spring.jpa.api.newsapi.dto.request;


import javax.persistence.Column;

public class NewsModifyDTO { //년 월에 대해 다시 결과값을 받아와 게시글을 다르게 줘야함.

    private int articleNumber; //pk

    private String articleImg; // 주 이미지
    private String interactionImg; // 보조 이미지(이펙트 등)

    private String articleTitle; //기사제목

    private int articleTime; //기사시간

    private int articleDate; //기사

}
