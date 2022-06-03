package homeWorkLessonSix;

public class Cat extends Animals{

    private String purringCat;
    protected int distance;
    protected static int countCats;


    public Cat(String nickname, int distance, String stateOfAngryAnimals, String purringCat) {
        super(nickname, distance, stateOfAngryAnimals);
        this.purringCat = purringCat;
        countCats++;
    }


    @Override
    public void doRun() {

        if (getDistance() <= 200) {
            System.out.printf("%s %s %s и пробежал %d метр(а/ов).%n", getStateOfAngryAnimals(), getNickname(), getpurringCat(), getDistance());
        } else if (getDistance() > 200) // ограничение коту, больше 200 метров не бежит
            System.out.printf("%s %s %s и ОТКАЗЫВАЕТСЯ бежать такое (%dм.) расстояние.%n", getStateOfAngryAnimals(), getNickname(), getpurringCat(), getDistance());

    }

    @Override
    public void doSwimm() {

        if (getDistance() <= 0) {
            System.out.printf("%s %s просто %s.%n", getStateOfAngryAnimals(), getNickname(), getpurringCat(), getDistance());
        } else if (getDistance() >= 1)// ограничение коту, плавать не умеет
            System.out.printf("%s %s %s, поверил в себя - разбежался, прыгнул в воду и утонул((.%n", getStateOfAngryAnimals(), getNickname(), getpurringCat(), getDistance());
        System.out.println();
    }
    public void PrintCountCats(){
        System.out.print(countCats + " кот(а/ов)");
    }

    public String getpurringCat() {
        return purringCat;
    }

    public void setpurringCat(String purringCat) {
        this.purringCat = purringCat;
    }

    public void setcountCats(int countCats) {

    }

}