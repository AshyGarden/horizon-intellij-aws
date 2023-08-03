package com.spring.jpa.api.solarsystemapi.entity;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "celestial_optional")
public class CelestialOptional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "celestial_number")
    private int celNumber; //천체 번호

    @Column(name = "celestial_earthLike")
    private boolean earthLike; //지구형 행성(수금지화), 목성형 행성(목토천해)

    @Column(name = "celestial_revolution")
    private double revolution; //행성 공전 주기

    @Column(name = "celestial_orbitRadius")
    private double orbitRadius; //행성 궤도 반지름

    @Column(name = "celestial_satellites")
    private int satellites; //행성의 위성 수

    @Column(name = "celestial_sat1")
    private String satellite1; //대표 위성1

    @Column(name = "celestial_sat2")
    private String satellite2; //대표 위성2

    public CelestialOptional toEntity() {
        return CelestialOptional.builder()
                .celNumber(this.celNumber)
                .earthLike(this.earthLike)
                .revolution(this.revolution)
                .orbitRadius(this.orbitRadius)
                .satellites(this.satellites)
                .satellite1(this.satellite1)
                .satellite2(this.satellite2).build();

    }
}
