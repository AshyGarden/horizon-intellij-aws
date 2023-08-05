package com.spring.jpa.api.newsapi.repository;

import com.spring.jpa.api.newsapi.entity.Constellation;
import com.spring.jpa.api.solarsystemapi.entity.CelestialEssential;
import com.spring.jpa.api.storeapi.entity.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ConstellationRepository extends JpaRepository<Constellation, String> {

    @Query("SELECT co FROM Constellation co WHERE co.date LIKE :yearMonth%")
    List<Constellation> findAll(@Param("yearMonth") String yearMonth);
}