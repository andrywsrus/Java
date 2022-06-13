package homeWorkLessonSeven.oop;

public class Plate {
    public int foodCount;
    public Plate(int food) {
        this.foodCount = food;
    }
    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }
    public void increaseFood(int catAddFoodCount) {
        foodCount += catAddFoodCount;
    }
    public void printInfo() {
        System.out.println("Корма в миске: " + foodCount + ".");
    }
}

