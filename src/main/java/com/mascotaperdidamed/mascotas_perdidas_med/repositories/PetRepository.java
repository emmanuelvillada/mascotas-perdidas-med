package com.mascotaperdidamed.mascotas_perdidas_med.repositories;

    import com.mascotaperdidamed.mascotas_perdidas_med.models.Pet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PetRepository extends JpaRepository<Pet, Long> {
    
    List<Pet> findBySpecies(String species);
    List<Pet> findByBreed(String breed);
    List<Pet> findByLocation(String location);
    
}
