package homeWorkLessonSeven.oop;

import java.util.Scanner;

public class Test {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Покормим котов.");
    int doAction;
    Cat[] ourCats = new Cat[4];
    ourCats[0] = new Cat("Ричард", 20, false);
    ourCats[1] = new Cat("Матроскин", 10, false);
    ourCats[2] = new Cat("Барсик", 13, false);
    ourCats[3] = new Cat("Мурзик", 50, false);

    Plate plate = new Plate(50);
    plate.printInfo();
    for (int i = 0; i < ourCats.length; i++) {
        if (ourCats[i].satiety == false && ourCats[i].appetite < plate.foodCount) {
            ourCats[i].eat(plate);
            ourCats[i].satiety = true;
            System.out.println("Кот " + ourCats[i].name + " поел.");
        } else {
            System.out.println("Кот " + ourCats[i].name + " сыт.");
                }
    }
    plate.printInfo();
    System.out.print("Добавьте корма в миску(введите число): ");
    doAction = in.nextInt();
    plate.increaseFood(doAction);
    plate.printInfo();
    }
}
/*7 Задание
1. Расширить задачу про котов и тарелки с едой

2. Добавить проверку, чтобы из тарелки нельзя было взять больше еды, чем в ней есть на текущий момент

3. Каждому коту добавить boolean поле сытность (по-умолчанию все коты голодные, т.е. сытность=false)

4. Считаем, что если коту недостаточно еды в тарелке, то он не ест из этой тарелки. Если коту достаточно еды, то он ее ест и становится сытым

5. Продемонстрировать логику программы. Создать массив котов и тарелку с каким-то количеством еды. Всех котов направляем есть из этой тарелки.
   После прохода массива продемонстрировать, какие коты стали сытые, а какие остались голодные. Значения можно придумать самому

6. Добавить в класс тарелки метод, позволяющий увеличивать количество еды в тарелке (просто прибавлять)*/