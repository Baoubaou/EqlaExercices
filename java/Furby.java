import java.util.Scanner;

/**
 * Furby
 */
public class Furby {

    public static void main(String[] args) {
        Scanner monFurby = new Scanner(System.in);
        System.out.println("Que fait mon furby ? :");
        String actionFurby = monFurby.nextLine();
        monFurby.close();
        System.out.println("Mon furby " + actionFurby);
    }
}