import java.util.Scanner;

/**
 * Combo
 */
public class Combo {
  public static void main(String[] args) {
    Run();
  }

  static void Run() {
    System.out.println("Hello Philip");
    String gameName = "Un futur portal 3, on peut espérer";
    System.out.println("Mon jeu préféré pourrait être " + gameName);
    Scanner multi = new Scanner(System.in);
    System.out.println("Quel est ton animal préféré ?:");
    String favoriteAnimal = multi.nextLine();
    System.out.println("Ton animal préféré est " + favoriteAnimal);
    multi.close();
    System.out.println("\007");

  }
}