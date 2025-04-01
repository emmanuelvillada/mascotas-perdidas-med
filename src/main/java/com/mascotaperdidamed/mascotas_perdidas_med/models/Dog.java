package  com.mascotaperdidamed.mascotas_perdidas_med.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dogs")
public class Dog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String name;
    private String breed;   // Raza
    private String color;
    private String location; // Lugar donde se perdió
    private String contactPhone;
    
    private LocalDate lostDate; // Fecha de pérdida

    // Constructor vacío (necesario para JPA)
    public Dog() {}

    // Constructor con parámetros
    public Dog(String name, String breed, String color, String location, String contactPhone, LocalDate lostDate) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.location = location;
        this.contactPhone = contactPhone;
        this.lostDate = lostDate;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String contactPhone) { this.contactPhone = contactPhone; }

    public LocalDate getLostDate() { return lostDate; }
    public void setLostDate(LocalDate lostDate) { this.lostDate = lostDate; }
}
