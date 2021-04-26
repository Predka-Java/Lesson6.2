package geekbrains.lesson_1;

public abstract class Animal implements AnimalBehavior {
    public static int numberOfAnimals = 0;
    private static String name;

    public final int MINIMUM_RUN_DISTANCE = 0;
    public final int MINIMUM_SWIM_DISTANCE = 0;


    public Animal(String name) {
        Animal.name = name;
        ++numberOfAnimals;
    }

    public static String getName() {
        return name;
    }
}
