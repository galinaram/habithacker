package project.pet.Habithacker.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Habit {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    @Column (nullable = false)
    String name;
    String description;
    @Column (nullable = false)
    int targetCount;
}
