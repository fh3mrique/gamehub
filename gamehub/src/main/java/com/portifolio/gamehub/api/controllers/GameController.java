package com.portifolio.gamehub.api.controllers;

import com.portifolio.gamehub.api.model.dto.GameDTO;
import com.portifolio.gamehub.domain.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "games")
@RestController
public class GameController {

    private GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<GameDTO> findGameById(@PathVariable Long id) {
       GameDTO game = service.findById(id);

       return ResponseEntity.ok().body(game);
    }

}
