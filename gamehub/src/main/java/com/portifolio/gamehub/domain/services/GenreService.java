package com.portifolio.gamehub.domain.services;

import com.portifolio.gamehub.api.model.dto.GameDTO;
import com.portifolio.gamehub.api.model.dto.GenreDTO;
import com.portifolio.gamehub.api.model.dto.PlatformDTO;
import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.entities.Genre;
import com.portifolio.gamehub.domain.repositories.GameRepository;
import com.portifolio.gamehub.domain.repositories.GenreRepository;
import com.portifolio.gamehub.domain.services.exceptions.ResourceNotFoundExceptions;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GenreService {


    private GenreRepository repository;

    public GenreService(GenreRepository repository) {
        this.repository = repository;
    }

    public List<GenreDTO> findAll() {
        List<Genre> allGenres = repository.findAll();

        return allGenres.stream().map(genre -> new GenreDTO(genre)).collect(Collectors.toList());

    }
}
