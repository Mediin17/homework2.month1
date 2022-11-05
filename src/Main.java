import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(window(17, 25));
        System.out.println(window(26, 45));
        System.out.println(window(13, 17));
        System.out.println(window(5, 0));
        System.out.println(window(55, -10));
        System.out.println(generateRandomAge(0, 100));

    }

    public static String window(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }
}
