package com.portifolio.gamehub.domain.repositories;

import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
