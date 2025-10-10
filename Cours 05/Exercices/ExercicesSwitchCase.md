# Exercices sur les switch-case en Java

**Intégrer des validations de données dans vos programmes.** Mettre des messages d'erreurs appropriés.

## Exercice 1 : Jour de la semaine (Facile)

Écris un programme qui prend un entier entre 1 et 7 et affiche le jour correspondant de la semaine :

- 1 → Lundi
- 2 → Mardi
- ...
- 7 → Dimanche

Utilise un `switch` pour faire cette correspondance.

---

## Exercice 2 : Calculatrice simple (Niveau moyen)

Demande à l'utilisateur deux nombres et une opération parmi `+`, `-`, `*`, `/` et affiche le résultat correspondant en utilisant un `switch`.

**Attention!**

- Votre programme ne devrait pas demander la saisie du 2e nombre et de l'opérateur si le premier nombre est invalide (pas un nombre).
- Similairement, si le 2e nombre est invalide, pas de saisie de l'opérateur
- Finalement si l'opérateur est invalide, on ne peut pas afficher le résultat de l'opération.

---

## Exercice 3 : Système de notation (Niveau moyen)

Demande à l'utilisateur une note entre 0 et 20, puis affiche une appréciation selon la note :

- 0 à 9 : "Insuffisant"
- 10 à 11 : "Passable"
- 12 à 13 : "Assez bien"
- 14 à 15 : "Bien"
- 16 à 17 : "Très bien"
- 18 à 20 : "Excellent"

---

## Exercice 4 : Mois et nombre de jours (Niveau moyen)

Écris un programme qui prend un entier entre 1 et 12 ou le nom représentant un mois, puis affiche le nombre de jours de ce mois (pas d'année bissextile à gérer). Utilise un `switch` avec des cas combinés (ex: `case 1, 3, 5, 7, 8, 10, 12:`).

## Exercice 5 : Mois et nombre de jours (Niveau avancé)

Refaire l'exercice 4 mais en demandant aussi une année en plus de gérer les années bissextiles et en affichant la saison (automne, été, printemps, hiver) associée au mois reçu.
