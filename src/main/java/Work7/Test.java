package Work7;


public class Test {

    public static void startCatGame() throws InterruptedException {
        Cat cat1 = new Cat("Мартин Лютер Кот", false);
        Cat cat2 = new Cat("Иоганн Себастьян Кот", false);
        Cat cat3 = new Cat("Георг Фридрих Кот", false);
        Cat cat4 = new Cat("Вольфганг Амадей Кот", false);

        Plate plate = new Plate(11);


        Cat[] catsArr = {cat1, cat2, cat3, cat4};

        System.out.println("    Начнем увлекательное шоу \n <<Съешь или останься голодным>>");
        Thread.sleep(4000);
        System.out.println();

        System.out.println("Изначально еды:[" + plate.getFoodCount() + "]");


        do {
            for (Cat cat : catsArr) {

                cat.printInfo();
                System.out.println();
                Thread.sleep(3000);


                while (plate.getFoodCount() > 0) {
                    cat.eat(plate);
                    plate.printInfo();
                    Thread.sleep(1000);
                    System.out.println();

                    if (cat.isSatiety() == true) {
                        break;

                    }

                    if (cat.isSatiety() == false) {
                        plate.isAddEatForCat();
                        plate.printInfo();
                        break;

                    }
                }
            }
        }

        while (plate.getFoodCount() >= 8);
    }
}


