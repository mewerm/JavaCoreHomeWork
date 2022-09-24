package Work14.Work3;

import Work14.Work3.Work3Task7;
import org.junit.jupiter.api.*;

class Wor3Task7Test {
    private Work3Task7 task7;

    @BeforeEach
    void setUp() {
        System.out.println("Начинается тест");
        task7 = new Work3Task7();
    }

    @AfterEach
    void shotdown() {
        System.out.println("Тест завершается");
    }

    @DisplayName("Тест соответствия ячеек массива ")
    @Test
    void testArray() {
        int[] forSevenArray = {777, 543, 32, 543, 32, 777};
        int[] forSevenArray2 = {777, 543, 32, 543, 32, 777};

        task7.checkBalance(forSevenArray);
        Assertions.assertArrayEquals(forSevenArray, forSevenArray2);
    }

  /*  @DisplayName("Тест массива ")
    // я понимаю, что нужно проверить на фолс, что нет места где сумма ячеек равна, а как это реализовать не знаю каким assert не понятно.
*//*    @Test
    void testArray2() {
        int[] forSevenArray = {777, 543, 32, 543, 32, 777};
        Assertions.assertTrue(true, () -> {
            int[] forSevenArray2 = {777, 543, 32, 543, 32, 776};
            task7.checkBalance(forSevenArray2);
        });

    }*/
}