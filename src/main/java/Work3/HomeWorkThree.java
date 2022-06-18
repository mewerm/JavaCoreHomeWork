package Work3;


import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {

//        showArr();
//        doHundredArr();
//        multiplyByTwo();
//        doTwoArray();
//        twoValue(5, 32);
//        foundMinMax();
//        startEightTask();

    }


    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    public static void showArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println("Задача №1: ");
        System.out.println("Было: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("Стало:" + Arrays.toString(arr));
        System.out.println();
    }
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    private static void doHundredArr() {
        int[] arr = new int[100];
        int k = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = k++;
        }
        System.out.println("Задача №2: ");
        System.out.print(Arrays.toString(arr));

        System.out.println(" ");

    }
    //    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    private static void multiplyByTwo() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println();
        System.out.println("Задача №3: ");
        System.out.println("Было: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

        }
        System.out.println("Стало:" + Arrays.toString(arr));
        System.out.println();
    }

    /*    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];*/
    private static void doTwoArray() {
        System.out.println("Задача №4: ");
        int[][] arr = new int[6][6];
        int lastIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                if (i == j) {
                    arr[i][j] = arr[i][lastIndex - i] = 1;
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));

        }
        System.out.println();
    }



    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/
    private static int[] twoValue(int len, int initialValue) {
        System.out.println("Задача №5: ");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        return arr;
    }

    //    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы; //не понял

    private static void foundMinMax() {
        System.out.println("Задача №6: ");

        int[] arr = {6, 52, 1, 14, 46, 2, 1864};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Максимальное число " + max + "\n" + "Минимальное число " + min);
        System.out.println();
    }



    /* 8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.*/

    public static void startEightTask() {
        int[] eightArray = {1, 2, 3, 4, 5, 6};
        eightTask(eightArray, -1);
        System.out.println(Arrays.toString(eightArray));
    }

    public static int[] eightTask(int[] array, int move) {
        if (move > 0) {
            for (int s = 1; s <= move; s++) {
                int elemshift = array[array.length - 1];
                for (int i = array.length - 2; i >= 0; i--) {
                    array[i + 1] = array[i];
                }
                array[0] = elemshift;
            }
        } else if (move < 0) {
            for (int s = move; s <= -1; s++) {
                int elemshift = array[0];
                for (int i = 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
                array[array.length - 1] = elemshift;
            }
        }
        return array;
    }
}






















