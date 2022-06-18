package Work9;


import org.junit.jupiter.api.*;

class ArraysHelperTest {

    private ArraysHelper arraysHelper;

    @BeforeEach
    void setUp() {
        System.out.println("Начинается тест");
        arraysHelper = new ArraysHelper();
    }
    @AfterEach
    void shotdown() {
        System.out.println("Тест завершается");
    }


    @Test
    @DisplayName("Проверка на количество ячеек в массиве")
    void MySizeSymbolArrayExTest() {
        String[][] fourFourArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"10", "11", "12", "12", "14"}, {"13", "14", "15", "16"}};
        Assertions.assertThrows(MySizeSymbolArrayEx.class, () -> arraysHelper.doArrays(fourFourArray));
    }

    @Test
    @DisplayName("Проверка на количество массивов")
    void MySizeArrayException() {
        String[][] fourFourArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}, {"1", "2", "3"}};
        Assertions.assertThrows(MySizeArrayException.class, () -> arraysHelper.doArrays(fourFourArray));
    }

    @Test
    @DisplayName("Проверка на тип данных в массивах")
    void MyArrayDataException() {
        String[][] fourFourArray = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "d"}};
        Assertions.assertThrows(MyArrayDataException.class, () -> arraysHelper.doArrays(fourFourArray));
    }
}