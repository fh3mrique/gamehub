package com.portifolio.gamehub.api.controllers;

import com.portifolio.gamehub.api.model.dto.PlatformDTO;
import com.portifolio.gamehub.domain.services.PlatformService;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "platforms")
@RestController
@CrossOrigin(origins = "*")
public class PlatformController {
    private PlatformService service;

    public PlatformController(PlatformService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<PlatformDTO>> findAll(){
        List<PlatformDTO> allPlatforms = service.findAllPlatforms();

        return ResponseEntity.ok().body(allPlatforms);
    }

}
