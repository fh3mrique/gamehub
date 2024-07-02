package com.portifolio.gamehub.api.model.dto;

import com.portifolio.gamehub.domain.entities.Genre;

public class GenreDTO {

    private Long id;
    private String platformName;

    public GenreDTO(Long id, String platformName) {
        this.id = id;
        this.platformName = platformName;
    }

    public GenreDTO(Genre entity) {
        this.platformName = entity.getGenreName();
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
}
