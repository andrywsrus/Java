package homeWorkLessonSix;

public class Dog extends Animals {


    private String faceMuzzle;
    protected int distance;
    protected static int countDogs;

    public Dog(String nickname, int distance, String faceMuzzle) {
        super(nickname, distance, "злой");
        this.faceMuzzle = faceMuzzle;
        countDogs++;


    }

    @Override
    public void doRun() {

        if (getDistance() <= 500) {
            System.out.printf("%s %s одел %s и пробежал %d метр(а/ов).%n", getStateOfAngryAnimals(), getNickname(), getDogFaceMuzzle(), getDistance());
        } else if (getDistance() > 500) // ограничение собаке, больше 500 метров не бежит
            System.out.printf("%s %s одел %s и ОТКАЗЫВАЕТСЯ бежать такое (%dм.) расстояние.%n", getStateOfAngryAnimals(), getNickname(), getDogFaceMuzzle(), getDistance());

    }

    @Override
    public void doSwimm() {

        if (getDistance() <= 10) {
            System.out.printf("%s %s одел %s прыгнул в воду и проплыл %d метра(ов).%n", getStateOfAngryAnimals(), getNickname(), getDogFaceMuzzle(), getDistance());
        } else if (getDistance() > 10) // ограничение собаке, больше 10 метров не плывёт
            System.out.printf("%s %s одел %s, проплыл 10 метров и утонул((.%n", getStateOfAngryAnimals(), getNickname(), getDogFaceMuzzle(), getDistance());
        System.out.println();
    }
    public void PrintCountDogs(){
        System.out.printf(countDogs + " собак(и) и ");
    }
    public String getDogFaceMuzzle() {
        return faceMuzzle;
    }

    public void setDogFaceMuzzle(String dogFaceMuzzle) {
        this.faceMuzzle = dogFaceMuzzle;
    }

    public void setcountDogs(int countDogs) {

    }
}
