import java.util.Scanner;

import javax.xml.transform.Result;

/**
 * Maison2
 */
public class Maison2 {

    public static void main(String[] args) {
        Scanner choixpeau = new Scanner(System.in);
        System.out.println("Dans quelle maison souhaiterais-tu aller ?:");
        String hogwartsHouse = choixpeau.nextLine();
        hogwartsHouse = hogwartsHouse.toUpperCase();
        System.out.println("Tu veux aller à " + hogwartsHouse
                + "? Mais tu es un sale moldu, les grands mages parlent couramment le Java !");
        System.out.println("Donne-moi le nom de ton sort préféré, et peut-être que je te laisserais une chance !");
        String spellName = choixpeau.nextLine();
        spellName = spellName.toUpperCase();
        System.out.println("Très bon choix ! " + spellName + " est un sort que j'apprécie beaucoup.");
        System.out.println(
                "Tu aimes les trolls ? Parce que je viens de t'en faire un. As-tu vraiment cru pouvoir entrer à Poudlard ?");
        String badJoke = choixpeau.nextLine();
        choixpeau.close();
        badJoke = badJoke.toUpperCase();
        System.out
                .println("Je ne sais pas trop quoi dire, je ne m'attendais pas à ce que tu répondes " + badJoke + ".");
        System.out.println("Bon ! j'vais aller me faire un ptit café. A bientôt, et vive BlindCode !");

    }
}