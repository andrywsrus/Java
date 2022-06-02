// Домашнее задание, урок 3

package homeWorkLessonThree;

import java.util.Arrays;

public class homeWorkLessonThree {

    public static void main(String[] args) {
        System.out.println(); // для нагладности пропустим строку
        System.out.println("Задание 1");
        testCreateArray();
        System.out.println("Задание 2");
        testOneHandredArray();
        System.out.println("Задание 3");
        ArrayThixOnTwo();
        System.out.println("Задание 4");
        SquaredArray();
        System.out.println("Задание 5");
        UnivariateArray(10, 5);
        System.out.println("Задание 6*");
        MinMaxArray();
        System.out.println("Задание 7**");
        ComparsionArray(new int[]{1, 2, 3, 4, 10});
        System.out.println("Задание 8***");
        OffsetArray(new int[]{1, 2, 3, 4, 5}, -1);
    }


    // Задание 1
    private static void testCreateArray() {

        int[] ourNewArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Создаём массив:  1 1 0 0 1 0 1 1 0 0");
        System.out.print("Инвертируем его: ");
        for (int i = 0; i < ourNewArray.length; i++) {


            if (ourNewArray[i] == 1) {

                ourNewArray[i] = 0;

            } else if (ourNewArray[i] == 0) {

                ourNewArray[i] = 1;
            }
            System.out.print(ourNewArray[i] + " ");
        }

        System.out.println(); // для нагладности пропустим строку
        System.out.println(); // для нагладности пропустим строку
    }

    //Задание 2

    private static void testOneHandredArray() {

        int[] oneHandredArray = new int[101];
        System.out.println("Создаём массив и заполняем его от 1 до 100 включительно:");
        for (int i = 1; i < oneHandredArray.length; i++) {
            oneHandredArray[i] = i;
            System.out.print("" + oneHandredArray[i] + " ");

        }
        System.out.println(); // для нагладности пропустим строку
        System.out.println(); // для нагладности пропустим строку
    }

    //Задание 3

    private static void ArrayThixOnTwo() {

        int[] ourNewArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Создаём массив: 1  5 3 2 11 4  5 2 4 8 9 1");
        System.out.print("числа < 6 * 2:  ");
        for (int i = 0; i < ourNewArray.length; i++) {


            if (ourNewArray[i] < 6) {

                ourNewArray[i] *= 2;

            }
            System.out.print(ourNewArray[i] + " ");
        }

        System.out.println(); // для нагладности пропустим строку
        System.out.println(); // для нагладности пропустим строку

    }

    //Задание 4
    private static void SquaredArray() {

        int[][] squaredArray = new int[3][3];
        for (int i = 0; i < squaredArray.length; i++) {
            for (int j = 0; j < squaredArray[0].length; j++) {
                if ((i + j) % 2 == 0) squaredArray[i][j] = 1;
                else squaredArray[i][j] = 0;
                System.out.print(squaredArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); // для нагладности пропустим строку
    }

    //Задание 5

    private static int UnivariateArray(int len, int initialValue) {

        int[] lenArray = new int[len];
        System.out.println("Создаём массив длиной " + lenArray.length + " и заполняем его числами " + initialValue);
        for (int i = 0; i < lenArray.length; i++) {
            lenArray[i] = initialValue;
            System.out.print(lenArray[i]);
        }
        System.out.println(); // для нагладности пропустим строку
        System.out.println(); // для нагладности пропустим строку
        return len;
    }

    //Задание 6*

    private static void MinMaxArray() {
        int[] ourArray = {197, 25, 253, 4129, 53};

        int max = getMaximum(ourArray);// getMax получаем максимум
        System.out.println("Максимальный элемент: " + max);


        int min = getMinimum(ourArray);//  getMin  -  получаем минимум
        System.out.println("Минимальный элемент: " + min);
        System.out.println(); // для нагладности пропустим строку

    }

    //находим максимальный элемент
    public static int getMaximum(int[] ourArray) {
        int maximum = ourArray[0];
        for (int i = 1; i < ourArray.length; i++) {
            if (ourArray[i] > maximum) {
                maximum = ourArray[i];
            }
        }
        return maximum;
    }

    // находим минимальный элемент
    public static int getMinimum(int[] ourArray) {
        int minimum = ourArray[0];
        for (int i = 1; i < ourArray.length; i++) {
            if (ourArray[i] < minimum) {
                minimum = ourArray[i];
            }
        }

        return minimum;
    }


    //Задание 7**

    public static boolean ComparsionArray(int[] ourArray) {
        int sumLeft = 0;
        int sum = 0;
        for (int element :
                ourArray) {
            sum += element;
        }
        for (int i = 0; i < ourArray.length; i++) {
            sumLeft += ourArray[i];
            if (sumLeft == (sum - sumLeft)){
                System.out.println("true");
                System.out.println(); // для нагладности пропустим строку
                return true;
            }
        }
        System.out.println("false");
        System.out.println(); // для нагладности пропустим строку
        return false;

    }


    //Задание 8***

    private static void OffsetArray(int[] ourArray, int n) {

        for (int i = 0; i < ourArray.length; i++) {
            if (n == 0) {
                break;
            } else ourArray[i] += n;
            System.out.print(ourArray[i] + " ");
        }
        System.out.println(); // для нагладности пропустим строку
    }
}
