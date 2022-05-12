package Work6;

public class Cat extends Animal {

    public static int COUNT_CAT = 0;

    Cat(String name, String type, int catDistRun, int catDistSwim) {
        super(name, type, catDistRun, catDistSwim);
        COUNT_ANIMALS++;
        COUNT_CAT++;
    }


    @Override
    public boolean run(int catDistRun) {

        if (catDistRun <= 200 && catDistRun > 0) {
            System.out.print("Кот успешно бежит " + catDistRun + " метров ");
            return true;
        } else if (catDistRun <= 0) {
            System.out.print("Кот готов бежать, не в силах стоять на месте, но и не может отмотать метры и вернуться в прошлое: ");
            return false;
        } else {
            System.out.print("Кот не может пробежать больше 200 метров: ");
            return false;
        }

    }

    @Override
    public boolean swim(int swimDistance) {
        System.out.print("Коты не плавают >=( ");
        return false;
    }
}


