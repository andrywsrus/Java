package homeWorkLessonSeven.oop;
import java.util.concurrent.ThreadLocalRandom;
public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        int catEatFoodCount = ThreadLocalRandom.current().nextInt(4) + 3;
        plate.decreaseFood(catEatFoodCount);
        System.out.print("Кот " + name + " съел " + catEatFoodCount + " корма. ");
    }
}