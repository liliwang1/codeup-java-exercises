package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = capitalizeFirstLetter(name.trim());
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category.trim().toLowerCase();
    }

    public static String capitalizeFirstLetter(String text) { // should not be in this class, utility
        String c = (text != null) ? text.trim() : "";
        String[] words = c.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(w.length() > 1 ? w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase() : w.toUpperCase()).append(" ");
        }
        return result.toString().trim();
    }
}

