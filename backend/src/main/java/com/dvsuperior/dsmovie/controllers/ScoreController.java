package com.dvsuperior.dsmovie.controllers;

import com.dvsuperior.dsmovie.dto.MovieDTO;
import com.dvsuperior.dsmovie.dto.ScoreDTO;
import com.dvsuperior.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }
}
