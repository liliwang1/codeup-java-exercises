package grocery;

import util.InputAlt;

import java.util.*;

public class GroceryListApplication {
    public static ArrayList<String> categories;
    public static HashMap<String, GroceryItem> items = new HashMap<>();
    static InputAlt scanner = new InputAlt();

    public static void main(String[] args) {
        initiateCategoryList();
        initiateApp();

        // tests
        System.out.println(items.values());
        System.out.println(items.keySet());
        System.out.println(items);
        System.out.println(categories);
    }

    public static void initiateApp() {
        if (scanner.yesNo("Would you like to create a grocery list? y/yes"))
            addItems();
        else
            System.out.println("OK, Goodbye. Have a nice day!");
    }

    public static void addItems() {
        do {
            addAnItem();
        } while (scanner.yesNo("Add another item? y/yes")); // no to finalize list??
        displayList();
        editList();
    }

    public static void displayList() {
        System.out.println("This is your grocery list: ");
        List<GroceryItem> valueList = new ArrayList<>(items.values());
//        List<String> keyList = new ArrayList<>(items.keySet());
//        Collections.sort(keyList);
        Collections.sort(valueList, new SortByName()); // valueList.sort(new SortByName());  valueList.sort(null);
        Collections.sort(valueList, new SortByCategory());
        for (GroceryItem i : valueList)
            System.out.printf("name: %-20s quantity: %-5s category: %s%n", i.getName() + ",", i.getQuantity() + ",", i.getCategory());
        displayByCategory(valueList);
    }

    public static void displayByCategory(List<GroceryItem> valueList) {
//        while (scanner.yesNo("See the list by a category? y/yes")) {
        if (scanner.yesNo("See the list by a category? y/yes")) {
            String category = scanner.getString("Enter the category that you want to see: ").trim().toLowerCase();
//            valueList.removeIf(i -> !i.getCategory().equalsIgnoreCase(category)); // will change valueList
            if (categories.contains(category)) {
                System.out.println("Here is your list by the chosen category: ");
                for (GroceryItem i : valueList) {
                    if (i.getCategory().equalsIgnoreCase(category))
                        System.out.printf("name: %-20s quantity: %-5s category: %s%n", i.getName() + ",", i.getQuantity() + ",", i.getCategory());
                }
            } else
                System.out.println("Sorry, there is no such category.");
            displayByCategory(valueList);
        }
    }

    public static void editList() {
        while (scanner.yesNo("Do you need to edit an item? y/yes")) { // deleteAnItem functionality
            addAnItem();
        }
        displayList();
    }

    public static void addAnItem() {
        String name = scanner.getString("Enter the name of the item: ");
        int quantity = scanner.getInt(1, 10000, "Enter the quantity of the item: ");
        String category = scanner.getString("Enter the category of the item from the list below: \n" + categories); // validation needed: categories.contains(userInput)
        GroceryItem item = new GroceryItem(name, quantity, category);
//        items.putIfAbsent(name, item);
        items.put(name, item);
    }

    public static void initiateCategoryList() {
        String[] categoriesArray = {"beverages", "bakery", "canned goods", "dairy", "dry goods", "frozen food", "meat", "produce", "other"};
        categories = new ArrayList<>(Arrays.asList(categoriesArray));
    }
}
