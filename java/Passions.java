/**
 * Passions
 */
public class Passions {
    public static void main(String[] args) {
        Passions("le son", "l'informatique", "les jeux vidéo");
        Passions("Emmerder mon chien", "donner du fil à retordre à Philip", "câliner des tourelles");
    }

    static void Passions(String passion1, String passion2, String passion3) {
        System.out.println("Mes passions préférées sont:\n" + passion1 + "\n" + passion2 + "\n" + passion3);
    }

}