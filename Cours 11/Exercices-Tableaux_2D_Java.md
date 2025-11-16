# Exercices sur les Tableaux 2D en Java

## 1. Exercices simples

### Exercice 1 — Somme des éléments
Écrire un programme qui calcule la somme de tous les éléments dans un tableau 2D d’entiers initialisé aléatoirement.

### Exercice 2 — Trouver le minimum
Trouver la plus petite valeur dans un tableau 2D remplit aléatoirement.

### Exercice 3 — Compter les zéros
Compter combien de cases contiennent la valeur `0` dans un tableau 2D.

### Exercice 4 — Afficher une matrice
Créer un tableau 2D 3×3 et afficher son contenu sous forme de grille.

### Exercice 5 — Remplacer une valeur
Demander une valeur à l’utilisateur et remplacer toutes ses occurrences par `-1` dans un tableau préalablement remplis aléatoirement de valeurs entre 14 et 19.


## 2. Exercices de difficulté moyenne

### Exercice 6 — Somme par ligne
Afficher la somme de chaque ligne d’un tableau 2D.

### Exercice 7 — Matrice identité
Créer une matrice identité de taille donnée par l’utilisateur. Une matrice identité, aussi appelée matrice unité, est une matrice carrée dont les éléments sur la diagonale principale sont des \(1\) et tous les autres éléments sont des \(0\). Elle sert d'élément neutre pour la multiplication matricielle, ce qui signifie que lorsqu'elle est multipliée par une autre matrice, elle donne toujours cette même matrice (par exemple, \(A*I=A\)).  

### Exercice 8 — Trouver une valeur
Demander une valeur à l’utilisateur et indiquer si elle existe dans le tableau et combien d'occurence y a t'il de cette valeur.

### Exercice 9 — Compter les éléments pairs
Faire la somme de tous les éléments pairs dans un tableau 2D.

### Exercice 10 — Rotation 90°
Créer un programme qui génère un nouveau tableau correspondant à une rotation de 90° d'une matrice.


---

# 3. Jeu de Bingo (Tableau 2D)

## Initialisation d’une grille de Bingo (5×5)

### Fonction Java d’initialisation aléatoire
```java
public static int[][] initialiserBingo() {
    int[][] bingo = new int[5][5];
    java.util.Random rand = new java.util.Random();

    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            bingo[i][j] = rand.nextInt(75) + 1; // Valeurs entre 1 et 75
        }
    }
    return bingo;
}
```

### Exercice Bingo
1. Créer et afficher la grille générée.
2. Demander un nombre à l’utilisateur.
3. Remplacer ce nombre par `0` s’il est dans le tableau.
4. Afficher la nouvelle grille.
5. Faire une fonction DetectionCoins permettant de détecter si les 4 coins de la matrice sont atteints.
6. Faire une fonction DetectionLigne permettant de détecter si une ligne (verticale ou horizontale) est pleine dans la carte de bingo.


---

# 4. Jeu Battleship (Bataille Navale)

### Fonction d’initialisation
```java
public static char[][] initialiserBatailleNavale() {
    char[][] grille = new char[10][10];
    java.util.Random rand = new java.util.Random();

    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            grille[i][j] = '~'; // eau
        }
    }

    // Placer 5 bateaux simples, 1 case chacun
    for (int b = 0; b < 5; b++) {
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        grille[x][y] = 'B';
    }
    return grille;
}
```

### Exercice Battleship
Créer un mini-jeu :
1. Initialiser la grille.
2. L’utilisateur entre une position (ligne, colonne).
3. Afficher “Touché!” ou “Manqué!”.
4. Marquer le tir dans la grille à l'aide d'un X. Si tous vos bateaux sont composés de X, vous avez perdu la partie.


---

# 5. Jeu de Puissance 4 (Connect Four)

Le jeu se joue dans un tableau 2D de 6 lignes × 7 colonnes.

### Exercice Puissance 4 (Défi)
1. Créer la grille vide (`'.'` pour une case vide).
2. Demander à l'utilisateur la chute d’un jeton dans une colonne de son choix.
3. Vérifier si un joueur a aligné 4 jetons verticalement.
4. Afficher la grille après chaque coup.

### Exemple d’initialisation
```java
public static char[][] initialiserPuissance4() {
    char[][] grille = new char[6][7];
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 7; j++) {
            grille[i][j] = '.';
        }
    }
    return grille;
}
```