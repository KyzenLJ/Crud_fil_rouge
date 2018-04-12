# Projet

Application spring boot basé sur une application permettant de gerer des affaires d'une equipe de police


## Installations logiciels et serveurs requis

- Avoir au prealable installer Eclipse JEE ainsi que maven (facultatif car SpringBoot en embarque un de base), disponibles sur leur site officiel.

- Installer un serveur Mysql (https://www.mysql.com/fr/ dans la rubrique download ou de preference phpMyAdmin ou MysqlWorkbench )
- lors de l'installation, laissez le port d'origine (3306)
- utiliser les identifiants de votre choix
- Une fois install�, verfier que le serveur Mysql est bien demarr�
- se connecter a la base en utilisant :
        ```
        -hote : localhost
        -utilisateur et mot de passe : ceux renseign�s lors de l'installation du logiciel
        -port : 3306
        ```
- importer le fichier mist.sql (situ� dans le dossier resources) dans le Systeme de gestion de BDD
- cela importera toutes les donn�es utiles pour le bon fonctionnement de spring boot
- pour l'instant un seul r�le ayant tous les privileges a �t� cr�e
        ```
        - utilisateur : directeur
        - mot de passe : miamicsi
        ```
- ce profil est celui qui a un contr�le total � la base de donn�e mist

- Installer postman afin de pouvoir effectuer des requ�tes pour obtenir les donn�es (sur le localhost qui �coute sur le port 8080)


### Pr�sentation api et contribution personnelle

**Table vehicule bas�e sur un repository utilisatnt Datasource et Le driver JDBC:**

* **GET** /api/vehicule : liste les informations de l'ensemble des instances de vehicule.
 * **GET** /api/vehicule/[id] : renvoie les informations d'une instance d'objet vehicule avec son id.
 * **POST** /api/vehicule : cr�e une nouvelle instance de vehicule avec les informations fournies.
 * **PUT** /api/vehicule/[id] : met à jour l'instance de vehicule correspondant à l'id fourni avec les informations fournies.
 * **DELETE** /api/vehicule/[id] : supprime l'instance de vehicule correspondant à l'id fourni.

 
### Installation du projet

Cloner et recuperer le projet

importer le projet en tant que "projet maven existant"

ouvrir une console de ligne de commande

se deplacer a la racine du projet

**Compilation**
```
mvn clean install
```

Une fois la compilation effectu�e et build avec succ�s :

-retourner dans eclipse

- inutile de modifier les donn�es dans ' application.properties' car les donn�es  (lors installation mysql) au debut sont les meme que celles dans ce fichier

-lancer le projet (run as spring boot application)

- Executer les differentes requetes grace au logiciel "Postman"


## Auteur

* **NESIC Alexandre** 
largement inspir�/pomp� sur Nourry Jean-Luc
Les documents tels que diagramme de classe et use case et wireframe sont dans le dossier document.



