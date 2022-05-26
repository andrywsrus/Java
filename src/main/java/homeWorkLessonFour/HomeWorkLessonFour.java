package homeWorkLessonFour;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessonFour {
    private static Scanner in = new Scanner(System.in);
    public static int size;
    public static int fishkaToWin;
    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static final String HEADER_FIRST_SYMBOL = "#";
    public static char[][] map;

    private static final String SPACE_MAP = "\t";

    private static Random random = new Random();

    private static int turnsCount = 0;

    public static void ternGame() {
        do {
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        howManyWinMapSize();
        howManyFishkaSize();
        initMap();
        turnsCount = 0;
    }

    /*
     ****  Спрашиваем у игрока размерность игрового поля
     ****  и инициализируем массив с проверкой на правильный ввод
     */
    public static void howManyWinMapSize() {

        do {
            System.out.print("Укажите размерность игрового поля, от 3 до 30: ");
            while (!in.hasNextInt()) {                                                  //
                System.out.print("Укажите размерность игрового поля, от 3 до 30: ");    //  **** проверяем что ввели цифру *****
                in.next();                                                              //
            }
            size = in.nextInt();
            map = new char[size][size];
        } while (size < 3 || size > 30);

    }

    /*
     ****  Проверяем размер поля и в зависимости от размера
     ****  указываем сколько фишек необходимо для победы
     */
    private static void howManyFishkaSize() {
        if (size >= 3 && size <= 6) {                       // размер поля 3-6 -> победа на 3 фишках
            fishkaToWin = 3;
        }
        if (size >= 7 && size <= 10) {                      // размер 7-10 -> победа на 4 фшках
            fishkaToWin = 4;
        } else if (size > 10) {                             // размер 10+ -> победа на 5 фишках
            fishkaToWin = 5;
        }
    }

    /*
     ****  Инициализируем и печатаем поле ****
     */
    private static void initMap() {


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void printMapBody() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    /*
     ****  играем ****
     */
    private static void playGame() {
        while (true) {
            humanTern();
            printMap();

            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTern();
            printMap();

            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }
    /*
     ****  Проверяем на конец ****
     */
    private static boolean checkEnd(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("ПОБЕДИЛ КОМПЬЮТЕР");
            }
            return true;
        }

        if (chechDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }
    /*
     ****  Проверяем на победу ****
     */
    private static boolean checkWin(char symbol) {

        for (int col = 0; col < size - fishkaToWin + 1; col++) {
            for (int row = 0; row < size - fishkaToWin + 1; row++) {
                if (checkDiagonal(symbol, col, row) || checkRowColumns(symbol, col, row))
                    return true;
            }
        }
        return false;
    }
    /*
     ****  Проверяем строки и столбцы ****
     */
    private static boolean checkRowColumns(char symbol, int offsetX, int offsetY) {
        boolean columns;
        boolean rows;
        for (int col = offsetX; col < fishkaToWin + offsetX; col++) {
            columns = true;
            rows = true;
            for (int row = offsetY; row < fishkaToWin + offsetY; row++) {
                columns &= (map[col][row] == symbol);
                rows &= (map[row][col] == symbol);
            }

            if (columns || rows) return true;
        }
        return false;
    }

    /*
     **** Проверяем диагонали ****
     */
    private static boolean checkDiagonal(char symbol, int offsetX, int offsetY) {
        boolean slevaNaPravo;
        boolean sPravoNaLevo;
        slevaNaPravo = true;
        sPravoNaLevo = true;
        for (int i = 0; i < fishkaToWin; i++) {
            slevaNaPravo &= (map[i + offsetX][i + offsetY] == symbol);
            sPravoNaLevo &= (map[fishkaToWin - i - 1 + offsetX][i + offsetY] == symbol);
        }

        if (slevaNaPravo || sPravoNaLevo) return true;

        return false;
    }
    /*
     ****  Проверяем на ничью ****
     */
    private static boolean chechDraw() {
        return turnsCount >= size * size;
    }

    private static void humanTern() {
        System.out.println("ХОД ЧЕЛОВЕКА!");

        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.println("Введите координату строки");
            rowNumber = getValidNumberFromScanner() - 1;

            System.out.println("Введите координату столбца");
            columnNumber = getValidNumberFromScanner() - 1;

            if (isaCellFree(rowNumber, columnNumber))
                break;
            System.out.printf("Ячейка с координатами:  %d:%d занята%n%n", +rowNumber + 1, columnNumber + 1);
        }

        map[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }
// проверка на ошибки
    private static int getValidNumberFromScanner() {
        while (true) {
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n)) {
                    return n;
                }
                System.out.println("!Провверьте координаты, дожно быть от 1 до " + size + "!");
            } else {
                System.out.println("!Допускается вводить только целые числа!");
                in.next();
            }
        }
    }

    private static boolean isNumberValid(int number) {
        return number >= 1 && number <= size;
    }

    private static boolean isaCellFree(int rowNumber, int columnNumber) {
        if (map[rowNumber][columnNumber] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    private static void aiTern() {

        System.out.println("ХОД КОМПЬЮТЕРА!");

        int rowNumber;
        int columnNumber;
        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        }
        while (!isaCellFree(rowNumber, columnNumber));

        map[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }


    private static boolean isContinueGame() {
        System.out.println("Хотить продолжить? y\\n");
        return switch (in.next()) {
            case "y", "yes", "д", "да", "н", "+" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("Ты заходи если что, без тебя будет скучно;-)");
        in.close();
    }
}
