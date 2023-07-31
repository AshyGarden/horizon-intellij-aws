package com.spring.jpa.api.newsapi.entity;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder @Entity
@Table(name = "news_effect")
public class Effect {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_no")
    private int aNo; //기사 번호

    @Column(name = "event_keyword1")
    private String ekw1; //제목 키워드1

    @Column(name = "event_keyword2")
    private String ekw2; //제목 키워드2

    @Column(name = "image1_effect")
    private boolean img1Eff; //반짝반짝 효과

    @Column(name = "img2_moving_direction")
    private int img2MovingDir;

    @Column(name = "image2_effect")
    private boolean img2Eff; //반짝반짝 효과

    @Column(name = "image2_distance")
    private boolean img2Dist; //2번 이미지의 이동거리

}
