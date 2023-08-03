package com.spring.jpa.api.solarsystemapi.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import com.spring.jpa.api.storeapi.entity.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@Transactional
@Rollback(false)
public class CelestialRepositoryTest {

    @Autowired
    CelestialEssentialRepository celestialEssentialRepository;

    @Autowired
    CelestialOptionalRepository celestialOptionalRepository;

    @Autowired
    EntityManager em;

    JPAQueryFactory factory;

    @BeforeEach
    void settingObject() {
        factory = new JPAQueryFactory(em);
    }

    @BeforeEach
    void insertCelestialData(){

        //태양
        CelestialEssential sunE = CelestialEssential.builder()
                .celNumber(1).celNameKor("태양").celNameEng("Sun")
                .diameter(1392000).mass(1988550000).surface(609000)
                .rotation(27.6).comment(
                        "태양은 태양계의 중심 항성이다."
                ).build();

        CelestialOptional sunO = CelestialOptional.builder()
                .celNumber(1).build();

        //수성
        CelestialEssential mercuryE = CelestialEssential.builder()
                .celNumber(10).celNameKor("수성").celNameEng("Mercury")
                .diameter(4879.6).mass(3023).surface(75)
                .rotation(58.6).comment(
                        "수성은 1번째 행성이다."
                ).build();
        CelestialOptional mercuryO = CelestialOptional.builder()
                .celNumber(10).revolution(87.9).earthLike(true).orbitRadius(0.39)
                .satellites(0).build();

        //금성
        CelestialEssential venusE = CelestialEssential.builder()
                .celNumber(20).celNameKor("금성").celNameEng("Venus")
                .diameter(12103.7).mass(48685).surface(460)
                .rotation(243).comment(
                        "금성은 2번째 행성이다."
                ).build();
        CelestialOptional venusO = CelestialOptional.builder()
                .celNumber(20).revolution(224).earthLike(true).orbitRadius(0.72)
                .satellites(0).build();

        //지구
        CelestialEssential earthE = CelestialEssential.builder()
                .celNumber(30).celNameKor("지구").celNameEng("Earth")
                .diameter(12756).mass(59722).surface(510)
                .rotation(1).comment(
                        "지구는 태양계 3번째 행성이다."
                ).build();
        CelestialOptional earthO = CelestialOptional.builder()
                .celNumber(30).revolution(365).earthLike(true).orbitRadius(1)
                .satellites(1).satellite1("Moon").build();


        //화성
        CelestialEssential marsE = CelestialEssential.builder()
                .celNumber(40).celNameKor("화성").celNameEng("Mars")
                .diameter(6779).mass(6417.4).surface(144.3)
                .rotation(1).comment(
                        "화성는 태양계 4번째 행성이다."
                ).build();
        CelestialOptional marsO = CelestialOptional.builder()
                .celNumber(40).revolution(687).earthLike(true).orbitRadius(1.52)
                .satellites(2).satellite1("데이모스").satellite2("포보스").build();

        //목성
        CelestialEssential jupiterE = CelestialEssential.builder()
                .celNumber(50).celNameKor("목성").celNameEng("Jupiter")
                .diameter(140000).mass(18990000).surface(61419)
                .rotation(0.37).comment(
                        "목성은 태양계 5번째 행성이다."
                ).build();
        CelestialOptional jupiterO = CelestialOptional.builder()
                .celNumber(50).revolution(4332.6).earthLike(false).orbitRadius(5.2)
                .satellites(95).satellite1("이오").satellite2("가니메데").build();

        //토성
        CelestialEssential saturnE = CelestialEssential.builder()
                .celNumber(60).celNameKor("토성").celNameEng("Saturn")
                .diameter(120500).mass(18990000).surface(42700)
                .rotation(0.43).comment(
                        "토성은 태양계 6번째 행성이다."
                ).build();
        CelestialOptional saturnO = CelestialOptional.builder()
                .celNumber(60).revolution(10759.2).earthLike(false).orbitRadius(9.55)
                .satellites(145).satellite1("타이탄").satellite2("히페리온").build();

        //천왕성
        CelestialEssential uranusE = CelestialEssential.builder()
                .celNumber(70).celNameKor("천왕성").celNameEng("Uranus")
                .diameter(51100).mass(868320).surface(8084)
                .rotation(0.78).comment(
                        "천성은 태양계 7번째 행성이다."
                ).build();
        CelestialOptional uranusO = CelestialOptional.builder()
                .celNumber(70).revolution(30688.5).earthLike(false).orbitRadius(19.1)
                .satellites(27).satellite1("티타니아").build();

        //해왕성
        CelestialEssential neptuneE = CelestialEssential.builder()
                .celNumber(80).celNameKor("해왕성").celNameEng("Neptune")
                .diameter(49244).mass(1024130).surface(7618.3)
                .rotation(0.78).comment(
                        "해왕성은 태양계 8번째(마지막) 행성이다."
                ).build();
        CelestialOptional neptuneO = CelestialOptional.builder()
                .celNumber(80).revolution(60182).earthLike(false).orbitRadius(30)
                .satellites(14).satellite1("트리톤").build();


        //달
        CelestialEssential moonE = CelestialEssential.builder()
                .celNumber(301).celNameKor("달").celNameEng("Moon")
                .diameter(3474).mass(734.2).surface(37.93)
                .rotation(27).comment(
                        "달은 지구위 위성이다."
                ).build();
        CelestialOptional moonO = CelestialOptional.builder()
                .celNumber(301).revolution(27).build();


        celestialEssentialRepository.save(sunE);

        celestialEssentialRepository.save(mercuryE);
        celestialEssentialRepository.save(venusE);
        celestialEssentialRepository.save(earthE);
        celestialEssentialRepository.save(marsE);
        celestialEssentialRepository.save(jupiterE);
        celestialEssentialRepository.save(saturnE);
        celestialEssentialRepository.save(uranusE);
        celestialEssentialRepository.save(neptuneE);

        celestialEssentialRepository.save(moonE);
        ////////////////////////////////////////////////////////////

        celestialOptionalRepository.save(sunO);

        celestialOptionalRepository.save(mercuryO);
        celestialOptionalRepository.save(venusO);
        celestialOptionalRepository.save(earthO);
        celestialOptionalRepository.save(marsO);
        celestialOptionalRepository.save(jupiterO);
        celestialOptionalRepository.save(saturnO);
        celestialOptionalRepository.save(uranusO);
        celestialOptionalRepository.save(neptuneO);

        celestialOptionalRepository.save(moonO);
    }

    @Test
    @DisplayName("test celestial")
    void testJPA() {
        List<CelestialEssential> ces = celestialEssentialRepository.findAll();
        List<CelestialOptional> cos = celestialOptionalRepository.findAll();

        ces.forEach(System.out::println);
        cos.forEach(System.out::println);

    }

//    @Test
//    @DisplayName("find celestial")
//    void findEarth() {
//        //given
//        List<CelestialEssential> ces = celestialEssentialRepository.findAll();
//        List<CelestialEssential> earth = celestialEssentialRepository.findByID(30);
//        //when
//
//        //then
//        System.out.println("earth = " + earth);
//    }


}
