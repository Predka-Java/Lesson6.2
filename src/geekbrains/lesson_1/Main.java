package geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
            Cat barsik = new Cat("Барсик");
            barsik.swim(5);
            barsik.run(150);
            Cat boris = new Cat("Борис");
            boris.swim(10);
            boris.run(200);
            Dog bobik = new Dog("Бобик");
            bobik.swim(10);
            bobik.run(400);

            System.out.println("Всего животных:");
            System.out.println(Animal.numberOfAnimals);
            System.out.println("Всего котов:");
            System.out.println(Cat.getCats());
            System.out.println("Всего собак:");
            System.out.println(Dog.getDogs());
    }
}
