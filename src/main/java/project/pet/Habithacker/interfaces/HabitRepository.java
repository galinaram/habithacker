package project.pet.Habithacker.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.pet.Habithacker.entities.Habit;

@Repository
public interface HabitRepository extends JpaRepository<Habit, Long> {
}
