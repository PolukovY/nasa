package com.levik.stealer.collect;

import com.levik.stealer.collect.api.dto.SolDto;
import com.levik.stealer.nasa.NasaClient;
import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class CollectNasaFacade {

    private final NasaClient nasaClient;

    private final NasaService nasaService;

    public Map<NasaCamera, List<NasaImage>> collectNasaCameraToPictures(SolDto solDto){
        Objects.requireNonNull(solDto, "Sold should not be null");
        Map<NasaCamera, List<NasaImage>> cameraToPictures = nasaClient.getPictures(solDto.sol());

        nasaService.saveNasaData(cameraToPictures);

        return cameraToPictures;
    }
}
