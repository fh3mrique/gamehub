package com.portifolio.gamehub.domain.services;

import com.portifolio.gamehub.api.model.dto.GameDTO;
import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.repositories.GameRepository;
import com.portifolio.gamehub.domain.utils.GameFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class GameServiceTests {

    @InjectMocks
    private GameService gameService;

    @Mock
    private GameRepository repositorio;

    private Long idExistente;
    private Long idNaoExistente;
    private Long idDependente;

    private Game game;


    @BeforeEach
    void setUp() throws Exception  {
        idExistente = 1L;
        idNaoExistente = 1000L;
        idDependente = 4L;
        game = GameFactory.createGame();


        Mockito.doNothing().when(repositorio).deleteById(idExistente);

        Mockito.doThrow(EmptyResultDataAccessException.class).when(repositorio).deleteById(idNaoExistente);

        Mockito.doThrow(DataIntegrityViolationException.class).when(repositorio).deleteById(idDependente);
    }

    @Test
    void findById_ReturnsGameDTO_WhenIdExists() {
        when(repositorio.findById(anyLong())).thenReturn(Optional.of(game));

        GameDTO result = gameService.findById(1L);

        assertEquals(1L, result.getId());
        assertEquals("Test Game", result.getName());
        assertEquals("This is a test game review.", result.getReview());
        assertEquals(new BigDecimal("9.5"), result.getGrade());
        assertEquals(game.getReleaseDate(), result.getReleaseDate());
        assertEquals("http://example.com/art.png", result.getArtUrl());
    }


}
