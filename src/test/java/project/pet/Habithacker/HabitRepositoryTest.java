package project.pet.Habithacker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import project.pet.Habithacker.entities.Habit;
import project.pet.Habithacker.interfaces.HabitRepository;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class HabitRepositoryTest {

    @Autowired
    private HabitRepository habitRepository;

    @Test
    void testSaveAndFindHabit() {
        // Создаем и сохраняем привычку
        Habit habit = new Habit();
        habit.setName("Йога");
        habit.setDescription("15 минут утром");
        habit.setTargetCount(1);

        Habit savedHabit = habitRepository.save(habit);

        // Ищем по ID
        Habit foundHabit = habitRepository.findById(savedHabit.getId()).orElse(null);

        // Проверяем что нашли и поля совпадают
        assertNotNull(foundHabit);
        assertEquals("Йога", foundHabit.getName());
        assertEquals("15 минут утром", foundHabit.getDescription());
        assertEquals(1, foundHabit.getTargetCount());
    }
}
