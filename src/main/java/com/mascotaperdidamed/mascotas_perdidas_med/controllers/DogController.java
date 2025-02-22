package com.mascotaperdidamed.mascotas_perdidas_med.controllers;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Dog;
import com.mascotaperdidamed.mascotas_perdidas_med.services.DogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class DogController {
    
    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs() {
        List<Dog> dogs = dogService.getAllDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
    
    @GetMapping("/dogs/{id}")
    public ResponseEntity<Dog> getDogById(@PathVariable Long id) {
        Dog dog = dogService.getDogById(id);
        return new ResponseEntity<>(dog, HttpStatus.OK);
    }

    @PostMapping("/dogs")
    public ResponseEntity<Dog> createDog(@RequestBody Dog dog) {
        Dog createdDog = dogService.createDog(dog);
        return new ResponseEntity<>(createdDog, HttpStatus.CREATED);
    }

    @PutMapping("/dogs/{id}")
    public ResponseEntity<Dog> updateDog(@PathVariable Long id, @RequestBody Dog dog) {
        Dog updatedDog = dogService.updateDog(id, dog);
        return new ResponseEntity<>(updatedDog, HttpStatus.OK);
    }

}