package project.pet.Habithacker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import project.pet.Habithacker.entities.Habit;
import project.pet.Habithacker.interfaces.HabitRepository;

@Component
public class H2Runner implements CommandLineRunner {

    @Autowired
    private HabitRepository habitRepository;

    @Override
    public void run(String... args) throws Exception {
        Habit habit = new Habit();
        habit.setName("Пить воду");
        habit.setDescription("Выпивать 8 литров воды в день");
        habit.setTargetCount(8);

        Habit saveHabit = habitRepository.save(habit);
        Habit foundHabit = habitRepository.findById(saveHabit.getId()).orElse(null);

        System.out.println("Сохраненная привычка: " + foundHabit);
    }
}
