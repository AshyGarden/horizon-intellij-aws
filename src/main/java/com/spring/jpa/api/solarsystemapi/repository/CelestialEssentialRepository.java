package com.spring.jpa.api.solarsystemapi.repository;

import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.storeapi.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CelestialEssentialRepository
        extends JpaRepository<CelestialEssential, String> {

    @Query("SELECT ce FROM CelestialEssential ce")
    List<CelestialEssential> findAll();

    @Query("SELECT ce FROM CelestialEssential ce WHERE ce.celNameEng = :name")
    CelestialEssential findByName(String name);

}
