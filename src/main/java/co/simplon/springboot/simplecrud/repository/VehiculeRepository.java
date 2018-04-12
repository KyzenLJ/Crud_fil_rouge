package co.simplon.springboot.simplecrud.repository;

import java.util.List;

import co.simplon.springboot.simplecrud.model.Vehicule;


public interface VehiculeRepository {

	
	List<Vehicule> getAllVehicules() throws Exception;
	Vehicule getVehicule(Long id) throws Exception;
	void deleteVehicule(Long id) throws Exception;
	Vehicule insertVehicule(Vehicule vehicule) throws Exception;
	Vehicule updateVehicule(Vehicule vehicule) throws Exception;
	
}
