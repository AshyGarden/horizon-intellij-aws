package com.spring.jpa.api.solarsystemapi.entity;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity @Table(name = "celestial_essential")
public class CelestialEssential {

    //태양, 달을 포함하는 천체 entity
    //태양 -
    //달 -
    //이외의 행성 not null

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "celestial_number")
    private int celNumber; //천체 번호

    @Column(name = "celestial_name_kor", unique = true, nullable = false)
    private String celNameKor; //천체의 이름 - 국문(태양, 달 등)

    @Column(name = "celestial_name_eng", unique = true, nullable = false)
    private String celNameEng; //천체의 이름 - 영문

    @Column(name = "celestial_diameter", nullable = false)
    private double diameter; //행성 평균 지름(Km)

    @Column(name = "celestial_surface", nullable = false)
    private double surface; //행성 표면적(km^2)

    @Column(name = "celestial_mass", nullable = false)
    private double mass; //행성 질량

    @Column(name = "celestial_rotation", nullable = false)
    private double rotation; //행성 자전 주기

    @Column(name = "celestial_comment", length = 3000)
    private String comment; //천체 설명

}