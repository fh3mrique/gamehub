package com.portifolio.gamehub.api.model.dto;

import com.portifolio.gamehub.domain.entities.Platform;

public class PlatformDTO {
    private Long id;
    private String platformName;

    public PlatformDTO(Long id, String platformName) {
        this.id = id;
        this.platformName = platformName;
    }

    public PlatformDTO(Platform entity) {
        this.id = entity.getId();
        this.platformName = entity.getPlatformName();
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
