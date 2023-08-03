package com.spring.jpa.api.solarsystemapi.repository;

import com.spring.jpa.api.solarsystemapi.entity.CelestialOptional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CelestialOptionalRepository
            extends JpaRepository<CelestialOptional, String> {
//    @Query("SELECT co FROM celestial_optional co WHERE co.celestial_number = :celestialNumber")
//    List<CelestialOptional> findByCelNum(@Param("celestialNumber") int celestialNumber);
//    //List<CelestialOptional> findByCelestialNumber(int celestialNumber);

}
