package Work9;

public class Main {

    public static void main(String[] args) {
        ArraysHelper arraysHelper = new ArraysHelper();

        String[][] fourFourArray = {{"1", "2", "3",/*"3", */"4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"},/*{"9", "10", "11", "12"},*/ {"13", "14" /*+"d"*/,"15", "16"}};

        try {
            int runMethod = arraysHelper.doArrays(fourFourArray);
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
}

