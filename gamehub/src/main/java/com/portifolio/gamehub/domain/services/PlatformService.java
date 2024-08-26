package com.portifolio.gamehub.domain.services;

import com.portifolio.gamehub.api.model.dto.PlatformDTO;
import com.portifolio.gamehub.domain.entities.Platform;
import com.portifolio.gamehub.domain.repositories.PlatformRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlatformService {


    private PlatformRepository repository;

    public PlatformService(PlatformRepository repository) {
        this.repository = repository;
    }

    public List<PlatformDTO> findAllPlatforms() {
       List<Platform> allPlatforms = repository.findAll();

       return allPlatforms.stream().map(platform -> new PlatformDTO(platform)).collect(Collectors.toList());
    }
}
