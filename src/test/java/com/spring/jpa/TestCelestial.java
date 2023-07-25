package com.spring.jpa;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import com.spring.jpa.api.solarsystemapi.repository.CelestialEssentialRepository;
import com.spring.jpa.api.solarsystemapi.repository.CelestialOptionalRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TestCelestial {

    @Autowired
    CelestialEssentialRepository celestialEssentialRepository;
    @Autowired
    CelestialOptionalRepository celestialOptionalRepository;


}
