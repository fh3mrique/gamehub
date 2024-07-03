package com.portifolio.gamehub.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.portifolio.gamehub.api.model.dto.GameDTO;
import com.portifolio.gamehub.domain.services.GameService;
import com.portifolio.gamehub.domain.utils.GameFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GameController.class)
public class GameControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private GameService gameService;

    private Long idExistente;
    private Long idNaoExistente;

    private GameDTO gameDTO;

    @BeforeEach
    void setUp() throws Exception {

        idExistente = 1L;
        idNaoExistente = 1000L;
        gameDTO = GameFactory.createGameDTO();
        Mockito.when(gameService.findById(idExistente)).thenReturn(gameDTO);
    }


    @Test
    public void findById_WhenIdExists_ShouldReturnGameDTO() throws Exception {
        ResultActions result = mockMvc.perform(get("/games/{id}", idExistente)
                .accept(MediaType.APPLICATION_JSON));

        result.andExpect(status().isOk());

        result.andExpect(jsonPath("$.id").exists());
        result.andExpect(jsonPath("$.name").exists());
        result.andExpect(jsonPath("$.review").exists());
        result.andExpect(jsonPath("$.grade").exists());
        result.andExpect(jsonPath("$.releaseDate").exists());
        result.andExpect(jsonPath("$.artUrl").exists());
        result.andExpect(jsonPath("$.genres").exists());
        result.andExpect(jsonPath("$.platforms").exists());
    }
}
