import java.util.Scanner;

import javax.xml.transform.Result;

/**
 * Maison
 */
public class Maison {

    public static void main(String[] args) {
Scanner choixpeau = new Scanner(System.in);
System.out.println("Dans quelle maison souhaiterais-tu aller ?:");
String hogwartsHouse = choixpeau .nextLine();
choixpeau.close();
hogwartsHouse = hogwartsHouse.toUpperCase();
System.out.println("Tu veux aller à " + hogwartsHouse + "? Mais tu es un sale moldu, les grands mages parlent couramment le Java !");
}
}
