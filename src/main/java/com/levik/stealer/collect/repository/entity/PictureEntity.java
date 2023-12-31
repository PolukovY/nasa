package com.levik.stealer.collect.repository.entity;

import com.levik.stealer.nasa.model.NasaImage;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Setter
@Getter
@Table(name = "pictures")
@EqualsAndHashCode
@Entity
public class PictureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "img_src", nullable = false)
    private String imgSrc;

    @Getter
    @Column(name = "nasa_id", nullable = false)
    private Long nasaId;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "camera_id")
    private NasaCameraEntity nasaCamera;

    public PictureEntity() {
    }

    public PictureEntity(NasaImage nasaImage, Long nasaId) {
        this.imgSrc = nasaImage.imgSrc();
        this.nasaId = nasaId;
    }
}
