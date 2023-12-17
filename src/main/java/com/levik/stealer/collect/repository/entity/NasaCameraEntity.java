package com.levik.stealer.collect.repository.entity;

import com.levik.stealer.nasa.model.NasaCamera;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Table(name = "cameras")
@Entity
public class NasaCameraEntity {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private Long nasaId;

    @Setter
    @Getter
    private String name;

    @OneToMany(mappedBy = "nasaCamera", cascade = CascadeType.PERSIST)
    @Getter
    private final List<PictureEntity> images = new ArrayList<>();

    @Getter
    private LocalDateTime createdAt;

    public NasaCameraEntity() {
    }

    public NasaCameraEntity(NasaCamera nasaCamera) {
        this.nasaId = nasaCamera.id();
        this.name = nasaCamera.name();
        this.createdAt = LocalDateTime.now();
    }

    public void addImage(PictureEntity pictureEntity) {
        images.add(pictureEntity);
        pictureEntity.setNasaCamera(this);
    }
}
