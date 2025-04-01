package com.mascotaperdidamed.mascotas_perdidas_med.services;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Pet;
import com.mascotaperdidamed.mascotas_perdidas_med.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;
    
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
//find the pets lost in the specified location
    public List<Pet> findByLocation(String location) {
        return petRepository.findByLocation(location);
    }
//find the pets of the specified species
    public List<Pet> findBySpecies(String species) {
        return petRepository.findBySpecies(species);
    }
//find the pets of the specified breed
    public List<Pet> findByBreed(String breed) {
        return petRepository.findByBreed(breed);
    }
//find the pets of the specified id
    public Optional<Pet> getPetById(Long id) {
        return petRepository.findById(id);
    }
//save the pet
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
//delete the pet
    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    public Pet updatePet(Long id, Pet pet) {
        Pet petToUpdate = petRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Pet not found"));
        petToUpdate.setName(pet.getName());
        petToUpdate.setBreed(pet.getBreed());
        petToUpdate.setSpecies(pet.getSpecies());
        petToUpdate.setColor(pet.getColor());
        petToUpdate.setLostLocation(pet.getLostLocation());
        petToUpdate.setOwnerContact(pet.getOwnerContact());
        petToUpdate.setLostDate(pet.getLostDate());
        return petRepository.save(petToUpdate);
    }

    

    
}
