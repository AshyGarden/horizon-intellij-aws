package com.spring.jpa.api.solarsystemapi.dto.response;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import lombok.*;

import javax.validation.constraints.NotBlank;


@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
public class CelestialEssentialResponseDTO {

    private int celNumber; //천체 번호
    private String celNameKor; //천체의 이름 - 국문(태양, 달 등)
    private String celNameEng; //천체의 이름 - 영문
    private double diameter; //행성 평균 지름(Km)
    private double surface; //행성 표면적(km^2)
    private double mass; //행성 질량
    private double rotation; //행성 자전 주기
    private String comment; //천체 설명
    public CelestialEssentialResponseDTO(CelestialEssential ce){
        celNumber = ce.getCelNumber();
        celNameKor = ce.getCelNameKor();
        celNameEng = ce.getCelNameEng();
        diameter = ce.getDiameter();
        surface = ce.getSurface();
        mass = ce.getMass();
        rotation = ce.getRotation();
        comment = ce.getComment();
    }

}
