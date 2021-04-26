package geekbrains.lesson_1;

public class Cat extends Animal{
    private static int countOfCats = 0;
    private final int MAXIMUM_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        ++countOfCats;
    }

    public static int getCats(){
        return countOfCats;
    }

    @Override
    public int run(int lengthOfRun) {

        if (lengthOfRun < 0) {
            lengthOfRun = super.MINIMUM_RUN_DISTANCE;
        } else if (lengthOfRun > MAXIMUM_RUN_DISTANCE) {
            lengthOfRun = MAXIMUM_RUN_DISTANCE;
        }
        System.out.format("%s пробежал %d м.%n", super.getName(), lengthOfRun);
        return lengthOfRun;
    }

    @Override
    public int swim(int distanceOfSwim) {
        System.out.format("Коты не плавают.%n");
        return 0;
    }
}
