package com.spring.jpa.api.newsapi.service;

import com.spring.jpa.api.newsapi.entity.Constellation;
import com.spring.jpa.api.newsapi.repository.ConstellationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class ConstellationService {

    private final ConstellationRepository constellationRepository;

    public List<Constellation> getAll(String yearMonth) {
        return constellationRepository.findAll(yearMonth);
    }
}
