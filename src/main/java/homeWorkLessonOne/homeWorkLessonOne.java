package homeWorkLessonOne; //создаем новый, пустой проект

public class homeWorkLessonOne { // создание класса HomeWorkApp
    public static void main(String[] args) { //прописываем метод main
        printThreeWords(); //вызываем метод printThreeWords
        checkSumSign(); //вызываем метод checkSumSign
        printColor(); //вызываем метод printColor
        compareNumbers(); //вызываем метод printColor
    }

    private static void printThreeWords() { // создаём метод printThreeWords
        System.out.println("Orange"); //печатаем c переводом строки Orange
        System.out.println("Banana" ); //печатаем c переводом строки Banana
        System.out.println("Apple"); //печатаем c переводом строки Apple
    }

    private static void checkSumSign() { // создаём метод checkSumSign
        System.out.println(); //для наглядности отступим на одну строку от столбика с фруктами
        int varA = 0;
        int varB = -1;
        if ((varA+varB)>=0){ // если условие выполнится печатаем положительно
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная"); // если условие не выполнится печатаем отрицательно
    }

    private static void printColor() { // создаём метод printColor
        System.out.println(); //для наглядности отступим на одну строку от вывода результата сумм
        int value = -20;
        if (value <= 0) { // если меньше или равно 0 - печатаем Красный
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) { // если value больше 0 И меньше или равно 100 - печатаем Желтый
            System.out.println("Желтый");
        } else
            System.out.println("Зелёный");// если предыдущие два условия false, значит value больше 100 - печатаем Зеленый

    }

    private static void compareNumbers() { // создаём метод compareNumbers
        System.out.println(); //для наглядности отступим на одну строку от столбика с цветом
        int varA = -10;
        int varB = 5;
        if (varA>=varB){ // если а больше или равно b - печатаем a >= b
            System.out.println("a >= b ");
        }  else
            System.out.println("a < b "); // иначе, если a не больше и на равно b - печатаем a < b

    }
}


