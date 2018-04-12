package co.simplon.springboot.simplecrud.service;

import java.util.List;

import co.simplon.springboot.simplecrud.model.Vehicule;

public interface VehiculeService {

	List<Vehicule> getAllVehicules();
	void deleteVehicule(long id);
	Vehicule getVehicule(long id);
	Vehicule addVehicule(Vehicule vehicule);
	Vehicule updateVehicule(Vehicule vehicule);
}
