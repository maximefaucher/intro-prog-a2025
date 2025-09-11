# Exercices 2

## 1. Indique le résultat des expressions

   Chaque numéro est traité de **façon individuelle**. En supposant que

   ```java
   int iNbr1 = 1, iNbr2 = 2, iNbr3 = 3;
   ```

   Indiquer si les conditions suivantes sont exécutées (oui ou non)

   a) `if( (iNbr2 != iNbr1) || (iNbr3 == iNbr1) )`  

   b) `if( !(iNbr3 > iNbr1) )`  

   c) `if( (iNbr1 <= 99) && (iNbr3 == iNbr2) )`  

   d) `if( !(iNbr1 >= 1 ) && (iNbr2 < 4) )`  

   e) `if( !((iNbr1 <= 1) && ( iNbr2 == 2)) )`

## 2. Trouvez les valeurs et prédire l'affichage

  Les instructions **se suivent**, donc sont dépendantes des précédentes. En  supposant que

  ```java
  int iNbrVolume = 10, iNbrCrayon = 4;
  boolean  b1, b2, b3, b4;
  b1 = b2 = b3 = b4 = true;
  ```

  Donne la valeur des variables booléennes suivantes

  a) `b1 = ((iNbrVolume > 10) && (iNbrCrayon == 4));`

  b) `b2 = ((iNbrVolume == 10) || (iNbrCrayon == 5) || (!b4));`

  c) `b3 = (( iNbrVolume > iNbrCrayon) && (b2 == b1) || (iNbrCrayon < iNbrVolume));`

  d) `b4 = (( b2 = !b4 ) && ( b1 == b2 ) || (iNbrVolume > iNbrCrayon));`

  e) Et prédire l'affichage de ces instructions

```java
    if(b1) {
        System.out.println("dans le if(b1)");
    } else {
        System.out.println("dans le sinon de if(b1)");
    }

    if(!b2) {
        System.out.println("dans le if(!b2)");
    } else {
        System.out.println("dans le sinon if(!b2)");
    }
```

## 3. Utilise l'opérateur ternaire `? :` pour répondre aux demandes suivantes

  a) Affecte à `iMin` la **valeur minimale** entre `nb1` et `nb2`.

  b) Affecte à `iAbs` la **valeur absolue** de `nbA`.

  c) Faire afficher en console un message différent selon qu'un entier `nbEntier` est pair ou non.

## 4. Chaînes de caractères - Nettoyage et comparaison

  Demandez à l'utilisateur de saisir deux phrases. Votre programme doit :
  
  1. Supprimer les espaces inutiles au début et à la fin de chaque phrase.  
  2. Convertir les deux phrases en minuscules.  
  3. Comparer les phrases sans tenir compte de la casse.  
  4. Afficher si elles sont identiques ou non.  
  5. Afficher la longueur de chaque phrase après nettoyage.

## 5. Chaînes de caractères - Analyse d'un mot-clé

  Demandez à l'utilisateur de saisir une phrase et un mot-clé. Votre programme doit :

  1. Trouver la position du mot-clé dans la phrase.
  2. Extraire la sous-chaîne qui commence à ce mot-clé jusqu'à la fin de la phrase.
  3. Afficher le premier caractère du mot-clé en majuscule.
  4. Afficher la sous-chaîne extraite.

## 6. Chaînes de caractères - Transformation d’une phrase

  Demandez à l'utilisateur de saisir une phrase contenant le mot "java". Votre programme doit :

  1. Remplacer `java` par `JAVA`.
  2. Convertir toute la phrase en majuscules.
  3. Extraire les 10 derniers caractères de la phrase transformée.
  4. Afficher la phrase modifiée et la sous-chaîne finale.
