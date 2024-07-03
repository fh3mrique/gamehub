package com.portifolio.gamehub.domain.utils;

import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.entities.Genre;
import com.portifolio.gamehub.domain.entities.Platform;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class GameFactory {

    public static Game createGame() {
        Game game = new Game();
        game.setId(1L);
        game.setName("Test Game");
        game.setReview("This is a test game review");
        game.setGrade(new BigDecimal("9.5"));
        game.setReleaseDate(Instant.now());
        game.setArtUrl("http://example.com/art.png");

        Set<Genre> genres = new HashSet<>();
        genres.add(new Genre(1L, "Action"));
        game.setGenres(genres);

        Set<Platform> platforms = new HashSet<>();
        platforms.add(new Platform(1L, "PC"));
        game.setPlatforms(platforms);

        return game;
    }
}
