package geekbrains.lesson_1;

public class Dog extends Animal {
    public static int countOfDogs = 0;
    private final int MAXIMUM_RUN_DISTANCE = 500;
    private final int MAXIMUM_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        ++countOfDogs;
    }

    public static int getDogs(){
        return countOfDogs;
    }


    @Override
    public int run(int distanceOfRun) {

        if (distanceOfRun < 0) {
            distanceOfRun = super.MINIMUM_RUN_DISTANCE;
        } else if (distanceOfRun > MAXIMUM_RUN_DISTANCE) {
            distanceOfRun = MAXIMUM_RUN_DISTANCE;
        }
        System.out.format("%s пробежал %d м.%n", super.getName(), distanceOfRun);
        return distanceOfRun;
    }

    @Override
    public int swim(int distanceOfSwim) {
        if (distanceOfSwim < 0) {
            distanceOfSwim = super.MINIMUM_SWIM_DISTANCE;
        } else if (distanceOfSwim > MAXIMUM_SWIM_DISTANCE) {
            distanceOfSwim = MAXIMUM_SWIM_DISTANCE;
        }
        System.out.format("%s проплыл %d м.%n", super.getName(), distanceOfSwim);
        return distanceOfSwim;
    }
}
