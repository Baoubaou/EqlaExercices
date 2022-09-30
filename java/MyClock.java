import java.util.Scanner;

/**
 * MyClock
 */
public class MyClock {
    public static void main(String[] args) {
        Scanner getTime = new Scanner(System.in);
        System.out.println("Entre ton heure:");
        int input1 = getTime.nextInt();
        System.out.println("Entre tes minutes:");
        int input2 = getTime.nextInt();
        getTime.close();
        if (input1 < 0) {
            System.out.println("Heure incorrectes ! Veuillez recomencer");
        }
        if (input1 > 23) {
            System.out.println("Heure incorrectes ! Veuillez recomencer");
        }
        if (input2 < 0) {
            System.out.println("Minutes incorrectes ! Veuillez recomencer");
        }
        if (input2 > 60) {
            System.out.println("Minutes incorrectes ! Veuillez recomencer");
        }
        ShowResult(input1, input2);
    }

    static void ShowResult(int nbr1, int nbr2) {
        System.out.println("il est" + nbr1 + "h" + nbr2 + ". Bonne journée.");
    }
}