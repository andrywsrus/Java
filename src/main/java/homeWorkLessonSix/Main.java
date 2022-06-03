package homeWorkLessonSix;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.print("Введите дистанцию, не которую хотите отправить животное:");
        System.out.print("");
        int distance = in.nextInt();
// создаём объекты животных
        Dog dog = new Dog("Тузик", distance,"строгий ошейник с намордником");
        Dog dog2 = new Dog("Бобик", distance,"железный намордник");
        Cat cat = new Cat("Мурзик", distance,"довольный", "замурлыкал");
        Cat cat2 = new Cat("Барсик", distance,"расстроеный", "фыркнул");

// печатаем действия собак
        dog.doRun();
        dog.doSwimm();
        dog2.doRun();
        dog2.doSwimm();
// печатаем действия котов
        cat.doRun();
        cat.doSwimm();
        cat2.doRun();
        cat2.doSwimm();

// задание 4*
// печатаем счётчики животных и собак с котами по отдельности

        Animals.printAnimals();
        dog.PrintCountDogs();
        cat.PrintCountCats();
    }
}
