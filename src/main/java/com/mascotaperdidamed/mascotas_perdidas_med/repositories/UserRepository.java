package com.mascotaperdidamed.mascotas_perdidas_med.repositories;

import com.mascotaperdidamed.mascotas_perdidas_med.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);
}
