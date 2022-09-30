import java.util.Scanner;

/**
 * Nametest
 */

public class Nametest {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String firstName = ChooseFname();
        String lastName = ChooseLname();
    }

    static String ChooseFname() {
        System.out.println("Entrez votrre prénom:");
        String choice = input.nextLine();
        choice = choice.substring(0, 1).toUpperCase() + choice.substring(1).toLowerCase();
        return choice;
    }

    static String ChooseLname() {
        System.out.println("Entrez votrre nom:");
        String choice = input.nextLine();
        choice = choice.substring(0, 1).toUpperCase() + choice.substring(1).toLowerCase();
        System.out.println("Votre nom est" + choice);
        return choice;
    }
}