package Work6;

public class Dog extends Animal {


    public static int COUNT_DOG = 0;

    Dog(String name, String type, int dogDistRun, int dogDistSwim) {
        super(name, type, dogDistRun, dogDistSwim);
        COUNT_ANIMALS++;
        COUNT_DOG++;
    }

    @Override
    public boolean run(int dogDistRun) {
        if (dogDistRun <= 500 && dogDistRun > 0) {
            System.out.print("Собака успешно бежит " + dogDistRun + " метров: ");
            return true;
        } else if (dogDistRun <= 0) {
            System.out.print("Собака готова бежать, не в силах стоять на месте, но и не может отмотать метры и вернуться в прошлое: ");
            return false;
        } else {
            System.out.print("Собака не может пробежать больше 500 метров: ");
            return false;
        }

    }

    @Override
    public boolean swim(int dogDistSwim) {
        if (dogDistSwim <= 10 && dogDistSwim > 0) {
            System.out.print("Собака плывет " + dogDistSwim + " метров: ");
            return true;
        } else if (dogDistSwim <= 0) {
            System.out.print("Собака готова плыть, не в силах стоять на месте, но и не может отмотать метры и вернуться в прошлое: ");
            return false;
        } else {
            System.out.print("Собака не может проплыть больше 10 метров: ");
            return false;
        }
    }



}
