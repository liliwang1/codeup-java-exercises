package grocery;

import java.util.Comparator;

public class SortByCategory implements Comparator<GroceryItem>
{
    public int compare(GroceryItem a, GroceryItem b)
    {
        return a.getCategory().compareToIgnoreCase(b.getCategory());
    }
}

