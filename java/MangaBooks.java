import java.util.Scanner;

/**
 * MangaBooks
 */
public class MangaBooks {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int answer = HowManyBooks();

    }

    static int HowManyBooks() {
        System.out.println("Combien de tômes a le manga One Piece en 2022 ?");
        int choice = input.nextInt();

        if (choice != 102) {
            System.out.println("Dommage, tu es un mauvais pirate ! La réponse était 102");
        } else {
            System.out.println("C'est exact, bravo !");
        }

        return choice;

    }
}