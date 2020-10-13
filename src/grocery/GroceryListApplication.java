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
        items.values();
        items.keySet();

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
        valueList.removeIf(i -> !i.getCategory().equalsIgnoreCase("Produce"));
//        List<String> keyList = new ArrayList<>(items.keySet());
//        Collections.sort(keyList);
        Collections.sort(valueList, new SortByName());
        Collections.sort(valueList, new SortByCategory());
        for (GroceryItem i : valueList)
            System.out.printf("name: %-20s quantity: %-5s category: %s%n", i.getName() + ",", i.getQuantity() + ",", i.getCategory());
    }

    public static void displayByCategory() {
        while(scanner.yesNo("Do you want to  see the list by category? y/yes")) {

        }
    }

    public static void editList() {
        while (scanner.yesNo("Do you need to edit an item? y/yes")) {
            addAnItem();
        }
        displayList();
    }

    public static void addAnItem() {
        String name = scanner.getString("Enter the name of the item: ");
        int quantity = scanner.getInt(1, 10000, "Enter the quantity of the item: ");
        String category = scanner.getString("Enter the category of the item from the list below: \n" + categories); // validation needed
        GroceryItem item = new GroceryItem(name, quantity, category);
//        items.putIfAbsent(name, item);
        items.put(name, item);
    }

    public static void initiateCategoryList() {
        String[] categoriesArray = {"Beverages", "Bakery", "Canned goods", "Dairy", "Baking goods", "Frozen food", "Meat", "Produce", "Other"};
        categories = new ArrayList<>(Arrays.asList(categoriesArray));
    }
}
