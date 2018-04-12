package co.simplon.springboot.simplecrud.service;

import java.util.List;

import co.simplon.springboot.simplecrud.model.Vehicule;

public interface VehiculeService {

	List<Vehicule> getAllVehicules() throws Exception;
	void deleteVehicule(long id) throws Exception;
	Vehicule getVehicule(long id) throws Exception;
	Vehicule addVehicule(Vehicule vehicule) throws Exception;
	Vehicule updateVehicule(Vehicule vehicule) throws Exception;
}
