
/**
 * CharaClass
 */

import java.util.Scanner;

public class CharaClass {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int yourclass = ChooseClass();
    }

    static int ChooseClass() {
        System.out.println("Quelle classe voulez-vous choisir ? \n 1. Guerrier \n 2. Mage \n 3. Voleur \n 4. - Prêtre");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println(
                    "Le guerrier n'a jamais peur, il est d'une loyauté et d'un courage sans faille. Il aime l'art de la bataille. \n Polyvalent, il peut se battre armé comme à mains nues ce qui le rend redoutable. \n Il peut porter des armes et des armures lourdes, mais possède très peu de résistance à la magie. \n Le sang peut également lui apporter des avantages s'il est berserker");
        } else if (choice == 2) {
            System.out.println(
                    "Il est évident que la magie n'a aucun secret pour cette classe, mais quel type de mage seras-tu ? \n En effet, il y a plusieurs type de mages et donc plusieurs types de magie. \n Selon l'évolution des connaissances apprises, tu peux devenir élémentaire, mage noir, mage du temps etc. \n Quel sera ton chemin ? Seul l'avenir nous le dira.");
        } else if (choice == 3) {
            System.out.println(
                    "Le voleur est rapide et furtif, il préfèrera donc porter du matériel léger. \n Souvent fourbe et manipulateur, il a plus d'un tour dans son sac (surtout lorsqu'il vous vole les vôtres !). \n Il peut attaquer par surprise et utilise souvent des arcs ou des dagues.");
        } else if (choice == 4) {
            System.out.println(
                    "Le Prêtre utilise la magie blanche pour soigner ses alliés sur le champs de bataille. Ne sous estimez pas sa puissance lorsqu'il est dans une situation délicate, les dieux choisissent toujours la personne la plus pieuse à aider. \n Vous n'aimeriez pas affronter des incarnations divines, si ?");
        } else {
            System.out.println("Classe incorrecte ! Veuillez recommencer.");
            choice = ChooseClass();

        }
        return choice;
    }
}
