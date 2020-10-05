package oop;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 3000;
        dish1.nameOfDish = "pizza";
        dish1.wouldRecommend = true;

        dish1.printSummary();

        System.out.println(DishTools.AVERAGE_COST_OF_DISH_IN_CENTS);
        DishTools.shoutDishName(dish1);
        DishTools.analyzeDishCost(dish1);
        System.out.println(DishTools.flipRecommendation(dish1));
    }
}
