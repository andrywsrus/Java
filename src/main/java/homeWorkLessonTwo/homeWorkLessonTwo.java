//Домашнее задание по уроку 2

package homeWorkLessonTwo;

public class homeWorkLessonTwo {

    // Задание 1
    public static void main(String[] args) {
        System.out.println(); // отступим для наглядности
        System.out.println("Задание № 1.");
        SummaAandB(10, 10);
        System.out.println(); // отступим для наглядности
        System.out.println("Задание № 2.");
        PrintNumber(5);
        System.out.println(); // отступим для наглядности
        System.out.println("Задание № 3.");
        PrintNumberTwo(-3);
        System.out.println(); // отступим для наглядности
        System.out.println("Задание № 4.");
        PrintConsole("Съешь еще этих мягких французских булок", 0);
        System.out.println(); // отступим для наглядности
        System.out.println("Задание № 5*.");
        LeapYear();
    }


    private static void SummaAandB(int varA, int varB) {

        int result = varA + varB;
        boolean resultSumma = setReturnBoolean(result);
        System.out.println(resultSumma);
    }

    private static boolean setReturnBoolean(int result) {
        if (result >= 10 && result <= 20) {
            System.out.print("Сумма: " + result + " находится в промежутке между 10 и 20 включительно, по условию возвращаем ");
            return true;
        } else
            System.out.print("Сумма: " + result + " не находится в промежутке между 10 и 20 включительно, по условию возвращаем ");
        return false;

    }


    //Задание 2
    private static void PrintNumber(int numberOne) {

        int result = numberOne;
        if (result >= 0) {
            System.out.println("Число: " + result + " больше или равно 0, значит число положительное");
        } else
            System.out.println("Число: " + result + " меньше 0, значит число отрицательное");
    }

// Задание 3

    private static void PrintNumberTwo(int booleanNumber) {


        int resultTwo = booleanNumber;
        boolean resultBoolean = setReturnBooleanTwo(resultTwo);
        System.out.println(resultBoolean);
    }

    private static boolean setReturnBooleanTwo(int resultTwo) {
        if (resultTwo >= 0) {
            System.out.print("Число: " + resultTwo + " больше или равно 0, значит число положительное, по условию возвращаем ");
            return false;
        } else
            System.out.print("Число: " + resultTwo + " меньше 0, значит число отрицательное, по условию возвращаем ");
        return true;
    }

// Задание 4

    private static void PrintConsole(String str, int numberLine) {
        if (numberLine > 0) {
            System.out.println("Печатаем текст в консоль " + numberLine + " раз(раза):"); // для наглядности, выожу число, сколько строк должно напечататься
            for (int i = 0; i < numberLine; i++) {
                System.out.println(str);
            }
        } else System.out.println("Печатать нечего!"); // если ноль или отрицательное значение

    }

// Задание 5*


    private static boolean LeapYear() {
        int leapYear=400;
        if (((leapYear % 100) == 0) ^ ((leapYear % 400) == 0)) {
            System.out.println(leapYear + " год не високоный");
            return false;
        } else if (leapYear % 400 == 0) {
            System.out.println(leapYear + " год високоный");
            return true;
        } else if (leapYear % 4 == 0) {
            System.out.println(leapYear + " год високоный");
            return true;
        } else {
            System.out.println(leapYear + " год не високосный ");
            return false;
        }
    }
}