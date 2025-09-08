# Exercices Java - Cours 03

Ces exercices couvrent : **sorties console**, **entrées console**, et **opérateurs relationnels/logiques**.

---

## Partie 1 : Sorties Console

### Exercice 1

Écris un programme qui affiche ton prénom et ton nom sur deux lignes sans utiliser `println()`.  
Résultat:  
![picture 1](../../images/ea0dd10d3213fd52d86eb3c42563b3ea1f0a9634e244c5dd0b440783268754a4.png)  

```java
public class Ex1 {
    public static void main(String[] args) {
        String prenom = "Jean", nom = "Dupont";
        System.out.print(prenom + "\n" + nom + "\n");
    }
}
```

### Exercice 2

Affiche la phrase : `Bonjour, je m'appelle Alice et j'ai 20 ans.` à l'aide de `printf()`.
Résultat:  
![picture 2](../../images/158fd0e4883bb55c09e8a4da2d53dbe884a060aaf58e03454e5877906d5fbde4.png)  

```java
public class Ex2 {
    public static void main(String[] args) {
        String nom = "Alice";
        int age = 20;
        System.out.printf("Bonjour, je m'appelle %s et j'ai %d ans.%n", nom, age);
    }
}
```

### Exercice 3

Affiche un carré formé d’étoiles `*` (4x4).  
Résultat:
![picture 3](../../images/d10419611b2f688c3d30e92d49919a858bdca33a4ebb95a69e866d7a759bb234.png)  

```java
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
        System.out.println("****");
    }
}
```

### Exercice 4

Affiche les nombres de 1 à 5, chacun sur une ligne.  
Résultat:  
![picture 4](../../images/33e57dad949fc7b7ec31b0283953545244c23003ee1acee68cd6e7351f429945.png)  

```java
public class Ex4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
    }
}
```

### Exercice 5

Affiche le message `Bienvenue dans le cours de Java !` avec le mot dans un affichage centré dans un tableau d'étoiles de 10 lignes.  
Résultat:  
![picture 5](../../images/6931fe204f73de476bcb220cff3ee7b8d616ec55a26f63bd376fad99683fb358.png)  

```java
public class Ex5 {
    public static void main(String[] args) {
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("**************** Bienvenue dans le cours de Java ! ********");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
    }
}
```

---

## Partie 2 : Entrées Console

### Exercice 6

Demande à l’utilisateur son prénom et affiche : `Bonjour <prénom> !`.  
![picture 6](../../images/4cd5acfc817ebff12590726074544c602dcec63cc53f35f316bb16b2d39f52f1.png)  

Résultat:

```java
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
        System.out.println("Bonjour " + prenom + " !");
    }
}
```

### Exercice 7

Demande à l’utilisateur deux nombres et affiche leur somme.  

Résultat:  
![picture 7](../../images/2e580633366e52cdf5420011c7ec4d3f9d4dbd27bbd406abdcd051a56c9d0231.png)  

```java
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int a = sc.nextInt();
        System.out.print("Entrez un autre nombre : ");
        int b = sc.nextInt();
        System.out.println("La somme est : " + (a + b));
    }
}
```

### Exercice 8

Demande l’âge de l’utilisateur et affiche `Tu as X ans.`.  

Résultat:  
![picture 8](../../images/c6f639ee96910ee722027d129edaaa6d59991a60f024e0f20eb2c93d0e7e35b8.png)  

```java
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quel est ton âge ? ");
        int age = sc.nextInt();
        System.out.println("Tu as " + age + " ans.");
    }
}
```

## Opérateurs relationnels (de comparaison) et opérateurs logiques

### Exercice 9

Demande deux nombres et affiche `true` ou `false` si (a > b) et (b > a).  

Résultat:  
![picture 9](../../images/eb4399c6ad9657bfa982d15c278ffdb31b5d241aceac90ed27908630cd9fea67.png)  

```java
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int a = sc.nextInt();
        System.out.print("Entrez un autre nombre : ");
        int b = sc.nextInt();
            System.out.println("a > b : " + (a > b));
            System.out.println("a < b : " + (a < b));
        }
}
```

---

## Partie 3 : Opérateurs Relationnels et Logiques

### Exercice 10

Demande un nombre et affiche `true` ou `false` si le nombre est positif.  

Résultat:  
![picture 10](../../images/985b6a9b87952bb1943ceb26df1d00e7c42fa9dea03af41ec165984b6f5fd5ff.png)  

```java
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        System.out.println("Positif: "  + (n > 0));
        System.out.println("Négatif: "  + (n < 0) );
    }
}
```

### Exercice 11

Demande un nombre et affiche `true` ou `false` si un nombre est pair ou impair.  

Résultat:  
![picture 11](../../images/5217ec832780829e70c3766de8f19894c1ca2c9b8e4e4a4c46b218fd82c1fc04.png)  

```java
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        System.out.println("Pair: " + (n % 2 == 0));
        System.out.println("Impair: " + (n % 2 == 1));
    }
}
```

### Exercice 12

Demande l’âge et affiche `true` ou `false` si la personne est majeure (>=18).  

Résultat:  
![picture 12](../../images/2e9e086e16800c555ba41261fbfeb08feab9de994868f37702d5dbee38db7b06.png)  

```java
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();
            System.out.println("Majeur? " + (age >= 18));
            System.out.println("Mineur? " + (age <= 18));
    }
}
```

### Exercice 13

Demande un nombre et affiche `true` ou `false` s'il est compris entre 10 et 20.  

Résultat:  
![picture 13](../../images/431b0d3ea639a007aeda8aff7ec7da6f3aed29cf058b178b9bb1f7062d012345.png)  

```java
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre et on déterminera s'il est dans l'interval de 10 à 20: ");
        int n = sc.nextInt();
            System.out.println("Le nombre est dans l'intervalle? : " + (n >= 10 && n <= 20));
    }
}
```

### Exercice 14 [Niveau expert]

Demande un caractère et vérifie s’il s’agit d’une voyelle (a, e, i, o, u).  

Résultat:  
![picture 14](../../images/633dbd74ce9510da832398385362f26ef62af9d37f1bfa6e3e7625573c5d2c77.png)  

```java
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une lettre : ");
        char c = sc.next().charAt(0);

        // Vérification de la voyelle (en minuscule)
        boolean voyelle = c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                          c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';

        System.out.println("Voyelle: " + voyelle);    
        }
}
```

### Exercice 15

Demande un nombre et vérifie s’il est multiple de 3 ou de 5.  

Résultat:  
![picture 15](../../images/1dab221053ce43c00858ca9be110e5983e4e8a930a6042542d652be5b897f9b0.png)  

```java
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();
        System.out.println("Multiple de 3 ou 5 ? " + (n % 3 == 0 || n % 5 == 0));
    }
}
```

### Exercice 16

Vérifie si une année entrée est bissextile.  

Résultat:  
![picture 16](../../images/53ca44039eabb15e46ce48d380ef6a213bb53b08e410bae8ac3dfb73de0348f9.png)  

```java
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une année : ");
        int annee = sc.nextInt();
        System.out.println("Bissextile? " + ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0));
    }
}
```

---
