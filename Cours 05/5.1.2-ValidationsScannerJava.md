# 📘 Notes de cours -- Validations avec `Scanner` en Java (sans `while`)

## 1. Introduction à `Scanner`

La classe `Scanner` (du package `java.util`) permet de **lire des
données saisies par l'utilisateur au clavier**.

### Exemple simple :

``` java
import java.util.Scanner;

public class Exemple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = sc.nextInt();

        System.out.println("Vous avez entré : " + nombre);
    }
}
```

------------------------------------------------------------------------

## 2. Le problème des **validations**

Quand on demande une donnée à l'utilisateur, il peut se tromper : -
Entrer une **lettre** au lieu d'un nombre. - Entrer une valeur **hors
d'un intervalle** (ex : -5 alors qu'on attend un âge positif). - Entrer
une **chaîne vide**.

👉 C'est pourquoi on doit **valider** les données avant de les utiliser.

------------------------------------------------------------------------

## 3. Validation de types avec `Scanner`

### Vérifier si l'utilisateur a bien entré un entier

``` java
System.out.print("Entrez un nombre entier : ");
if (sc.hasNextInt()) {
    int valeur = sc.nextInt();
    System.out.println("Entier valide : " + valeur);
} else {
    System.out.println("Erreur : vous devez entrer un nombre entier !");
}
```

📌 Ici : - `hasNextInt()` vérifie si la prochaine saisie est bien un
entier. - Si ce n'est pas le cas, on affiche un message d'erreur.

------------------------------------------------------------------------

## 4. Validation de bornes (plage de valeurs)

Même si l'utilisateur entre un entier, il peut être **hors des bornes
attendues**.

Exemple : âge entre 0 et 120.

``` java
System.out.print("Entrez votre âge : ");
if (sc.hasNextInt()) {
    int age = sc.nextInt();

    if (age >= 0 && age <= 120) {
        System.out.println("Âge valide : " + age);
    } else {
        System.out.println("Erreur : l'âge doit être entre 0 et 120.");
    }
} else {
    System.out.println("Erreur : vous devez entrer un entier !");
}
```

------------------------------------------------------------------------

## 5. Validation de chaînes de caractères

Parfois, on veut que l'utilisateur entre du texte non vide.

``` java
System.out.print("Entrez votre nom : ");
String nom = sc.nextLine();

if (nom.isEmpty()) {
    System.out.println("Erreur : le nom ne peut pas être vide !");
} else {
    System.out.println("Bonjour, " + nom + " !");
}
```

------------------------------------------------------------------------

## 6. Validation sur une liste de choix

On peut aussi limiter les réponses possibles (exemple : OUI ou NON).

``` java
System.out.print("Voulez-vous continuer ? (oui/non) : ");
String reponse = sc.nextLine();

if (reponse.equalsIgnoreCase("oui")) {
    System.out.println("Vous avez choisi de continuer.");
} else if (reponse.equalsIgnoreCase("non")) {
    System.out.println("Vous avez choisi d'arrêter.");
} else {
    System.out.println("Erreur : vous devez répondre par 'oui' ou 'non'.");
}
```

------------------------------------------------------------------------

## 7. Limite sans `while`

Pour l'instant, avec seulement des **`if`**, on ne peut **pas redemander
automatiquement** une valeur en cas d'erreur.\
👉 On peut seulement afficher un **message d'erreur** et arrêter le
programme.\
👉 Quand on verra les **boucles (`while`)**, on pourra redemander
jusqu'à obtenir une valeur valide.

------------------------------------------------------------------------

# ✅ À retenir

1.  `Scanner` permet de lire des **nombres** (`nextInt()`,
    `nextDouble()`, etc.) et du **texte** (`nextLine()`).
2.  Pour valider :
    -   Utiliser `hasNextInt()`, `hasNextDouble()` pour vérifier le
        type.
    -   Utiliser des `if` pour vérifier des **plages de valeurs** ou des
        **règles**.
    -   Comparer les chaînes (`equalsIgnoreCase`) pour limiter les
        choix.
