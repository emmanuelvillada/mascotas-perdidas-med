package com.mascotaperdidamed.mascotas_perdidas_med.repositories;

import com.mascotaperdidamed.mascotas_perdidas_med.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {
    List<Dog> findByLocation(String location);
    List<Dog> findByBreed(String breed);
}
