package co.simplon.springboot.simplecrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.springboot.simplecrud.model.Vehicule;

/**
 * 
 * @author NESIC Alexandre
 * interface qui hérite de JpaRepository permettant d'appeler les méthodes de gestion simplifiée des requêtes SQL pour la classe VehiculeServiceImpl
 *
 */

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

	
}
