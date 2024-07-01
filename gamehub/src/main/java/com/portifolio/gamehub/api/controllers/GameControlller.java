package com.portifolio.gamehub.api.controllers;

import com.portifolio.gamehub.domain.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "games")
@RestController
public class GameControlller {

    public ResponseEntity<Game> findGameById(@PathVariable Long id) {
       return  null;
    }

}
