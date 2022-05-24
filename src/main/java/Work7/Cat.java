package Work7;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private boolean satiety;


    protected Cat(String name, boolean satiety) {
        this.name = name;
        this.satiety = isSatiety();
    }


    protected void eat(Plate plate) {


        if (plate.getFoodCount() >= 8) {
            satiety = true;
            System.out.println(name + " ест " + (plate.getFoodCount() - plate.decreaseFood(ThreadLocalRandom.current().nextInt(3, 8))) + " ед. корма и становится сытым " + satiety);

        } else {
            System.out.println(this + ", \nкоту не хватит этого количества корма, чтобы покушать, поэтому он оставляет пищу в тарелке в количестве " + plate.getFoodCount() + " ед. и грустно идет спать");
            satiety = false;

        }

    }


    protected boolean isSatiety() {
        return satiety;
    }

    public void printInfo() {                   //printInfo кота имя и сытность
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name + " - сытость: " + satiety;
    }
}

