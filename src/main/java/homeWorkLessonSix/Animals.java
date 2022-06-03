package homeWorkLessonSix;

import static homeWorkLessonSix.Dog.countDogs;
import static homeWorkLessonSix.Cat.countCats;
public class Animals {
    private String nickname;
    private int distance;
    private String stateOfAngryAnimals;




    public Animals(String nickname, int distance, String stateOfAngryAnimals) {
        this.nickname = nickname;
        this.distance = distance;
        this.stateOfAngryAnimals = stateOfAngryAnimals;


    }



    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void printInfo() {
        System.out.println(this);
    }


    public void doAction() {
        System.out.println(stateOfAngryAnimals + " " + nickname + " что-то делает...");
    }
    public void doRun() {
        System.out.printf("%s %s пробежал %d метра(ов)%n", stateOfAngryAnimals, nickname, distance);
    }
    public void doSwimm() {
        System.out.printf("%s %s проплыл %d метра(ов)%n", stateOfAngryAnimals, nickname, distance);
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStateOfAngryAnimals() {
        return stateOfAngryAnimals;
    }

    public void setStateOfAngryAnimals(String stateOfAngryAnimals) {
        this.stateOfAngryAnimals = stateOfAngryAnimals;
    }

    public void getcountCats(int countCats) {

    }
    public void getcountDogs(int countDogs) {

    }
    public static void printAnimals() {

        System.out.print("Всего животных: " + (countDogs + countCats) + ". Из них: ");
    }
}
