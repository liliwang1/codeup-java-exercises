public class ServerNameGenerator {
    static String[] adjectives = {"fluffy", "soft", "cute", "sweet", "warm", "lovely", "kawai", "pink", "dainty", "round"};
    static String[] nouns = {"puppy", "kitten", "teddybear", "bunny", "hamster", "heart", "pony", "coffee", "book", "pumpkin"};

    static String generateRandomString(String[] strArr) {
        int randomNum = (int) (Math.random() * strArr.length);
        return strArr[randomNum];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name:%n%s - %s%n", generateRandomString(adjectives), generateRandomString(nouns));
    }
}
