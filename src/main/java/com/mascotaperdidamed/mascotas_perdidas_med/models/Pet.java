package com.mascotaperdidamed.mascotas_perdidas_med.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
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

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getLostDate() {
        return lostDate;
    }

    public void setLostDate(LocalDate lostDate) {
        this.lostDate = lostDate;
    }

    public String getLostLocation() {
        return lostLocation;
    }

    public void setLostLocation(String lostLocation) {
        this.lostLocation = lostLocation;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerContact() {
        return ownerContact;
    }

    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    
}
