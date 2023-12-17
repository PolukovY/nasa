package com.levik.stealer.collect;

import com.levik.stealer.collect.repository.NasaCameraRepository;
import com.levik.stealer.collect.repository.entity.PictureEntity;
import com.levik.stealer.collect.repository.entity.NasaCameraEntity;
import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Transactional
@RequiredArgsConstructor
@Service
public class NasaService {

    private final NasaCameraRepository nasaCameraRepository;

    public void saveNasaData(Map<NasaCamera, List<NasaImage>> cameraToPictures) {
        List<NasaCameraEntity> nasaCameraEntities = new ArrayList<>();

        for (NasaCamera nasaCamera : cameraToPictures.keySet()) {
            var nasaCameraEntity = new NasaCameraEntity(nasaCamera);
            List<NasaImage> nasaImages = cameraToPictures.get(nasaCamera);

            for (NasaImage nasaImage : nasaImages) {
                var imageEntity = new PictureEntity(nasaImage);
                nasaCameraEntity.addImage(imageEntity);
            }
            nasaCameraEntities.add(nasaCameraEntity);
        }

        nasaCameraRepository.saveAll(nasaCameraEntities);
    }
}
