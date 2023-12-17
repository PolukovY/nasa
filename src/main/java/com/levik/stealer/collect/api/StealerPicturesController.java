package com.levik.stealer.collect.api;

import com.levik.stealer.collect.CollectNasaFacade;
import com.levik.stealer.collect.api.dto.SolDto;
import com.levik.stealer.nasa.model.NasaCamera;
import com.levik.stealer.nasa.model.NasaImage;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RequestMapping("/collect")
@RestController
public class StealerPicturesController {

    private final CollectNasaFacade collectNasaFacade;

    @PostMapping("/pictures")
    @ResponseStatus(HttpStatus.CREATED)
    public Map<NasaCamera, List<NasaImage>> collectNasaCameraToPictures(@Valid @RequestBody SolDto solDto) {
        return collectNasaFacade.collectNasaCameraToPictures(solDto);
    }
}
