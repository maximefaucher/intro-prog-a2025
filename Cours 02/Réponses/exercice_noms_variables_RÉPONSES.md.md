# Réponses : Validité des noms de variables Java

1. `tauxDeReussite` — Valide ✅ : nom descriptif, commence par une lettre.
2. `$montantTotal` — Valide ✅ : le signe dollar est autorisé comme premier caractère d'un nom de variable en Java. MAIS SON UTILISATION EST DÉCONSEILLÉE!
3. `@valeur` — Invalide ❌ : commence par un caractère spécial non autorisé.
4. `class` — Invalide ❌ : 'class' est un mot réservé du langage Java.
5. `nom étudiant` — Invalide ❌ : contient un espace, ce qui est interdit. Les accents sont à proscrire aussi.
6. `_compteur` — Valide ✅ : commence par un underscore, ce qui est autorisé.
7. `nombreEtudiants` — Valide ✅ : commence par une lettre et respecte la convention camelCase.
8. `1erEtudiant` — Invalide ❌ : commence par un chiffre, ce qui est interdit.
9. `taux-de-reussite` — Invalide ❌ : contient des tirets, qui ne sont pas autorisés.
10. `valeur1` — Valide ✅ : combinaison de lettres et chiffres, commence par une lettre. Mais n'est pas 100% significatif...
