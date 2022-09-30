import java.util.Scanner;

/**
 * OnePiece
 */
public class OnePiece {
    static Scanner input = new Scanner(System.in);
    static Scanner input1 = new Scanner(System.in);

    public static void main(String[] args) {
        String userName = ChooseName();
        String boatName = ChooseBoatName();
        System.out.println(
                userName + "prend la mer seul sur son bateau, le " + boatName + ". Une grande aventure l'attend");
    }

    static String ChooseName() {
        String _defaultName = "Luffy";
        System.out.println("Votre nom est" + _defaultName + ". Voulez-vous le changer ? [O / N");
        String _choice = input.nextLine().toLowerCase();
        if (_choice.equals("o")) {
            System.out.println("Quel est le nom que vous voulez ?");
            _defaultName = input.nextLine();
            _defaultName = _defaultName.substring(0, 1).toUpperCase() + _defaultName.substring(1).toLowerCase();
        } else if (_choice.equals("n")) {
            System.out.println("Vous conservez le nom" + _defaultName);
        } else {
            System.out.println("Entrée incorrecte !");
            _defaultName = ChooseName();
            return _defaultName;
        }
        return ConfirmName(_defaultName);
    }

    static String ConfirmName(String _userName) {
        System.out.println("Vous avez choisi " + _userName
                + ". Vous ne pourrez plus changer de nom pendant l'aventure. Ëtes-vous certain de votre choix ? [O / N]");
        String _choice = input.nextLine().toLowerCase();
        if (_choice.equals("o")) {
            System.out.println("Entrée validée.");
        } else if (_choice.equals("n")) {
            System.out.println("Pseudo refusé. Veuillez réintroduire votre pseudo");
            _userName = ChooseName();
        } else {
            System.out.println("Entrée incorrecte ! Veuillez recommencer.");
            _userName = ConfirmName(_userName);
            input.close();
        }
        return _userName;
    }

    static String ChooseBoatName() {
        String _defaultBoatName = "Vogue Merry";
        System.out.println("Votre nom de navire est" + _defaultBoatName + ". Voulez-vous le changer ? [O / N");
        String _choice1 = input1.nextLine().toLowerCase();
        if (_choice1.equals("o")) {
            System.out.println("Quel est le nom de navire que vous souhaitez ?");
            _defaultBoatName = input1.nextLine();
            _defaultBoatName = _defaultBoatName.substring(0, 1).toUpperCase()
                    + _defaultBoatName.substring(1).toLowerCase();
        } else if (_choice1.equals("n")) {
            System.out.println("Vous conservez le nom" + _defaultBoatName + " pour votre navire.");
        } else {
            System.out.println("Entrée incorrecte !");
            _defaultBoatName = ChooseBoatName();
            return _defaultBoatName;
        }
        return ConfirmBoatName(_defaultBoatName);
    }

    static String ConfirmBoatName(String _boatName) {
        System.out.println("Vous avez choisi " + _boatName
                + ". Vous ne pourrez plus changer le nom du navire pendant l'aventure. Ëtes-vous certain de votre choix ? [O / N]");
        String _choice1 = input1.nextLine().toLowerCase();
        if (_choice1.equals("o")) {
            System.out.println("Entrée validée.");
        } else if (_choice1.equals("n")) {
            System.out.println("Nom de navire refusé. Veuillez réintroduire son nom");
            _boatName = ChooseBoatName();
        } else {
            System.out.println("Entrée incorrecte ! Veuillez recommencer.");
            _boatName = ConfirmBoatName(_boatName);
            input1.close();
        }
        return _boatName;
    }
}