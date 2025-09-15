# 📘 Théorie : Les méthodes String utiles pour valider et nettoyer du texte en Java

En Java, une **chaîne de caractères** est représentée par l’objet `String`.  
On peut appliquer de nombreuses méthodes sur une chaîne pour vérifier son contenu (**validation**) ou la modifier légèrement (**nettoyage**).

---

## 1. Vérifier le contenu (validations)

### 🔹 `length()`
- Retourne la longueur (le nombre de caractères) de la chaîne.
- Très utile pour vérifier si l’utilisateur a écrit quelque chose ou si le texte est trop court/long.

```java
String nom = "Alice";
System.out.println(nom.length()); // 5
```

👉 Exemple d’utilisation pour validation :
```java
if (nom.length() == 0) {
    System.out.println("Erreur : vous devez entrer un texte.");
}
```

---

### 🔹 `equals()` et `equalsIgnoreCase()`
- `equals()` compare deux chaînes exactement.
- `equalsIgnoreCase()` compare deux chaînes sans tenir compte des majuscules/minuscules.

```java
String reponse = "oui";
if (reponse.equals("oui")) {
    System.out.println("Réponse valide !");
}
```

```java
if (reponse.equalsIgnoreCase("OUI")) {
    System.out.println("Réponse valide (peu importe la casse).");
}
```

---

### 🔹 `startsWith()` et `endsWith()`
- Vérifient si une chaîne commence (`startsWith`) ou se termine (`endsWith`) par un texte précis.

```java
String code = "AB123";
if (code.startsWith("AB")) {
    System.out.println("Code valide : commence par AB");
}
```

---

### 🔹 `contains()`
- Vérifie si une chaîne contient un mot ou un caractère.

```java
String email = "test@gmail.com";
if (email.contains("@")) {
    System.out.println("Adresse email valide.");
}
```

---

## 2. Nettoyer une chaîne (préparer les données)

### 🔹 `trim()`
- Supprime les espaces au début et à la fin de la chaîne.
- Très utile pour éviter des erreurs de saisie accidentelles.

```java
String saisie = "   bonjour   ";
System.out.println(saisie.trim()); // "bonjour"
```

---

### 🔹 `toLowerCase()` et `toUpperCase()`
- Transforment tout le texte en minuscules ou en majuscules.
- Pratique pour uniformiser avant une comparaison.

```java
String mot = "Salut";
System.out.println(mot.toLowerCase()); // "salut"
System.out.println(mot.toUpperCase()); // "SALUT"
```

---

### 🔹 `replace()` et `replaceAll()`
- Remplacent une lettre ou une séquence de texte par une autre.

```java
String texte = "Bonjour le monde";
System.out.println(texte.replace("Bonjour", "Salut"));
// "Salut le monde"
```

---

### 🔹 `isEmpty()` et `isBlank()` (Java 11+)
- `isEmpty()` : Vérifie si la chaîne est vide (`""`).
- `isBlank()` : Vérifie si la chaîne est vide **ou** contient seulement des espaces.

```java
String saisie1 = "";
String saisie2 = "   ";

System.out.println(saisie1.isEmpty()); // true
System.out.println(saisie2.isEmpty()); // false
System.out.println(saisie2.isBlank()); // true
```

---

## 3. Méthodes utiles pour extraire des parties (bases)

### 🔹 `charAt()`
- Retourne le caractère à une position donnée (commence à 0).

```java
String mot = "Java";
System.out.println(mot.charAt(0)); // 'J'
```

---

### 🔹 `substring()`
- Extrait une partie du texte.

```java
String code = "AB123";
System.out.println(code.substring(0, 2)); // "AB"
```

---

# ✅ Résumé rapide

| Méthode | Rôle |
|---------|------|
| `length()` | Vérifie la longueur |
| `equals()` / `equalsIgnoreCase()` | Compare deux chaînes |
| `startsWith()` / `endsWith()` | Vérifie début/fin d’une chaîne |
| `contains()` | Vérifie si une chaîne contient du texte |
| `trim()` | Supprime les espaces autour |
| `toLowerCase()` / `toUpperCase()` | Uniformise le texte |
| `replace()` | Remplace un morceau de texte |
| `isEmpty()` / `isBlank()` | Vérifie si la chaîne est vide ou vide+espaces |
| `charAt()` | Accède à un caractère précis |
| `substring()` | Extrait une portion de texte |

