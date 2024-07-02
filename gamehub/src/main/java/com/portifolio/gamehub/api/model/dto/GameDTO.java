package com.portifolio.gamehub.api.model.dto;
import com.portifolio.gamehub.domain.entities.Game;
import com.portifolio.gamehub.domain.entities.Genre;
import com.portifolio.gamehub.domain.entities.Platform;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class GameDTO {
    private Long id;
    @NotBlank(message = "Esse campo não pode ser vazio")
    private String name;
    @NotBlank(message = "Esse campo não pode ser vazio")
    private String review;
    @Min(value = 0, message = "O valor deve ser no mínimo 0")
    @Max(value = 10, message = "O valor deve ser no máximo 10")
    private BigDecimal grade;

    private Instant releaseDate;

    private String artUrl;

    private Set<GenreDTO> genres = new HashSet<>();

    private Set<Platform> platforms = new HashSet<>();
    public GameDTO(){

    }

    public GameDTO(Long id, String name, String review, BigDecimal grade, Instant releaseDate, String artUrl) {
        this.id = id;
        this.name = name;
        this.review = review;
        this.grade = grade;
        this.releaseDate = releaseDate;
        this.artUrl = artUrl;
    }

    public GameDTO(Game entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.review = entity.getReview();
        this.grade = entity.getGrade();
        this.releaseDate = entity.getReleaseDate();
        this.artUrl = entity.getArtUrl();
        this.platforms = entity.getPlatforms();
    }

    public GameDTO (Game entity, Set<Genre> genresGames) {
        this(entity);
        genresGames.forEach(cat -> this.genres.add(new GenreDTO(cat)));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public Instant getReleaseDate() {
        return releaseDate;
    }

    public String getArtUrl() {
        return artUrl;
    }

    public void setArtUrl(String artUrl) {
        this.artUrl = artUrl;
    }

    public Set<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(Set<GenreDTO> genres) {
        this.genres = genres;
    }

    public Set<Platform> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Set<Platform> platforms) {
        this.platforms = platforms;
    }

    public void setReleaseDate(Instant releaseDate) {
        this.releaseDate = releaseDate;
    }
}
