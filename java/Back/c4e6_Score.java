import java.util.Scanner;

public class c4e6Score {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("Entrez le nom de la première personne");
        String firstUser = input.nextLine();
        System.out.println("Entrez le score de " + firstUser);
        int firstScore = input.nextInt();
        input.nextLine();

        System.out.println("Entrez le nom de la seconde personne");
        String secondUser = input.nextLine();
        System.out.println("Entrez le score de " + secondUser);
        int secondScore = input.nextInt();
        input.nextLine();

        String tempUser;
        int tempScore;

        if (firstScore < secondScore) 
{

            tempUser = firstUser;
            firstUser = secondUser;
            secondUser = tempUser;

            tempScore = firstScore;
            firstScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println("Entrez le nom de la troisième personne");
        String thirdUser = input.nextLine();
        System.out.println("Entrez le score de " + thirdUser);
        int thirdScore = input.nextInt();
        input.nextLine();

        if (thirdScore > secondScore) 
{
    tempUser = thirdUser;
    thirdUser = secondUser;
    secondUser = tempUser;
    
    tempScore = thirdScore;
    thirdScore = secondScore;
    secondScore = tempScore;
}
        
        System.out.println("Entrez le nom de la quatrième personne");
        String fourthUser = input.nextLine();
        System.out.println("Entrez le score de " + fourthUser);
        int fourthScore = input.nextInt();
        input.nextLine();

        if (fourthScore < secondScore) 
{

            tempUser = fourthUser;
            fourthUser = secondUser;
            secondUser = tempUser;

            tempScore = fourthScore;
            fourthScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println("Entrez le nom de la cinquième personne");
        String fifthUser = input.nextLine();
        System.out.println("Entrez le score de " + fifthUser);
        int fifthScore = input.nextInt();
        input.nextLine();

        if (fifthScore < secondScore) 
{

            tempUser = fifthUser;
            fifthUser = secondUser;
            secondUser = tempUser;

            tempScore = fifthScore;
            fifthScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println("Entrez le nom de la sixième personne");
        String sixthUser = input.nextLine();
        System.out.println("Entrez le score de " + sixthUser);
        int sixthScore = input.nextInt();
        input.nextLine();

        if (sixthScore < secondScore) 
{

            tempUser = sixthUser;
            sixthUser = secondUser;
            secondUser = tempUser;

            tempScore = sixthScore;
            sixthScore = secondScore;
            secondScore = tempScore;
        }

        System.out.println("Entrez le nom de la septième personne");
        String seventhUser = input.nextLine();
        System.out.println("Entrez le score de " + seventhUser);
        int seventhScore = input.nextInt();
        input.nextLine();

        if (seventhScore < secondScore) 
{

            tempUser = seventhUser;
            seventhUser = secondUser;
            secondUser = tempUser;

            tempScore = seventhScore;
            seventhScore = secondScore;
            secondScore = tempScore;
        }

if (firstScore < secondScore) 
        {
        
                    tempUser = firstUser;
                    firstUser = secondUser;
                    secondUser = tempUser;
        
                    tempScore = firstScore;
                    firstScore = secondScore;
                    secondScore = tempScore;
                }


                System.out.println(
        "La premièrepersonne est " + firstUser + " avec un score de " + firstScore +
        "la seconde personne est " + secondUser + " avec un score de " + secondScore +
        "la troisième personne est " + thirdUser + " avec un score de " + thirdScore +
        "la quatrième personne est " + fourthUser + " avec un score de " + fourthScore +
        "la cinquième personne est " + fifthUser + " avec un score de " + fifthScore +
        "la sixième personne est " + sixthUser + " avec un score de " + sixthScore +
        "la septième personne est " + seventhUser + " avec un score de " + seventhScore

        );

        
        input.close();
    }
}