package Work2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(methodBoolean (12, 12)); //methodBoolean(10, 11); //первое задане

        positiveOrNegative(0); //второе задание

        System.out.println(trueIfNegative(-12)); //третье задание

        stringAndInt("Спасите, помогите, сложно", 6); //четвертое задание

        yearLeap(); //пятое задание


    }



    /*1. Написать метод, принимающий на вход два целых чqисла и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */

    private static boolean methodBoolean(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }

        return false;
    }


    /*2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    private static void positiveOrNegative(int a) {
        System.out.println(" ");
        if (a >= 0) {
            System.out.println("positive");

        } else {
            System.out.println("negative");

        }

    }

    /*3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

     */

    private static boolean trueIfNegative(int a) {
        System.out.println(" ");
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }


    /*4 Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;

     */

    private static void stringAndInt(String text, int j) {
        System.out.println(" ");

        for (int i = 0; i < j; i++) {
            System.out.println(text);

        }


    }

    /* 5 Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

     */
    private static void yearLeap() {

        //не смог понять условие и как реализовать. Возможно смогу сделать это задание позднее.


    }
}
