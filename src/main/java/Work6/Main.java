package Work6;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat( "Вася","Кот", 200, 20);
        Cat cat1 = new Cat("Китюля", "Кот", 12, 10);
        Cat cat2 = new Cat("Мяука", "Кот", 300, 40);
        Dog dog = new Dog("Дружок", "Собака", 500, 12);
        Dog dog1 = new Dog("Бобик", "Собака", 0, 9);

        cat.printInfo();
        System.out.println(cat.run(cat.getAnimalDistRun()));  //Не смог понять как сделать метод для этого вывода, чтобы не писать каждый раз этот sout
        System.out.println(cat.swim(cat.getAnimalDistSwim())+"\n");

        cat1.printInfo();
        System.out.println(cat1.run(cat1.getAnimalDistRun()));
        System.out.println(cat1.swim(cat1.getAnimalDistSwim())+"\n");

        cat2.printInfo();
        System.out.println(cat2.run(cat2.getAnimalDistRun()));
        System.out.println(cat2.swim(cat2.getAnimalDistSwim())+"\n");


        dog.printInfo();
        System.out.println(dog.run(dog.getAnimalDistRun()));
        System.out.println(dog.swim(dog.getAnimalDistSwim()) + "\n");

        dog1.printInfo();
        System.out.println(dog1.run(dog1.getAnimalDistRun()));
        System.out.println(dog1.swim(dog1.getAnimalDistSwim()) + "\n");

        System.out.println("Всего животных: " + Animal.COUNT_ANIMALS);
        System.out.println("Котов: " + Cat.COUNT_CAT);
        System.out.println("Собак: " + Dog.COUNT_DOG);





    }
}
