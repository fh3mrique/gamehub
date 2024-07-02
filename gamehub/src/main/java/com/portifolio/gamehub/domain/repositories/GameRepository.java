package com.portifolio.gamehub.domain.repositories;

import com.portifolio.gamehub.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
