package com.spring.jpa.api.solarsystemapi.api;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class SolarSystemController {

    //천체 정보를 가져오는 기능
//    @GetMapping
//    public ResponseEntity<?> getSolarSystemDetial(CelestialEssential ce){
//
//
//    }


}
