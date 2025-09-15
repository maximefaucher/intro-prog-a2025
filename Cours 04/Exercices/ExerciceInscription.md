# 💡 Exercice Java : Système de gestion d'inscription à une compétition sportive

On veut écrire un programme Java qui permet de gérer l'inscription d'un
participant à une compétition.

------------------------------------------------------------------------

## 🎯 Contraintes

1.  Le programme doit demander successivement :

    -   Le **nom complet** du participant (non vide, au moins 2
        caractères).\
    -   L'**âge** du participant (entier).\
    -   Le **poids** du participant (double, en kilogrammes, avec 2
        décimales).\
    -   La **catégorie sportive choisie** : `"natation"`, `"course"`,
        `"cyclisme"` (insensible à la casse).

2.  Les validations à effectuer :

    -   ⚠️ **Nom** : ne doit pas être vide, ni contenir seulement des
        espaces.\
    -   ⚠️ **Âge** : doit être entre `12` et `65` inclus, sinon refus
        d'inscription.\
    -   ⚠️ **Poids** : doit être entre `30.00` kg et `200.00` kg
        inclus.\
    -   ⚠️ **Catégorie** : doit correspondre exactement à une des 3
        catégories proposées, sinon afficher un message d'erreur.

3.  Selon l'âge et le poids, le programme doit **affecter le participant
    à une sous-catégorie** :

    -   **Âge** :
        -   12--17 → "Junior"\
        -   18--40 → "Adulte"\
        -   41--65 → "Senior"\
    -   **Poids** :
        -   ≤ 60 kg → "léger"\

        -   61--90 kg → "moyen"\

        -   90 kg → "lourd"

    Exemple : un participant de 25 ans et 72 kg → "Adulte - Moyen".

4.  À la fin, afficher un résumé formaté avec `printf` :

``` txt
Résumé d'inscription :
Nom        : <nom>
Âge        : <âge> ans
Poids      : <poids> kg
Catégorie  : <catégorie> (<sous-catégorie complète>)
```

------------------------------------------------------------------------

## 🔹 Points de difficulté (qui prennent du temps)

-   Bien gérer la **validation des entrées** (nom vide, mauvaise valeur
    numérique, mot en minuscules/majuscules).\
-   Utiliser des `if` imbriqués pour déterminer les sous-catégories.\
-   Employer `printf` pour un affichage clair et aligné.\
-   Penser aux **cas limites** :
    -   âge = 12 ou 65 (frontières valides)\
    -   poids = 30.00 ou 200.00\
    -   catégorie écrite en majuscules (`"NATATION"`) → doit être
        acceptée.\
    -   entrées invalides → message d'erreur + re-demander la valeur.

------------------------------------------------------------------------

## ✅ Objectif attendu

Au bout d'environ **2 heures**, l'étudiant doit avoir :\
- Un programme **robuste** face aux mauvaises entrées.\
- De nombreux `if` bien structurés.\
- Une sortie formatée et professionnelle avec `printf`.
