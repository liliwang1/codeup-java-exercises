package extraarrayexercises;

import util.Input;

public class GroceryList {
    /*1. Create a command line grocery list maker
        - before prompting the user to enter each item, ask how many items will be
          entered
        - for each item, the user should be prompted to enter in the name, quantity,
          and category of each grocery item
        - Create a `GroceryItem` class from which to instantiate `GroceryItem`
          objects to store in an array
        - once the user has entered all items, print out all items grouped by
          category and alphabetized in each group*/
    public static void main(String[] args) {
        Input input = new Input();
        int itemsNumber = input.getInt("How many items will be entered into the grocery list?");

        GroceryItem[] groceryItems = new GroceryItem[itemsNumber];

        for (int i = 0; i < itemsNumber; i++) {
            groceryItems[i] = new GroceryItem();
            groceryItems[i].setName(input.getString("Enter name of the grocery item: "));
            groceryItems[i].setQuantity(input.getInt("Enter quantity of the grocery item: "));
            groceryItems[i].setCategory(input.getString("Enter category of the grocery item: "));
        }
    }

    public void displayGrocery(GroceryItem[] groceryArr) {

    }

}
