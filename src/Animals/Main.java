package Animals;

//import java.io.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File("src/Animals/Animal.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Map<String, Animal> animals = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            String animalClass = parts[1];
            switch (animalClass) {
                case "PREDATOR" -> {
                    Predator buf = new Predator(parts);
                    animals.put(buf.getName(), buf);
                }
                case "OMNIVOROUS" -> {
                    Omnivorous buf = new Omnivorous(parts);
                    animals.put(buf.getName(), buf);
                }
                case "HERBIVORE" -> {
                    Herbivore buf = new Herbivore(parts);
                    animals.put(buf.getName(), buf);
                }
            }
        }

        animals.forEach((k, v) -> System.out.println(v));

    }
}
