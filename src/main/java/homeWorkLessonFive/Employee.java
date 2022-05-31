package homeWorkLessonFive;

public class Employee {
    String surname;
    String nameFirst;
    String nameSecond;
    String currentPosition;
    String email;
    String phone;
    int wages;
    int age;

    public Employee(String surname, String nameFirst, String nameSecond, String currentPosition, String email, String phone, int wages, int age) {

        this.surname = surname;
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
        this.currentPosition = currentPosition;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
        System.out.printf("%s: %s %s %s, %n", currentPosition, surname.toUpperCase(), nameFirst.toUpperCase(), nameSecond.toUpperCase());
    }
    void printInfo(){
        System.out.println();
        System.out.printf("%s, %s %s %s %n возраст: %d года, %n зарабатывает: %d рублей. %n телефон: %s,%n e-mail: %s%n", currentPosition.toUpperCase(), surname, nameFirst, nameSecond, age, wages, phone, email);
    }
    void printInfoOldman(){
        System.out.printf("Сотруднику %s %s %s больше 40 лет, его возраст: %d года %n", surname.toUpperCase(), nameFirst.toUpperCase(), nameSecond.toUpperCase(), age);
    }

}