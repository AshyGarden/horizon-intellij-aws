package com.spring.jpa.api.solarsystemapi.service;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import com.spring.jpa.api.solarsystemapi.repository.CelestialEssentialRepository;
import com.spring.jpa.api.solarsystemapi.repository.CelestialOptionalRepository;
import com.spring.jpa.api.storeapi.entity.ProductDetail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class CelestialService {
    private final CelestialEssentialRepository ceRepository;
    private final CelestialOptionalRepository coRepository;


    public CelestialEssential getEssential(String name) {
        return ceRepository.findByName(name);
    }

    public CelestialOptional getOptional(String name) {
        return coRepository.findByName(name);
    }
}
