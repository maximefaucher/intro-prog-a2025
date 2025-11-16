# Solutionnaire des Exercices sur les Tableaux 2D en Java

Ce document présente les solutions aux exercices du fichier **Exercices-Tableaux_2D_Java.md**, avec des explications et des commentaires dans le code.

---

## 1. Exercices simples

### Exercice 1 — Somme des éléments
**Objectif :** Calculer la somme de tous les éléments d’un tableau 2D.

```java
int[][] tableau = {{1, 2, 3}, {4, 5, 6}};
int somme = 0;
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[i].length; j++) {
        somme += tableau[i][j]; // Ajout de chaque élément
    }
}
System.out.println("Somme = " + somme);
```

---

### Exercice 2 — Trouver le minimum
**Objectif :** Trouver la plus petite valeur.

```java
int min = tableau[0][0];
for (int[] ligne : tableau) {
    for (int val : ligne) {
        if (val < min) min = val; // Mise à jour si plus petit trouvé
    }
}
System.out.println("Minimum = " + min);
```

---

### Exercice 3 — Compter les zéros
**Objectif :** Compter les cases contenant `0`.

```java
int countZero = 0;
for (int[] ligne : tableau) {
    for (int val : ligne) {
        if (val == 0) countZero++; // Incrément si zéro trouvé
    }
}
System.out.println("Nombre de zéros = " + countZero);
```

---

### Exercice 4 — Afficher une matrice
**Objectif :** Afficher une grille 3×3.

```java
int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
for (int[] ligne : matrice) {
    for (int val : ligne) {
        System.out.print(val + " ");
    }
    System.out.println(); // Retour à la ligne
}
```

---

### Exercice 5 — Remplacer une valeur
**Objectif :** Remplacer toutes les occurrences d’une valeur par `-1`.

```java
int valeur = 15; // Exemple
for (int i = 0; i < tableau.length; i++) {
    for (int j = 0; j < tableau[i].length; j++) {
        if (tableau[i][j] == valeur) tableau[i][j] = -1;
    }
}
```

---

## 2. Exercices de difficulté moyenne

### Exercice 6 — Somme par ligne
**Objectif :** Afficher la somme de chaque ligne.

```java
for (int i = 0; i < tableau.length; i++) {
    int sommeLigne = 0;
    for (int val : tableau[i]) sommeLigne += val;
    System.out.println("Somme ligne " + i + " = " + sommeLigne);
}
```

---

### Exercice 7 — Matrice identité
**Objectif :** Créer une matrice identité.

```java
int n = 4; // Taille
int[][] identite = new int[n][n];
for (int i = 0; i < n; i++) identite[i][i] = 1; // Diagonale principale
```

---

### Exercice 8 — Trouver une valeur
**Objectif :** Vérifier si une valeur existe et compter ses occurrences.

```java
int recherche = 7;
int occurences = 0;
for (int[] ligne : tableau) {
    for (int val : ligne) {
        if (val == recherche) occurences++;
    }
}
System.out.println("Occurences de " + recherche + " = " + occurences);
```

---

### Exercice 9 — Somme des éléments pairs
**Objectif :** Faire la somme des éléments pairs.

```java
int sommePairs = 0;
for (int[] ligne : tableau) {
    for (int val : ligne) {
        if (val % 2 == 0) sommePairs += val;
    }
}
System.out.println("Somme des pairs = " + sommePairs);
```

---

### Exercice 10 — Rotation 90°
**Objectif :** Rotation d’une matrice.

```java
int[][] original = {{1,2,3},{4,5,6},{7,8,9}};
int n = original.length;
int[][] rotation = new int[n][n];
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        rotation[j][n - 1 - i] = original[i][j];
    }
}
```


**Remarque :** Chaque solution est simplifiée pour la compréhension. Pour un projet complet, il faut ajouter la gestion des entrées utilisateur et des validations.
