package com.levik.stealer.collect.repository.entity;

import com.levik.stealer.nasa.model.NasaImage;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Table(name = "pictures")
@Entity
public class PictureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "img_src", nullable = false)
    private String imgSrc;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "camera_id")
    private NasaCameraEntity nasaCamera;

    public PictureEntity() {
    }

    public PictureEntity(NasaImage nasaImage) {
        this.imgSrc = nasaImage.imgSrc();
        this.createdAt = LocalDateTime.now();
    }
}
