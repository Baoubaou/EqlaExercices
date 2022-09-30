import java.util.Scanner;

/**
 * Calculette
 */
public class Calculette {
    public static void main(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.println("Entre ta première valeur:");
        float input1 = getNumber.nextFloat();
        System.out.println("Entre ta deuxième valeur:");
        float input2 = getNumber.nextFloat();
        getNumber.close();
        float addResult = Addition(input1, input2);
        float sousResult = Soustraction(input1, input2);
        float multResult = Multiplication(input1, input2);
        float divResult = Division(input1, input2);
        float carreResult1 = Carre(input1);
        float carreResult2 = Carre(input2);
        ShowAll(addResult, sousResult, multResult, divResult, carreResult1, carreResult2);
    }

    static void ShowAll(float additionResult, float soustractionResult, float multiplicationResult,
            float divisionResult, float carreResult1, float carreResult2) {
        System.out.println(additionResult + "+" + soustractionResult + "+" + multiplicationResult + "+" + divisionResult
                + "+" + carreResult1 + "+" + carreResult2);
    }

    static float Addition(float nbr1, float nbr2) {
        return nbr1 + nbr2;
    }

    static float Soustraction(float nbr1, float nbr2) {
        return nbr1 - nbr2;
    }

    static float Multiplication(float nbr1, float nbr2) {
        return nbr1 * nbr2;
    }

    static float Division(float nbr1, float nbr2) {
        return nbr1 / nbr2;
    }

    static float Carre(float nbr) {
        return nbr * nbr;
    }
}