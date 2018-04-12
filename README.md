# Projet

Application spring boot basÃ© sur une application permettant de gerer des affaires d'une equipe de police


## Installations logiciels et serveurs requis

- Avoir au prealable installer Eclipse JEE ainsi que maven (facultatif car SpringBoot en embarque un de base), disponibles sur leur site officiel.

- Installer un serveur Mysql (https://www.mysql.com/fr/ dans la rubrique download ou de preference phpMyAdmin ou MysqlWorkbench )
- lors de l'installation, laissez le port d'origine (3306)
- utiliser les identifiants de votre choix
- Une fois installé, verfier que le serveur Mysql est bien demarré
- se connecter a la base en utilisant :
        ```
        -hote : localhost
        -utilisateur et mot de passe : ceux renseignés lors de l'installation du logiciel
        -port : 3306
        ```
- importer le fichier mist.sql (situé dans le dossier resources) dans le Systeme de gestion de BDD
- cela importera toutes les données utiles pour le bon fonctionnement de spring boot
- pour l'instant un seul rôle ayant tous les privileges a été crée
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
 * **PUT** /api/vehicule/[id] : met Ã  jour l'instance de vehicule correspondant Ã  l'id fourni avec les informations fournies.
 * **DELETE** /api/vehicule/[id] : supprime l'instance de vehicule correspondant Ã  l'id fourni.

 
### Installation du projet

Cloner et recuperer le projet

importer le projet en tant que "projet maven existant"

ouvrir une console de ligne de commande

se deplacer a la racine du projet

**Compilation**
```
mvn clean install
```

Une fois la compilation effectuée et build avec succès :

-retourner dans eclipse

- inutile de modifier les données dans ' application.properties' car les données  (lors installation mysql) au debut sont les meme que celles dans ce fichier

-lancer le projet (run as spring boot application)

- Executer les differentes requetes grace au logiciel "Postman"


## Auteur

* **NESIC Alexandre** 
largement inspiré/pompé sur Nourry Jean-Luc
Les documents tels que diagramme de classe et use case et wireframe sont dans le dossier document.



