package com.levik.stealer.collect.repository.entity;

import com.levik.stealer.nasa.model.NasaCamera;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


@Table(name = "cameras")
@EqualsAndHashCode
@Entity
public class NasaCameraEntity {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Getter
    @Column(name = "nasa_id", nullable = false)
    private Long nasaId;

    @Setter
    @Getter
    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "nasaCamera", cascade = CascadeType.PERSIST)
    @Getter
    private final List<PictureEntity> images = new ArrayList<>();

    @CreationTimestamp
    @Getter
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    public NasaCameraEntity() {
    }

    public NasaCameraEntity(NasaCamera nasaCamera) {
        this.nasaId = nasaCamera.id();
        this.name = nasaCamera.name();
    }

    public void addImage(PictureEntity pictureEntity) {
        images.add(pictureEntity);
        pictureEntity.setNasaCamera(this);
    }
}
