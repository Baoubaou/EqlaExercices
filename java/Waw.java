import java.util.Scanner;

/**
 * Waw
 */
public class Waw {
    public static void main(String[] args) {
        Scanner reponse = new Scanner(System.in);
        System.out.println("Comment tu t'appelles ?");
        String Name = reponse.nextLine();
        reponse.close();
        Exclamation(Name);
        Exclamation("Bonjour");
    }

    static void Exclamation(String sentance) {
        System.out.println(sentance + " !");
    }
}