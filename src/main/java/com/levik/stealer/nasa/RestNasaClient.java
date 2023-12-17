package com.levik.stealer.nasa;

import com.fasterxml.jackson.databind.JsonNode;
import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;
import com.levik.stealer.nasa.properties.NasaProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;
import java.util.stream.StreamSupport;


@Component
@RequiredArgsConstructor
public class RestNasaClient implements NasaClient {

    private static final String PHOTOS = "photos";
    private static final String CAMERA = "camera";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String IMG_SRC = "img_src";

    private final RestTemplate restTemplate;
    private final NasaProperties nasaProperties;

    @Override
    public Map<NasaCamera, List<NasaImage>> getPictures(Integer sol) {
        Objects.requireNonNull(sol, "Sol should not be null");
        String nasaUrl = getNasaUrl(sol);

        Map<NasaCamera, List<NasaImage>> cameraToPictures  = new HashMap<>();

        JsonNode jsonNode = restTemplate.getForObject(nasaUrl, JsonNode.class);

        if (jsonNode != null) {
            JsonNode photos = jsonNode.get(PHOTOS);
            StreamSupport.stream(photos.spliterator(), false)
                    .forEach(photo -> collectCameraWithImages(photo, cameraToPictures));
        }

        return cameraToPictures;
    }

    private void collectCameraWithImages(JsonNode photo, Map<NasaCamera, List<NasaImage>> cameraToPictures) {
        JsonNode cameraNode = photo.get(CAMERA);
        NasaCamera nasaCamera = createNasaCamera(cameraNode);
        NasaImage newNasaImage = createNasaImage(photo);

        List<NasaImage> nasaImages = cameraToPictures.getOrDefault(nasaCamera, new ArrayList<>());
        nasaImages.add(newNasaImage);
        cameraToPictures.put(nasaCamera, nasaImages);
    }

    private NasaCamera createNasaCamera(JsonNode cameraNode) {
        Long id = Long.parseLong(cameraNode.get(ID).asText());
        String name = cameraNode.get(NAME).asText();
        return new NasaCamera(id, name);
    }

    private NasaImage createNasaImage(JsonNode photo) {
        String imgSrc = photo.get(IMG_SRC).asText();
        return new NasaImage(imgSrc);
    }


    private String getNasaUrl(Integer sol) {
        String host = nasaProperties.getHost();
        String apiKey = nasaProperties.getApiKey();
        return UriComponentsBuilder.fromHttpUrl(host + NASA_PATH)
                .queryParam(SOL, sol)
                .queryParam(API_KEY, apiKey)
                .toUriString();
    }
}
