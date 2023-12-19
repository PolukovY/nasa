package com.levik.stealer.nasa;

import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;

import java.util.List;
import java.util.Map;

public interface NasaClient {

    String NASA_PATH = "/mars-photos/api/v1/rovers/curiosity/photos";
    String SOL = "sol";
    String API_KEY = "api_key";

    Map<NasaCamera, List<NasaImage>> getPictures(Integer sol);
}
