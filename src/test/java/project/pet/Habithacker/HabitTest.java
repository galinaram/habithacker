package project.pet.Habithacker;

import org.junit.jupiter.api.Test;
import project.pet.Habithacker.entities.Habit;

import static org.junit.jupiter.api.Assertions.*;

class HabitTest {

    @Test
    void testHabitCreation() {
        // Создаем привычку
        Habit habit = new Habit();
        habit.setName("Чтение");
        habit.setDescription("Читать 30 минут в день");
        habit.setTargetCount(1);

        // Проверяем что поля установились правильно
        assertEquals("Чтение", habit.getName());
        assertEquals("Читать 30 минут в день", habit.getDescription());
        assertEquals(1, habit.getTargetCount());
        assertNull(habit.getId()); // ID должен быть null пока не сохранен
    }

    @Test
    void testHabitWithAllArgsConstructor() {
        // Тестируем конструктор со всеми полями
        Habit habit = new Habit(1L, "Спорт", "Тренировка", 1);

        assertEquals(1L, habit.getId());
        assertEquals("Спорт", habit.getName());
        assertEquals("Тренировка", habit.getDescription());
        assertEquals(1, habit.getTargetCount());
    }
}