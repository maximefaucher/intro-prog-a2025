# Exercices boucles `for`

## 🟢 Série 1

### 1.1 Écrire le code

Affiche les nombres de 1 à 15 inclus, chacun sur une ligne.

### 1.2 Prédire l’affichage

```java
for (int i = 0; i < 5; i++) {
    System.out.print(i + " ");
}
```

### 1.3 Écrire le code

Affiche les multiples de 5 entre 5 et 50 inclus.

### 1.4 Prédire l’affichage

```java
for (int i = 10; i >= 6; i--) {
    System.out.println("Valeur : " + i);
}
```

### 1.5 Écrire le code

Affiche les lettres de l’alphabet de A à Z (utilise les codes ASCII).

## 🟡 Série 2

### 2.1 Écrire le code

Calcule et affiche la somme des entiers de 1 à 100.

### 2.2 Prédire l’affichage

```java
for (int i = 1; i <= 30; i++) {
    if(i % 4 == 0) {
        System.out.println(i);
    }
}
```

### 2.3 Écrire le code

Affiche les multiples de 7 entre 1 et 100, mais **sans utiliser l’opérateur %**.

### 2.4 Prédire l’affichage

```java
for (int i = 0; i < 25; i += 3) {
    if(i == 12) {
        continue;
    }
    System.out.print(i + " ");
}
```

### 2.5 Écrire le code

Affiche les 10 premiers carrés (ex. : 1×1 à 10×10).

## 🔴 Série 3

### 3.1 Écrire le code

Affiche les nombres de 1 à 100, mais remplace les multiples de 3 par `Fizz`, ceux de 5 par `Buzz`, et ceux de 3 et 5 par "FizzBuzz".

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
...
```

### 3.2 Prédire l’affichage

```java
int count = 0;
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        count++;
    }
}
System.out.println(count);
```

### 3.3 Écrire le code

Affiche les 10 premiers termes de la suite de Fibonacci. Les 2 premiers termes sont gaux à 1, et les suivants sont définis comme `Terme N = Terme N-1 + Terme N-2`.

Ainsi, `Terme 3 = Terme 2 + Terme 1 = 1 + 1 = 2` et `Terme 4 = Terme 3 + Terme 2 = 2 + 1 = 3`, et ainsi de suite.

Les 10 premiers termes sont donc `1, 1, 2, 3, 5, 8, 13, 21, 34, 55`.
