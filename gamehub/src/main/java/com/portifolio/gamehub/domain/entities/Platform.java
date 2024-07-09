package com.portifolio.gamehub.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_platform")
public class Platform {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String platformName;

    public Platform() {

    }

    public Platform(Long id, String platformName) {
        this.id = id;
        this.platformName = platformName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}