import java.util.Scanner;

/**
 * Age
 */
public class Age {
    public static void main(String[] args) {
        int futureAge = BirthDate();
        System.out.println("Ton âge dans 17 ans sera de " + futureAge);
    }

    public static int BirthDate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Quel âge as-tu ?");
        int tonAge = input.nextInt();
        input.close();
        return tonAge + 17;
    }
}