package com.mascotaperdidamed.mascotas_perdidas_med.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "pets")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String species; // Especie (perro, gato, etc.)

    @Column(nullable = false)
    private String breed; // Raza

    @Column(nullable = false)
    private String color; // Color

    @Column(nullable = false)
    private LocalDate lostDate; // Fecha en que se perdió

    @Column(nullable = false)
    private String lostLocation; // Ubicación donde se perdió

    @Column(nullable = false)
    private String ownerName; // Nombre del dueño

    @Column(nullable = false)
    private String ownerContact; // Contacto del dueño

    @Column
    private String photoUrl; // URL de la foto de la mascota
    
    @Column
    private String status; // Estado de la mascota (perdida, encontrada, en proceso)
    @Column
    private String comments; // Comentarios adicionales
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
