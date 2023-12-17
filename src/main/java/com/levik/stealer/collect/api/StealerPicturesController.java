package com.levik.stealer.collect.api;

import com.levik.stealer.collect.CollectNasaFacade;
import com.levik.stealer.collect.api.dto.SolDto;
import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/collect")
@RestController
public class StealerPicturesController {

    private final CollectNasaFacade collectNasaFacade;

    @PostMapping("/pictures")
    public Map<NasaCamera, List<NasaImage>> collectNasaCameraToPictures(@RequestBody SolDto solDto) {
        return collectNasaFacade.collectNasaCameraToPictures(solDto);
    }
}
