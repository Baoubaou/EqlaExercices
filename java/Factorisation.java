/**
 * Factorisation
 */
public class Factorisation {
    public static void main(String[] args) {
        // Calcule(5, 6);
        // Addition(5, 6);
        // Soustraction(5, 6);
        Combined(5, 6);
    }

    static void Combined(int nbr1, int nbr2) {
        Addition(nbr1, nbr2);
        Soustraction(nbr1, nbr2);
    }

    static void Addition(int nombre1, int nombre2) {
        System.out.println(nombre1 + "+" + nombre2 + "=" + (nombre1 + nombre2));
    }

    static void Soustraction(int nombre1, int nombre2) {
        System.out.println(nombre1 + "-" + nombre2 + "=" + (nombre1 - nombre2));
    }
    // static void Calcule(int nombre1, int nombre2){
    // System.out.println(nombre1 + "+" + nombre2 + "=" + (nombre1 + nombre2));
    // System.out.println(nombre1 + "-" + nombre2 + "=" + (nombre1 - nombre2));
    // }
}