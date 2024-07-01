package com.portifolio.gamehub.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
