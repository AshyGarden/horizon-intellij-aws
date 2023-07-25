package com.spring.jpa.api.newsapi.repository;

import com.spring.jpa.api.newsapi.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, String> {

}