package Work9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[][] fourFourArray = {{"1", "2", "3",/*"3", */"4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},/*{"9", "10", "11", "12"},*/ {"13", "14" /*+"d"*/,"15", "16"}};

        try {
            int runMethod = doArrays(fourFourArray);
            System.out.println(runMethod);


        } catch (MySizeArrayException e) {
            e.printStackTrace();
            System.err.println("Количество массивов превышено - максимум 4 ");
            System.exit(1);

        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.err.println("В массиве должны быть только числа! ");
            System.err.println("Ошибка здесь: массив[" + e.arrNum + "] ячейка[" + e.symbolNum + "]" + "\n" + "Исправь на число и возвращайся обратно");
            System.exit(1);
            //максимально не френдли)
        } catch (MySizeSymbolArrayEx e){
            e.printStackTrace();
            System.err.println("В каком-то из массивов количество ячеек не равно 4");
            System.exit(1);
        }finally {
            System.out.println("Круто когда нет ошибок");
            System.exit(1);
        }
    }

    private static int doArrays(String[][] fourFourArray) throws MySizeSymbolArrayEx, MyArrayDataException, MySizeArrayException {
        int sum = 0;

        if (fourFourArray.length > 4) {
            throw new MySizeArrayException("ОШИБКА В КОЛИЧЕСТВЕ МАССИВОВ");
        }
        for (int i = 0; i < fourFourArray.length; i++) {
            for (int j = 0; j < fourFourArray[i].length; j++) {
                if (fourFourArray[j].length != 4) {
                    throw new MySizeSymbolArrayEx("ОШИБКА В КОЛИЧЕСТВЕ ЯЧЕЕК");
                }
                try {
                    sum = sum + Integer.parseInt(fourFourArray[i][j]);
                    System.out.println(Arrays.deepToString(fourFourArray));
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j, "ОШИБКА В ТИПЕ ДАННЫХ В ЯЧЕЙКЕ(АХ)");
                }
            }
        }
        System.out.print("Сумма чисел двумерного массива равна: ");
        return sum;
    }
}

