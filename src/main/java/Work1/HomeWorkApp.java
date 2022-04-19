package Work1;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        space();
        checkSumSign();
        space();
        printColor();
        space();
        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }


    private static void checkSumSign() {
        int varA = -5;
        int varB = 5;
        int result = (varA + varB);
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }


    private static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }


    private static void compareNumbers() {
        int varA = 1;
        int varB = 10;

        if (varA >= varB) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }

    private static void space() {
        System.out.println("\n");
        //Добавил метод, выводящий пустые строчки, чтобы результаты в консоль выводились без "слипания". Возможно, есть более удачный вариант, но я о нем не знаю.
    }
}
