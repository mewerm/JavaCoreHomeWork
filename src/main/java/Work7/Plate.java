package Work7;

import java.util.Scanner;

public class Plate {

    private int foodCount;
    static Scanner scanner = new Scanner(System.in);

    protected Plate(int foodCount) {
        this.foodCount = foodCount;
    }


    protected int decreaseFood(int catEatFoodCount) {
        if (getFoodCount() > 0) {
            return foodCount -= catEatFoodCount;
        }
        return foodCount;

    }


    protected int getFoodCount() {
        return foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Еды  в тарелке [" + getFoodCount() + "]";
    }

    protected int addEatInPlate() {
        System.out.println("Добавляем ненасытным пушистикам еды...");
        return foodCount += 10;


    }

    protected int isAddEatForCat() {
        System.out.println("Хм... Еды и вправду мало. Добавим 10 ед. еды котикам в тарелку? y/n");
        if (scanner.next().equals("y")) {
            return addEatInPlate();
        } else
            return foodCount;
    }
}

