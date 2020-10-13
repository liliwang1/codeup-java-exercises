package grocery;

import java.util.Comparator;

public class SortByName implements Comparator<GroceryItem>
{
    public int compare(GroceryItem a, GroceryItem b)
    {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}