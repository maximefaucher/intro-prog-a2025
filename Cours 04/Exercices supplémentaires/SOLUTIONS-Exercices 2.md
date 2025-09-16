# Exercices 2 - SOLUTIONS

## Exercice 1

```java
public class Ex1 {

    public static void main(String[] args) {
        
        // Variables
        int iNbr1 = 1, iNbr2 = 2, iNbr3 = 3;

        if( (iNbr2 != iNbr1) || (iNbr3 == iNbr1) ) {
            System.out.println("a)"); // oui
        }

        if( !(iNbr3 > iNbr1) ) {
            System.out.println("b)"); // non
        }

        if( (iNbr1 <= 99) && (iNbr3 == iNbr2) ) {
            System.out.println("c)"); // non
        }

        if( !(iNbr1 >= 1 ) && (iNbr2 < 4) ) {
            System.out.println("d)"); // non
        }

        if( !((iNbr1 <= 1) && ( iNbr2 == 2)) ) {
            System.out.println("e)"); // non
        }
    }
}
```

Produit cet affichage

```text
a)
```

## Exercice 2

```java
public class Ex2 {

    public static void main(String[] args) {
        
        int iNbrVolume = 10, iNbrCrayon = 4;
        boolean  b1, b2, b3, b4;

        b1 = b2 = b3 = b4 = true;

        b1 = ((iNbrVolume > 10) && (iNbrCrayon == 4));
        b2 = ((iNbrVolume == 10) || (iNbrCrayon == 5) || (!b4));
        b3 = (( iNbrVolume > iNbrCrayon) && (b2 == b1) || (iNbrCrayon < iNbrVolume));
        b4 = (( b2 = !b4 ) && ( b1 == b2 ) || (iNbrVolume > iNbrCrayon));

        // a)
        System.out.println("b1 = " + b1); // false
        // b)
        System.out.println("b2 = " + b2); // false
        // c)
        System.out.println("b3 = " + b3); // true
        // d)
        System.out.println("b4 = " + b4); // true

        // e)
        if(b1) {
            System.out.println("dans le if(b1)");
        } else {
            System.out.println("dans le sinon de if(b1)"); // affiche ceci
        }

        if(!b2) {
            System.out.println("dans le if(!b2)"); // affiche ceci
        } else {
            System.out.println("dans le sinon if(!b2)");
        }

    }
}
```

Produit cet affichage

```text
b1 = false
b2 = false
b3 = true
b4 = true
dans le sinon de if(b1)
dans le if(!b2)
```

## Exercice 3

```java
public class Ex3 {

    public static void main(String[] args) {

        // Variables
        int iMin, nb1, nb2, iAbs, nbA, nbEntier;
        Scanner saisie = new Scanner(System.in);
        
        // a) Affecte à iMin la valeur minimale entre nb1 et nb2.
        // Saisie des nombres
        System.out.print("Entrer le premier nombre : ");
        nb1 = saisie.nextInt();
        System.out.print("Entrer le second nombre : ");
        nb2 = saisie.nextInt();
        // On affecte iMin
        iMin = (nb1 < nb2) ? nb1 : nb2;
        // On l'affiche
        System.out.printf("iMin = %d\n", iMin);

        // b) Affecte à iAbs la valeur absolue de nbA.
        // Saisie du nombre
        System.out.print("Valeur de nbA : ");
        nbA = saisie.nextInt();
        // Affectation de sa valeur absolue
        iAbs = (nbA >= 0) ? nbA : -nbA;
        System.out.printf("iAbs = %d\n", iAbs);

        // c) Faire afficher en console un message différent selon qu'un entier nbEntier est pair ou non.
        // Saisie du nombre
        System.out.print("Valeur de nbEntier : ");
        nbEntier = saisie.nextInt();
        // Affichage du message avec l'opérateur ternaire
        System.out.println(nbEntier + ((nbEntier % 2 == 0) ? " est pair" : " est impair")); // le + est vu comme une CONCATÉNATION

        // Quitter
        saisie.close();
        System.exit(0);
    }

}
```

## Exercice 4

```java
public class Ex4 {

    public static void main(String[] args) {
        
        // Variables
        Scanner scanner = new Scanner(System.in);
        String phrase1, phrase2, nettoyee1, nettoyee2;

        System.out.print("Entrez la première phrase : ");
        phrase1 = scanner.nextLine();

        System.out.print("Entrez la deuxième phrase : ");
        phrase2 = scanner.nextLine();

        // Nettoyage et mise en minuscules
        nettoyee1 = phrase1.trim().toLowerCase();
        nettoyee2 = phrase2.trim().toLowerCase();

        // Comparaison
        if (nettoyee1.equals(nettoyee2)) {
            System.out.println("Les phrases sont identiques (sans tenir compte de la casse).");
        } else {
            System.out.println("Les phrases sont différentes.");
        }

        // Longueur
        System.out.println("Longueur de la phrase 1 : " + nettoyee1.length());
        System.out.println("Longueur de la phrase 2 : " + nettoyee2.length());

        // Quitter
        scanner.close();
        System.exit(0);
    }
}
```

## Exercice 5

```java
public class Ex5 {

    public static void main(String[] args) {

        // Variables
        Scanner scanner = new Scanner(System.in);
        String phrase, motCle;
        int index;
        char premiereLettre;

        // Saisie 
        System.out.print("Entrez une phrase : ");
        phrase = scanner.nextLine();
        System.out.print("Entrez un mot-clé : ");
        motCle = scanner.nextLine();

        // On trouve l'index
        index = phrase.indexOf(motCle);

        // Traitement selon que le motCle existe dans phrase
        if (index != -1) { // trouvé, car l'index est DIFFÉRENT de -1
            String sousChaine = phrase.substring(index);
            premiereLettre = motCle.charAt(0);
            System.out.println("Le mot-clé commence à l'index : " + index);
            System.out.println("Première lettre du mot-clé en majuscule : '" + Character.toUpperCase(premiereLettre) + "'");
            System.out.println("Sous-chaîne : \"" + sousChaine + "\"");
        }
        else { // non trouvé, car index == -1 (valeur retournée par .indexOf() en cas d'échec de la recherche)
            System.out.println("Mot-clé non trouvé dans la phrase.");
        }

        // Quitter
        scanner.close();
        System.exit(0);
    }
}
```

## Exercice 6

```java
public class Ex6 {

    public static void main(String[] args) {

        // Variables
        Scanner scanner = new Scanner(System.in);
        String phrase, modifiee, fin;
        int longueur;

        // Saisie
        System.out.print("Entrez une phrase contenant le mot \"java\" : ");
        phrase = scanner.nextLine();

        // Remplacement et mise en majuscules
        modifiee = phrase.replace("java", "JAVA").toUpperCase();

        // Extraction des 10 derniers caractères
        longueur = modifiee.length();
        fin = longueur >= 10 ? modifiee.substring(longueur - 10) : modifiee;

        // Affichage
        System.out.println("Phrase modifiée : \"" + modifiee + "\"");
        System.out.println("Sous-chaîne finale : \"" + fin + "\"");

        // Quitter
        scanner.close();
        System.exit(0);
    }
}
```
