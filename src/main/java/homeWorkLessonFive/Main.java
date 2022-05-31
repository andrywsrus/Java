package homeWorkLessonFive;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.printf("Список новых сотрудников:%n");
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов", "Иван", "Иванович", "Директор", "ivanov@geekbrains.ru", "+7-903-123-45-67", 100000, 54);
        employeeArray[1] = new Employee("Петров", "Петр", "Петрович", "Менеджер", "petrov@geekbrains.ru", "+7-916-765-43-21", 52150, 32);
        employeeArray[2] = new Employee("Андреев", "Андрей", "Андреевич", "Инженер", "andreev@geekbrains.ru", "+7-926-123-54-23", 63210, 33);
        employeeArray[3] = new Employee("Павлов", "Павел", "Павлович", "Водитель", "pavlov@geekbrains.ru", "+7-910-111-22-33", 45300, 34);
        employeeArray[4] = new Employee("Олегов", "Олег", "Олегович", "Программист", "olegov@geekbrains.ru", "+7-926-987-65-43", 66300, 43);

        employeeArray[0].printInfo();
        employeeArray[1].printInfo();
        employeeArray[2].printInfo();
        employeeArray[3].printInfo();
        employeeArray[4].printInfo();

        /* Выводим сотрудников, кому за 40 */
        System.out.println(); // отступим для наглядности
        System.out.println("Список сотрудников за 40:");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].age >= 40) {;
                employeeArray[i].printInfoOldman();
            }
        }
    }
}
