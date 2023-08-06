package com.spring.jpa.api.newsapi.api;

import com.spring.jpa.api.newsapi.entity.Constellation;
import com.spring.jpa.api.newsapi.service.ConstellationService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/news")
@CrossOrigin
public class NewsController {

    private final ConstellationService constellationService;

    @GetMapping("/{yearMonth}")
    public ResponseEntity<?> getOptional(
            @PathVariable("yearMonth") String yearMonth
    ){
        List<Constellation> responseDTO = constellationService.getAll(yearMonth);
        return ResponseEntity.ok().body(responseDTO);
    }

}