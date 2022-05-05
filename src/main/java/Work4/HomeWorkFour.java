package Work4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFour {

    static int SIZE = 3;

    final static char EMPTY = '•';
    final static char HUMAN = 'X';
    final static char AI = '0';

    static char[][] AREA = new char[SIZE][SIZE];
    static final String SPACE = " ";
    static final String HEAD_SYMBOL = "◘";
    static int turnsCount = 0;
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();


    public static void startGame() {

        do {
            System.out.println("\n\n НАЧНЕМ ЖЕ");

            init();
            printArea();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        turnsCount = 0;
        System.out.println("Введите желаемый размер поля");
        SIZE = scan.nextInt();

        //Подобрать победную серию фишек для заданного поля // Не успел сделать
        AREA = new char[SIZE][SIZE];
        initialisationArea();
    }


    private static void printArea() {
        printAreaHead();
        printAreaBody();
    }

    private static void initialisationArea() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                AREA[i][j] = EMPTY;
            }
        }
    }

    private static void printAreaHead() {
        System.out.print(HEAD_SYMBOL + SPACE);
        for (int i = 0; i < SIZE; i++) {
            printAreaNumbers(i);

        }
        System.out.println();
    }

    private static void printAreaBody() {
        for (int i = 0; i < SIZE; i++) {
            printAreaNumbers(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(AREA[i][j] + SPACE);


            }
            System.out.println();
        }
    }

    private static void printAreaNumbers(int i) {
        System.out.print(i + 1 + SPACE);
    }

    private static void playGame() {
        while (true) {
            humanStep();
            printArea();
            if (checkEnd(HUMAN)) {
                break;
            }


            aiStep();
            printArea();
            if (checkEnd(AI)) {
                break;
            }

        }

    }

    private static void humanStep() {
        System.out.println("Ходи, человечек");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки ");
            rowNumber = getValidNumberFromUser() - 1;

            System.out.print("Введите координату столбца ");
            columnNumber = getValidNumberFromUser() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;

            }
            System.out.println("Ячейка занята, введите заново");
        }

        AREA[rowNumber][columnNumber] = HUMAN;
        turnsCount++;

    }

    private static int getValidNumberFromUser() {
        while (true) {
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                if (isvVlidNumber(n)) {
                    return n;
                }
                System.out.println("Проверьте значение координаты. Должно быть от 1 до" + SIZE);
            } else
                scan.next();
            System.out.println("\nТолько целые числа ");
        }

    }

    private static boolean isvVlidNumber(int n) {
        return n >= 1 && n <= SIZE;
    }


    private static boolean isCellFree(int rowNumber, int columnNumber) {

        return AREA[rowNumber][columnNumber] == EMPTY;

    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == HUMAN) {
                System.out.println("\n Победил ты, человек, но это пока ");
            } else {
                System.out.println("\n Трепещите, кожанные! Компуктер выиграл!");
            }
            return true;
        }

        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;

    }

    private static boolean checkWin(char symbol) {

        if (AREA[0][0] == symbol && AREA[0][1] == symbol && AREA[0][2] == symbol) return true;
        if (AREA[1][0] == symbol && AREA[1][1] == symbol && AREA[1][2] == symbol) return true;
        if (AREA[2][0] == symbol && AREA[2][1] == symbol && AREA[2][2] == symbol) return true;
        if (AREA[0][0] == symbol && AREA[1][0] == symbol && AREA[2][0] == symbol) return true;
        if (AREA[0][1] == symbol && AREA[1][1] == symbol && AREA[2][1] == symbol) return true;
        if (AREA[0][2] == symbol && AREA[1][2] == symbol && AREA[2][2] == symbol) return true;
        if (AREA[0][0] == symbol && AREA[1][1] == symbol && AREA[2][2] == symbol) return true;
        if (AREA[2][0] == symbol && AREA[1][1] == symbol && AREA[0][2] == symbol) return true;
        return false;

    }

    private static boolean checkDraw() {
/*        for (char[] chars : AREA) {
            for (char symbol : chars) {

                if (symbol == EMPTY) {
                    return false;
                }

            }

        }
        return true;*/
        return turnsCount >= SIZE * SIZE;


    }


    private static void aiStep() {
        System.out.println("Ход PC ");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);

        } while (!isCellFree(rowNumber, columnNumber));

        AREA[rowNumber][columnNumber] = AI;
        turnsCount++;

    }


    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y/n");
        return switch (scan.next()) {
            case "y" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        scan.close();
        System.out.println("Возвращайся, скорее, программирование само себя не выучит. ");

    }
}

