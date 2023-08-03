package com.spring.jpa.api.solarsystemapi.dto.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CelestialEssentialRequestDTO {

    @NotBlank
    private int celNumber; //천체 번호

    @NotBlank
    private String celNameKor; //천체의 이름 - 국문(태양, 달 등)

    @NotBlank
    private String celNameEng; //천체의 이름 - 영문

    @NotBlank
    private double diameter; //행성 평균 지름(Km)

    @NotBlank
    private double surface; //행성 표면적(km^2)

    @NotBlank
    private double mass; //행성 질량

    @NotBlank
    private double rotation; //행성 자전 주기

    @NotBlank
    private String comment; //천체 설명

}
