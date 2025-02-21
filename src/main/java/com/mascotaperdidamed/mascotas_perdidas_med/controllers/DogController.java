package com.mascotaperdidamed.mascotas_perdidas_med.controllers;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Dog;
import com.mascotaperdidamed.mascotas_perdidas_med.services.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {
    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
        dogService.
    }

}