3.  Sans boucle, on peut seulement afficher une **erreur** et arrêter le
    programme.

------------------------------------------------------------------------

# 📊 Tableau synthèse des validations avec `Scanner`

  -------------------------------------------------------------------------------------------------------------------
  Type de          Méthode utilisée                            Exemple de code                          Message
  validation                                                                                            d'erreur
                                                                                                        possible
  ---------------- ------------------------------------------- ---------------------------------------- -------------
  Validation d'un  `hasNextInt()`                              `if (sc.hasNextInt()) { ... }`           "Erreur :
  entier                                                                                                vous devez
                                                                                                        entrer un
                                                                                                        nombre entier
                                                                                                        !"

  Validation d'un  `hasNextDouble()`                           `if (sc.hasNextDouble()) { ... }`        "Erreur :
  réel                                                                                                  vous devez
                                                                                                        entrer un
                                                                                                        nombre
                                                                                                        décimal !"

  Validation d'une `if (valeur >= min && valeur <= max)`       `if (age >= 0 && age <= 120)`            "Erreur :
  plage                                                                                                 valeur hors
                                                                                                        limites !"

  Validation de    `isEmpty()`                                 `if (nom.isEmpty())`                     "Erreur : le
  texte vide                                                                                            texte ne peut
                                                                                                        pas être vide
                                                                                                        !"

  Validation sur   `equalsIgnoreCase()`                        `if (rep.equalsIgnoreCase("oui")) ...`   "Erreur :
  un choix                                                                                              vous devez
                                                                                                        répondre par
                                                                                                        'oui' ou
                                                                                                        'non'."

  Validation d'un  `if (valeur > 0)`                           `if (salaire > 0)`                       "Erreur : la
  nombre positif                                                                                        valeur doit
                                                                                                        être positive
                                                                                                        !"

  Validation d'un  `if (valeur % 2 == 0)`                      `if (nombre % 2 == 0)`                   "Erreur : le
  nombre pair                                                                                           nombre doit
                                                                                                        être pair !"

  Validation d'un  `if (valeur % 2 != 0)`                      `if (nombre % 2 != 0)`                   "Erreur : le
  nombre impair                                                                                         nombre doit
                                                                                                        être impair
                                                                                                        !"

  Validation d'un  `if (motDePasse.length() >= 8)`             `if (mdp.length() >= 8)`                 "Erreur : le
  mot de passe                                                                                          mot de passe
  long                                                                                                  doit contenir
                                                                                                        au moins 8
                                                                                                        caractères !"

  Validation d'un  `contains("@") && contains(".")`            `if (email.contains("@"))`               "Erreur :
  email simple                                                                                          email
                                                                                                        invalide !"

  Validation d'une `if (note >= 0 && note <= 100)`             `if (note >= 0 && note <= 100)`          "Erreur : la
  note scolaire                                                                                         note doit
                                                                                                        être entre 0
                                                                                                        et 100."

  Validation d'un  `length == 6`                               `if (cp.length() == 6)`                  "Erreur : le
  code postal (ex                                                                                       code postal
  simple)                                                                                               doit avoir 6
                                                                                                        caractères !"

  Validation d'un  `if (chaine.length() == 1)`                 `if (lettre.length() == 1)`              "Erreur :
  seul caractère                                                                                        vous devez
                                                                                                        entrer un
                                                                                                        seul
                                                                                                        caractère !"

  Validation d'une `Character.isUpperCase(lettre.charAt(0))`   `if (Character.isUpperCase(c))`          "Erreur : la
  majuscule                                                                                             lettre doit
                                                                                                        être en
                                                                                                        majuscule !"

  Validation d'une `Character.isLowerCase(lettre.charAt(0))`   `if (Character.isLowerCase(c))`          "Erreur : la
  minuscule                                                                                             lettre doit
                                                                                                        être en
                                                                                                        minuscule !"
  -------------------------------------------------------------------------------------------------------------------

------------------------------------------------------------------------
