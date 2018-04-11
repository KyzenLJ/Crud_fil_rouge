package co.simplon.springboot.simplecrud.service;

import java.util.List;

import co.simplon.springboot.simplecrud.model.Vehicule;

public interface VehiculeService {

	List<Vehicule> getAllVehicules();
	void deleteVehicule(Vehicule vehicule);
	Vehicule getVehicule(int id);
	Vehicule addVehicule(Vehicule vehicule);
	Vehicule saveVehicule(Vehicule vehicule); 
}
