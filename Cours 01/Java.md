# Le langage Java

Selon [Wikipedia](https://fr.wikipedia.org/wiki/Java_(langage)) :

> Java est un langage de programmation de haut niveau orienté objet créé par James Gosling et Patrick Naughton, employés de Sun Microsystems, avec le soutien de Bill Joy (cofondateur de Sun Microsystems en 1982), présenté officiellement le 23 mai 1995 au SunWorld.
>
> La société Sun est rachetée en 2009 par la société Oracle qui détient et maintient désormais Java.
>
> Un logiciel écrit en langage Java a pour particularité d'être compilé vers un code intermédiaire formé de bytecodes qui peut être exécuté dans une machine virtuelle Java (JVM) en faisant abstraction du système d'exploitation.

## Fonctionnement d'un programme Java

Voici une explication visuelle et détaillée du fonctionnement d’un programme Java, de l’écriture du code à son exécution sur la machine :

Image 1 - [*Source*](https://www.vulgarisation-informatique.com/interpretation-java.php)

![Un programme Java](https://www.vulgarisation-informatique.com/images/articles/java_interpret/etape_1.gif)

Image 2 - [*Source*](https://www.codecademy.com/courses/learn-java/lessons/hello-world-java/exercises/introduction-to-java)

![Java Program](https://content.codecademy.com/courses/learn-java/revised-2019/Java%20Module%201-%20Lesson%201-JVM%20-ART%20408.png)

## Étapes du cycle d’exécution en Java

```java
// TODO : À FAIRE EN EXERCICE!
```

### 1. Écriture du code source

Tu écris ton programme dans un fichier `.java`, comme par exemple `Bonjour.java` qui contient les instructions suivantes :

```java
public class Bonjour {
    public static void main(String[] args) {
        System.out.println("Bonjour le monde!");
    }
}
```

Ce fichier est stocké quelque part dans la mémoire d'un ordinateur, par exemple à l'emplacement `C:\Utilisateurs\maxime\Bonjour.java`.

### 2. Compilation

Le compilateur Java (commande `javac`) transforme le fichier `.java` en *bytecode* :

```powershell
PS C:\Utilisateurs\maxime> javac Bonjour.java
```

Résultat : un fichier `Bonjour.class` contenant du *bytecode*, lisible par la *JVM*.

### 3. Exécution par la JVM

La *Java Virtual Machine* (*JVM*) interprète le *bytecode* et le traduit en instructions machine spécifiques à l’ordinateur (commande `java`).

```powershell
PS C:\Utilisateurs\maxime> java Bonjour
```

Elle gère aussi la mémoire, les exceptions, et l’environnement d’exécution.

### 4. Exécution par le processeur

Le processeur exécute les instructions binaires.

### 5. Affichage du résultat

La *JVM* exécute les instructions et affiche :

```powershell
Bonjour le monde!
```

## **Conclusion**

Il est relativement facile d'effectuer la compilation et l'exécution lorsqu'il s'agit d'une seule classe (un seul fichier), mais les choses peuvent se compliquer assez rapidement lorsqu'on développe un projet d'une plus grande envergure.

Il existe pour cela des outils spécialisés dans l'écriture de code qui permettent aisément de compiler / interpréter / exécuter des instructions rapidement en traduisant des actions d'une interface graphique en lignes de commandes directement.

On appelle ce type de logiciel un « *Environnement de Développement Intégré* » (ou *EDI*) et celui que nous allons utiliser durant la session est [***Visual Studio Code***](https://code.visualstudio.com/), de Microsoft.
