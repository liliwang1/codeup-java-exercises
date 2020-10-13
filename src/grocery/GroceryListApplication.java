package grocery;

import util.InputAlt;

import java.util.ArrayList;
import java.util.HashMap;

public class GroceryListApplication {
    public static ArrayList<String> category = new ArrayList<>();
    public static HashMap<String, Integer> item = new HashMap<>();
    static InputAlt scanner = new InputAlt();

    public static void main(String[] args) {
        category.add("a");
        category.add("a");
        category.add("a");
        category.add("a");
        item.put("a", 1);
        item.put("a", 2);
        item.put("b", 2);

        System.out.println(category);
        System.out.println(item);
    }
}
