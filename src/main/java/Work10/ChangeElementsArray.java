package Work10;

import java.util.Arrays;

public class ChangeElementsArray {
    public static void main(String[] args) {

        String[] arr = {"Robot", "play", "wanna", "and", "cry", "wanna", "don't"};

        System.out.println("Тест1 " + "\n" + "Изначальный вариант:" + "\n" + Arrays.deepToString(arr));
        changeArrPosition(arr, 1, 2, 4, 6);
        changeArrPosition(arr, 2, 6);

    }

    private static void changeArrPosition(String[] arr, int pos1, int pos2, int pos3, int pos4) {
        String temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
        String temp2;
        temp2 = arr[pos3];
        arr[pos3] = arr[pos4];
        arr[pos4] = temp2;

        System.out.println("Метод поменял элементы массива местами: " + "\n" + Arrays.deepToString(arr));
    }

    private static void changeArrPosition(String[] arr, int pos1, int pos2) {
        String temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

        System.out.println("Перегруженный метод поменял элементы массива местами: " + "\n" + Arrays.deepToString(arr));

    }

}





