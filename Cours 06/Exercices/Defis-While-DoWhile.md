# 🧠 Défis de programmation Java : Boucles `while` et `do...while`

Ces cinq défis sont conçus pour pratiquer les boucles `while` et `do...while` en Java, tout en stimulant la réflexion algorithmique.

## 🔐 Défi 1 : Mastermind numérique

**Objectif** : Créer un jeu de type Mastermind avec une combinaison secrète de 4 chiffres (entre 0 et 9).

### 1.1 Règles

- Décidez d'une combinaison secrète de 4 chiffres.
- L’utilisateur propose une combinaison.
- Le programme donne un retour pour chaque chiffre :
  - ✅ Bon chiffre à la bonne position
  - 🔄 Bon chiffre à la mauvaise position
  - ❌ Chiffre absent de la combinaison
- Le jeu continue jusqu’à ce que la combinaison soit devinée.

### 1.2 Bonus

- Limiter à 10 tentatives.
- Afficher l’historique des tentatives et des feedbacks.

## 🔁 Défi 2 : La suite mystérieuse

**Objectif** : Afficher les termes d’une suite définie par :

- `u_0 = 1`
- `u_n+1 = 3u_n + 1`
- Tant que `u_n < 1000`

### 2.1 Règles

- Utiliser une boucle `do...while`.
- Afficher chaque terme de la suite.

## 🎯 Défi 3 : Le nombre magique

**Objectif** : L’ordinateur choisit un nombre entre 1 et 100. L’utilisateur doit le deviner.

### 3.1 Règles

- Après chaque tentative, le programme indique :
  - "Trop grand"
  - "Trop petit"
  - "Bravo!" si le nombre est trouvé
- Le jeu continue jusqu’à la bonne réponse.

### 3.2 Bonus

- Compter le nombre de tentatives.
- Proposer de rejouer à la fin.

## ➕ Défi 4 : Somme des entiers positifs

**Objectif** : Demander à l’utilisateur de saisir des entiers positifs et calculer leur somme.

### 4.1 Règles

- La saisie continue tant que l’utilisateur entre des nombres positifs.
- Lorsqu’un nombre négatif est saisi, la boucle s’arrête.
- Afficher la somme totale.

### 4.2 Bonus

- Afficher le nombre de valeurs saisies.

## 🔄 Défi 5 : Mot palindrome

**Objectif** : Vérifier si un mot saisi est un palindrome.

### 5.1 Règles

- Demander un mot à l’utilisateur.
- Vérifier s’il se lit de la même façon à l’endroit et à l’envers.
- Répéter tant que le mot n’est pas un palindrome.
- Afficher un message de félicitations lorsque c’est le cas.

### 5.2 Bonus

- Ignorer la casse (majuscule/minuscule).
- Ignorer les espaces.
