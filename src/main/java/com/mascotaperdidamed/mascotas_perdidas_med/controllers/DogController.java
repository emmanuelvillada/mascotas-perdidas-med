package com.mascotaperdidamed.mascotas_perdidas_med.controllers;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Dog;
import com.mascotaperdidamed.mascotas_perdidas_med.services.DogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/dogs")
public class DogController {
    
    @Autowired
    private DogService dogService;

    @GetMapping
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/{id}")
    public Optional<Dog> getDogById(@PathVariable Long id) {
        return dogService.getDogById(id);
    }

    @PostMapping
    public Dog createDog(@RequestBody Dog dog) {
        return dogService.saveDog(dog);

    }

    @DeleteMapping("/{id}")
    public void deleteDog(@PathVariable Long id) {
        dogService.deleteDog(id);
    }

    @GetMapping("/search")
    public List<Dog> searchDogs(@RequestParam String location) {
        return dogService.findByLocation(location);
    }

}