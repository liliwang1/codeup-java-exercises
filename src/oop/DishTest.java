package oop;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 1000;
        dish1.nameOfDish = "pizza";
        dish1.wouldRecommend = true;

        dish1.printSummary();
    }
}
