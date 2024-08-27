package com.portifolio.gamehub.api.controllers;

import com.portifolio.gamehub.api.model.dto.GenreDTO;
import com.portifolio.gamehub.domain.services.GenreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "genres")
@RestController
@CrossOrigin(origins = "*")
public class GenreController {

    private GenreService service;

    public GenreController(GenreService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GenreDTO>> findAll(){
        List<GenreDTO> allGenres = service.findAll();

        return ResponseEntity.ok().body(allGenres);
    }
}
