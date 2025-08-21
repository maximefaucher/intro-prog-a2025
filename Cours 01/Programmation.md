# Comment fonctionnent les langages de programmation ?

Comprendre comment un langage de programmation fonctionne, de l'écriture d'une instruction à son exécution sur une machine, implique plusieurs couches de transformation et d'interprétation. Voici une vue d'ensemble du processus :

## 🧠 1. Écriture du code source

Tu écris des instructions dans un langage de programmation comme Python, Java, C++, etc. Ce langage est compréhensible par les humains, mais pas directement par la machine.

Exemple en Python :

```python
print("Bonjour le monde!")
```

## 🛠️ 2. Traduction du code (Compilation ou Interprétation)

Il existe deux grandes familles de langages :

- **Langages compilés** (ex. C, C++) :
  - Le code source est traduit en langage machine (binaire) par un compilateur.
  - Le résultat est un fichier exécutable (.exe, .out, etc.).
  - Ce fichier peut être lancé directement par le système d'exploitation.

- **Langages interprétés** (ex. Python, JavaScript) :
  - Le code est **lu ligne par ligne** par un **interpréteur**.
  - Chaque instruction est traduite et exécutée **à la volée**.

Certains langages (comme Java) utilisent une **approche hybride** :

- Le code source est d'abord compilé en ***bytecode***.
- Ce *bytecode* est ensuite exécuté (interprété) par une **machine virtuelle** (appelée *JVM*, ou *Java Virtual Machine*).

## ⚙️ 3. Traduction en langage machine

Le compilateur ou l'interpréteur transforme les instructions en langage machine : une série de 0 et 1 que le processeur peut comprendre.

Exemple :

```python
print("Bonjour le monde!")
```

→ devient une série d'instructions comme :

```text
LOAD "Bonjour le monde!"
CALL print_function
```

→ puis en binaire :

```text
01001000 01100101 01101100 01101100 01101111
```

## 🧩 4. Exécution par le processeur

Le processeur exécute les instructions binaires :

- Il lit les données en mémoire.
- Il effectue des opérations (calculs, affichage, etc.).
- Il interagit avec les périphériques (écran, clavier, disque dur…).

## 🖥️ 5. Affichage ou résultat

Une fois les instructions exécutées, tu vois le résultat :

```python
Bonjour le monde!
```

## 🔄 Résumé du cycle

`Code source → [Compilateur/Interpréteur] → Langage machine → [Processeur] → Résultat`
