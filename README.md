# PCL Mini-Rust 2018

Projet de Compilation des langages réalisé par Sacha Lemonnier, Louise Pount, Gautier Raimondi et Maxime Riere

## Contrôles sémantiques réalisés

Liste des contrôles réalisés : 

  - [X] Type de return correspond à renvoi de fonction
  - [X] Lors d'une affectation, le membre de gauche est bel et bien une variable définie
  - [X] Lors d'une affectation, le membre de gauche est bel et bien mutable
  - [X] Lors d'une affectation, les types des membres de droite et gauche sont les mêmes
  - [X] Lors d'une déclaration de variable, le nom n'est pas déjà pris par une fonction.
  - [X] Lors d'une déclaration, si le type est renseigné, il est cohérent avec les données d'initialisation 
  - [X] Lors de la déclaration d'un tableau de tableau, la taille de chaque sous-tableau est identique
  - [X] Lors de la déclaration d'un tableau, les types de tous les élements du tableau sont identiques
  - [X] Lors de la déclaration d'un tableau, les types des élements correspond au sous-type du tableau
  - [X] Lors de l'appel d'attribut ("x.a"), la variable x est bien définie
  - [X] Lors de l'appel d'attribut ("x.a"), l'attribut a existe bien dans la strucutre de x
  - [X] Lors de l'appel à un tableau ("t[i]"), l'index i est plus petit que la taille de t
  - [X] Lors de l'appel à un tableau ("t[i]"), la variable t doit être définie
  - [X] Lors de l'appel à un tableau ("t[i]"), la variable t doit être de type "vec ?"
  - [X] Lors de l'appel à un tableau ("t[i]"), la variable i doit être de type i32
  - [X] Lors de la déclaration d'une variable de structure ("x = data {a:5,y:false}"), chaque attribut doit être du même que défini dans la structure
  - [X] Lors de la déclaration d'une variable de structure ("x = data {a:5,y:false}"), chaque attribut doit être présent dans la structure
  - [X] Lors de la déclaration d'une variable de structure ("x = data {a:5,y:false}"),   tous les attributs de la structure doivent être renseignés
  - [X] L'opération & ne peut s'appliquer qu'à des variables
  - [X] Lors d'une opération binaire entière (+,-,*,/) , les types des membres de droite et gauche sont les mêmes, et i32
  - [X] L'opération ! ne s'applique qu'à des booléens
  - [X] Lors d'une opération binaire booléenne (&&, ||), les tŷpes des membres de droite et gauche sont les mêmes, et bool
  - [X] Lors d'une opération de comparaison d'égalité (==, !=), les types des membres de droite et gauche sont les mêmes, et i32 ou bool
  - [X] Lors d'une opération de comparaison (>,<,<=,>=), les types des membres de droite et gauche sont les mêmes, et i32
  - [X] L'opération unaire * ne peut s'appliquer qu'aux adresses
  - [X] L'opération unaire - ne peut s'appliquer qu'aux i32
  - [X] Lors de l'appel d'une fonction ("f(a,b)"), il ne doit pas y avoir plus de paramètres que défini par la fontion
  - [X] Lors de l'appel d'une fonction ("f(a,b)"), chaque paramètres doit être le même ordre et du même type que dans la définition de la fonction
  - [X] Lors de l'appel d'une fonction ("f(a,b)"), tous les paramètres défnis par la fonction doivent être renseignés
  - [X] Lors de l'appel à une variable, elle doit être définie
  - [X] Lors de la déclaration d'une fonction, il est impossible de passer des tableaux en paramètres (utilisation de pointeur)
  - [X] Lors de la déclaration de fonction, le nom de fonction ne doit pas être déjà utilisé
  - [X] Lors de l'appel à un type "struct", il doit être défini (en tant que struct)
  - [X] Lors de la déclaration de structure, le type de chaque paramètre est un type existant
  - [X] Lors de la déclaration de structure, le nom ne doit pas être déjà utilisé
  - [X] Lors de l'appel à while ou if, la condition doit être un bool
  - [ ] Lors de l'appel à une variable, elle doit être définie comme une variable
  - [ ] Lors de l'appel à une fonction, elle doit être définie comme une fonction
  - [X] [Warning] Prévient lors de la surcharge d'une variable par une autre d'un Scope parent
  - [X] [Warning] Prévient lors du "shadowing" d'une variable (variable déjà déclarée dans ce scope)
  - [X] [Warning] Regarde quelles fonctions n'ont pas de "return" 