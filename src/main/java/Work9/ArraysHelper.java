package Work9;

import java.util.Arrays;

public class ArraysHelper {

    public int doArrays(String[][] fourFourArray) throws MySizeSymbolArrayEx, MyArrayDataException, MySizeArrayException {
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
        System.out.print("Сумма чисел двумерного массива равна : ");
        return sum;
    }
}
