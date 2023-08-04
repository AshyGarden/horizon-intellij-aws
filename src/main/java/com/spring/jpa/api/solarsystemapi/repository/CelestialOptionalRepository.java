package com.spring.jpa.api.solarsystemapi.repository;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CelestialOptionalRepository
            extends JpaRepository<CelestialOptional, String> {

    @Query("SELECT co FROM CelestialOptional co")
    List<CelestialOptional> findAll();

    @Query("SELECT co FROM CelestialOptional co WHERE co.celNameEng = :name")
    CelestialOptional findByName(String name);

}
