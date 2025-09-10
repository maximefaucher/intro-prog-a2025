
// importer la boîte à outils Scanner
import java.util.Scanner;

public class Demo3Sept {
    public static void main(String[] args) {
        /*
         * // définir notre objet scanner
         * Scanner console = new Scanner(System.in); // saisie en console
         * 
         * // demande l'age à l'utilisateur1
         * System.out.print("Bonjour Monsieur ou madame, quelle est votre age: ");
         * int age = console.nextInt();
         * 
         * System.out.print("Bonjour Monsieur ou madame, quelle est votre nom: ");
         * String nom = console.nextLine();
         * 
         * 
         * // affichage de l'age
         * System.out.println("Votre age est de : " + age);
         * 
         * System.out.printf("Nom : %s, Âge : %d", nom, age);
         * System.out.println("Nom: " + nom + " Âge : " + age);
         * 
         * System.out.
         * printf("Mon chat se nomme %s et ma chatte se nommme %s alors que mon chien se nomme %s et il a %d an(s)."
         * , nom, "Cocotte", "Grogon", age);
         * 
         * 
         * // Fermeture du scanner
         * console.close();
         */

        int a = 10;
        int b = 20;
        int c = 30;

        Boolean resultat = (b <= a) && (b == a) && (b != a);
        System.out.println("Réponse? " + resultat);

    }
}
