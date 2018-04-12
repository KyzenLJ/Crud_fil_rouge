# Projet

Application spring boot basé sur une application permettant de gérer des affaires d'une équipe de police


## Installations logiciels et serveurs requis

- Avoir au préalable installer Eclipse JEE ainsi que maven (facultatif car SpringBoot en embarque un de base), disponible sur leur site officiel.

- Installer un serveur Mysql (https://www.mysql.com/fr/ dans la rubrique download)
- lors de l'installation, laissez le port d'origine (3306)
- utiliser les identifiants de votre choix
- Une fois installé, vérfier que le serveur Mysql est bien demarré
- se connecter à la base en utilisant :
        ```
        -hote : localhost
        -utilisateur et mot de passe : ceux renseignés lors de l'installation du logiciel
        -port : 3306
        ```
- importer le fichier mist.sql (situé dans le dossier resources) dans le Systeme de gestion de BDD
- cela importera toutes les données utiles pour le bon fonctionnement de spring boot
- pour l'instant un seul rôle ayant tous les privilèges a été créé
        ```
        - utilisateur : directeur
        - mot de passe : miamicsi
        ```
- ce profil est celui qui a un contrôle total à la base de donnée mist

- Installer postman afin de pouvoir effectuer des requêtes pour obtenir les données (sur le localhost qui écoute sur le port 8080)


### Présentation api et contribution personnelle

**Table vehicule basée sur un repository utilisatnt Datasource et Le driver JDBC:**

* **GET** /api/vehicule : liste les informations de l'ensemble des instances de vehicule.
 * **GET** /api/vehicule/[id] : renvoie les informations d'une instance d'objet vehicule avec son id.
 * **POST** /api/vehicule : crée une nouvelle instance de vehicule avec les informations fournies.
 * **PUT** /api/vehicule/[id] : met à jour l'instance de vehicule correspondant à l'id fourni dans un de modification des informations.
 * **DELETE** /api/vehicule/[id] : supprime l'instance de vehicule correspondant à l'id fourni.

 
### Installation du projet

Cloner et récuperer le projet

Importer le projet en tant que "projet maven existant"

Se deplacer à la racine du projet et y ouvrir une console de ligne de commande.
Soit en faisant un "git bash here" (si installé sur votre ordinateur), soit, taper "cmd" et valider, dans la barre de chemin de l'explorateur.

**Compilation**
```
mvn clean install
```

Une fois la compilation effectuée et build avec succès :

-retourner dans eclipse

- Modifier les données dans ' application.properties' afin de faire correspondre l'identifiant et le mot de passe de connection à vôtre base de données.

-lancer le projet (run as spring boot application)

- Exécuter les différentes requêtes grâce au logiciel "Postman"


## Auteur

* **NESIC Alexandre** 
largement inspiré/pompé sur Nourry Jean-Luc.
Les documents tels que diagramme de classe, use case et wireframe sont dans le dossier document.



