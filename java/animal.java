import java.util.Scanner;

/**
 * Animal
 */
public class Animal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your favorite animal:");
        String favoriteAnimal = scanner.nextLine();
        scanner.close();
        System.out.println("Your favorite animal is " + favoriteAnimal);

    }
}
