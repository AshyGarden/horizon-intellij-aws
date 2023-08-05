package com.spring.jpa.api.solarsystemapi.api;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import com.spring.jpa.api.solarsystemapi.service.CelestialService;
import com.spring.jpa.api.storeapi.entity.ProductDetail;
import com.spring.jpa.api.storeapi.service.StoreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/solar")
@CrossOrigin
//@CrossOrigin(origins = "http://localhost:3000")
public class SolarSystemController {

    private final CelestialService celestialService;

    //천체 정보를 가져오는 기능
    @GetMapping("/essential/{name}")
    public ResponseEntity<?> getEssential(@PathVariable("name") String name){
        CelestialEssential responseDTO = celestialService.getEssential(name);
        return ResponseEntity.ok().body(responseDTO);
    }

    @GetMapping("/optional/{name}")
    public ResponseEntity<?> getOptional(@PathVariable("name") String name){
        CelestialOptional responseDTO = celestialService.getOptional(name);
        return ResponseEntity.ok().body(responseDTO);
    }


}
