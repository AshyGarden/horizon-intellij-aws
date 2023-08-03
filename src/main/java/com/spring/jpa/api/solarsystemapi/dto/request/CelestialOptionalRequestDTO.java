package com.spring.jpa.api.solarsystemapi.dto.request;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Getter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CelestialOptionalRequestDTO {

    @NotBlank
    private int celNumber; //천체 번호

    private boolean earthLike; //지구형 행성(수금지화), 목성형 행성(목토천해)
    private double revolution; //행성 공전 주기
    private double orbitRadius; //행성 궤도 반지름
    private int satellites; //행성의 위성 수
    private String satellite1; //대표 위성1
    private String satellite2; //대표 위성2
}
