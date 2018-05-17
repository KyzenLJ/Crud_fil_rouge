# Projet

Application spring boot basé sur une application permettant de gérer des affaires d'une équipe de police


## Installations logiciels et serveurs requis

- Avoir au préalable installé Eclipse JEE ainsi que maven (facultatif car SpringBoot en embarque un de base), disponible sur leur site officiel.

- Installer un serveur Mysql (https://www.mysql.com/fr/ dans la rubrique download)
- lors de l'installation, laisser le port d'origine (3306)
- utiliser les identifiants de votre choix
- Une fois installé, vérfier que le serveur Mysql est bien demarré
- se connecter � la base en utilisant :
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

**Table vehicule basée sur un repository utilisant hibernate (Datasource et Le driver JDBC sont en commentaire dans la classe VehiculeRepository:)**

* **GET** /api/vehicule : liste les informations de l'ensemble des instances de vehicule.
 * **GET** /api/vehicule/[id] : renvoie les informations d'une instance d'objet vehicule avec son id.
 * **POST** /api/vehicule : crée une nouvelle instance de vehicule avec les informations fournies.
 * **PUT** /api/vehicule/[id] : met à jour l'instance de vehicule correspondant à l'id fourni dans un de modification des informations.
 * **DELETE** /api/vehicule/[id] : supprime l'instance de vehicule correspondant à l'id fourni.

 
### Installation du projet

installer Git

Cloner et récuperer le projet sur votre ordinateur (via un git clone https://github.com/KyzenLJ/Crud_fil_rouge.git)

installer java avec un jdk1.8.0_144 

installer préférentiellement un environnement de développement intégré (IDE) comme eclipse ou intelliJ

Importer le projet en tant que "projet maven existant"

Se deplacer à la racine du projet et y ouvrir une console de ligne de commande.
Soit en faisant un "git bash here", soit, taper "cmd" et valider, dans la barre de chemin de l'explorateur.

**Compilation**
```
mvn clean install
```

Une fois la compilation effectuée et build avec succès :

-retourner dans l'IDE

- Modifier les données dans ' application.properties' afin de faire correspondre l'identifiant et le mot de passe de connection à vôtre base de données.

-lancer le projet (run as spring boot application)

- Les différentes requêtes peuvent être effectuées grâce au logiciel "Postman" ou en installant le contenu du repository https://github.com/KyzenLJ/front_fil_rouge

Concernant les jointures, voici un exemple visant à récupérer les affaires liées à un véhicule :

	public List<Affaire> recupererAffairesDeVehicule(Long id) throws Exception {
		Affaire affaire;
		PreparedStatement pstmt = null;
		ResultSet rs;
		String sql;
		ArrayList<Affaire> listeAffaire = new ArrayList<Affaire>();

		try {
			// Requete SQL
			sql = " SELECT *\r\n" + 
			"  FROM affaire\r\n" + 
					"INNER JOIN affaire_vehicule\r\n" + 
                        "  ON affaire.id_affaire = affaire_vehicule.id_affaire\r\n" + 
					"INNER JOIN vehicule\r\n" + 
						"  ON affaire_vehicule.id_vehicule = vehicule.id\r\n" + 
						"  WHERE vehicule.id = ?;";
		
			pstmt = dataSource.getConnection().prepareStatement(sql);
			pstmt.setLong(1, id);
			// Log info
			logSQL(pstmt);
			// Lancement requete
			rs = pstmt.executeQuery();
			// resultat requete
			while (rs.next()) {
				affaire = recupererAffaireRS(rs);
				listeAffaire.add(affaire);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error("SQL Error !:" + pstmt.toString(), e);
			throw e;
		} finally {
			pstmt.close();
		}

		return listeAffaire;
	}


## Auteur

* **NESIC Alexandre** 
largement inspiré/pompé sur Nourry Jean-Luc.
Les documents tels que diagramme de classe, use case, modélisation et schémas de base de données et wireframe sont dans le dossier documents.



