package com.portifolio.gamehub.domain.services;

import com.portifolio.gamehub.api.model.dto.GameDTO;
import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.repositories.GameRepository;
import com.portifolio.gamehub.domain.services.exceptions.ResourceNotFoundExceptions;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {


    private GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public GameDTO findById(Long id) {
        Optional<Game> obj = repository.findById(id);

        Game entity = obj.orElseThrow(() -> new ResourceNotFoundExceptions("Entidade não encontrada"));

        return new GameDTO(entity, entity.getGenres());
    }
}
