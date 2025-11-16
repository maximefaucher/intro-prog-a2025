
# Tableaux à Deux Dimensions en Java

Un **tableau à deux dimensions** est un tableau dont chaque élément est lui-même un tableau.  
On peut le voir comme une **grille** ou une **matrice**, avec des lignes et des colonnes.  

---

## Déclaration et Initialisation

```java
// Déclaration d'un tableau 2D d'entiers
int[][] tableauEntiers;

// Initialisation avec taille fixe
tableauEntiers = new int[3][4]; // 3 lignes, 4 colonnes

// Déclaration et initialisation en même temps
int[][] tableauExemple = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

- `tableau[i][j]` correspond à l'élément à la ligne `i` et la colonne `j`.
- Les indices commencent à **0**.

---

## Exemple avec Valeurs Numériques

```java
int[][] notes = {
    {80, 90, 75},
    {60, 70, 85},
    {100, 95, 90}
};

System.out.println("Note de l'élève 2 à l'examen 3 : " + notes[1][2]); // 85
```

---

## Exemple avec Caractères

```java
char[][] lettres = {
    {'A', 'B', 'C'},
    {'D', 'E', 'F'},
    {'G', 'H', 'I'}
};

System.out.println("Lettre en ligne 3, colonne 2 : " + lettres[2][1]); // H
```

---

## Exemple avec Strings

```java
String[][] prenoms = {
    {"Alice", "Bob"},
    {"Charlie", "David"},
    {"Eva", "Frank"}
};

System.out.println("Nom à la ligne 1, colonne 2 : " + prenoms[0][1]); // Bob
```

---

## Transposition d'un Tableau à Deux Dimensions

La **transposition** d'un tableau consiste à échanger ses lignes et ses colonnes.

```java
int[][] original = {
    {1, 2, 3},
    {4, 5, 6}
};

int lignes = original.length;       // 2
int colonnes = original[0].length; // 3
int[][] transpose = new int[colonnes][lignes];

for(int i = 0; i < lignes; i++) {
    for(int j = 0; j < colonnes; j++) {
        transpose[j][i] = original[i][j];
    }
}

// Affichage
for(int i = 0; i < colonnes; i++) {
    for(int j = 0; j < lignes; j++) {
        System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
}
```

**Résultat :**
```
1 4
2 5
3 6
```

---

## Exemple : Classe et Places Assises

On peut représenter une **classe** avec un tableau 2D, où chaque case indique si une place est occupée ou non (`true` = assis, `false` = libre).

```java
boolean[][] classe = {
    {true, false, true},
    {false, false, true},
    {true, true, true}
};

// Vérification si la place à la ligne 2, colonne 3 est occupée
if(classe[1][2]) {
    System.out.println("La place est occupée.");
} else {
    System.out.println("La place est libre.");
}

// Affichage complet de la classe
for(int i = 0; i < classe.length; i++) {
    for(int j = 0; j < classe[i].length; j++) {
        if(classe[i][j]) {
            System.out.print("X "); // X = occupé
        } else {
            System.out.print("O "); // O = libre
        }
    }
    System.out.println();
}
```

**Exemple de sortie :**
```
X O X
O O X
X X X
```

---

## Points Clés

- Un tableau 2D se lit avec deux indices : `[ligne][colonne]`.
- Les tableaux peuvent contenir n'importe quel type : `int`, `char`, `String`, `boolean`...
- La **transposition** échange lignes et colonnes.
- Les tableaux peuvent représenter des grilles, des matrices ou des situations réelles comme une classe.

---

## Résumé Visuel des Indices

Si on prend un tableau 2x3 :

```
tableau = {
    {1, 2, 3},
    {4, 5, 6}
}
```

- Ligne 0 : 1, 2, 3
- Ligne 1 : 4, 5, 6

Indices : `tableau[ligne][colonne]`  

|       | Col 0 | Col 1 | Col 2 |
|-------|-------|-------|-------|
| L0    | 1     | 2     | 3     |
| L1    | 4     | 5     | 6     |

Après transposition (3x2) :

|       | Col 0 | Col 1 |
|-------|-------|-------|
| L0    | 1     | 4     |
| L1    | 2     | 5     |
| L2    | 3     | 6     |
