
/**
* SNCB
*/

import java.util.Scanner;

public class SNCB {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int yourdestination = ChooseDestination();

    }

    static int ChooseDestination() {
        System.out.println(
                "Quelle sera votre destination? \n 1 - Bruxelles \n 2 - Mons \n 3 - Nivelles \n 4 - Charleroi");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Vous avez choisi Bruxelles. Bon voyage !");
            ChoosePeriod("10:33", "14:42", "19:02");
        } else if (choice == 2) {
            System.out.println("Vous avez choisi Mons. Bon voyage !");
            ChoosePeriod("05:34", "15:13", "20:00");
        } else if (choice == 3) {
            System.out.println("Vous avez choisi Nivelles. Bon voyage !");
            ChoosePeriod("05:34", "15:13", "20:00");
        } else if (choice == 4) {
            System.out.println("Vous avez choisi Charleroi. Bon voyage !");
            ChoosePeriod("07:45", "12:53", "23:02");
        } else {
            System.out.println("Cette destination n'existe pas, veuillez recommencer.");
            choice = ChooseDestination();
        }
        return choice;
    }

    static int ChoosePeriod(String _matin, String _midi, String _soir) {
        System.out.println("Quelle sera votre période de la journée ? \n 1 - Matin. \n 2 - Après-midi. \n 3 - Soir.");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Ok, vous avez choisi la période : Matin. Il sera" + _matin);
        } else if (choice == 2) {
            System.out.println("Ok, vous avez choisi la période : Après-midi. Il sera" + _midi);
        } else if (choice == 3) {
            System.out.println("Ok, vous avez choisi la période : Soir. Il sera" + _soir);
        } else {
            System.out.println("Cette période n'existe pas, veuillez recommencer.");
            choice = ChoosePeriod(_matin, _midi, _soir);
        }
        return choice;
    }
}
