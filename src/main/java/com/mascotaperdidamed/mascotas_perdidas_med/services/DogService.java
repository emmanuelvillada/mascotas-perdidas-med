package com.mascotaperdidamed.mascotas_perdidas_med.services;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Dog;
import com.mascotaperdidamed.mascotas_perdidas_med.repositories.DogRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DogService  { 

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        return dogRepository.findAll();
    }

    public Optional<Dog> getDogById(Long id) {
        return dogRepository.findById(id);
    }

    public Dog saveDog(Dog dog) {
        return dogRepository.save(dog);
    }

    public void deleteDog(Long id) {
        dogRepository.deleteById(id);
    }

    public List<Dog> findByLocation(String location) {
        return dogRepository.findByLocation(location);
    }

    public List<Dog> findByBreed(String breed) {
        return dogRepository.findByBreed(breed);
    }
    
}
