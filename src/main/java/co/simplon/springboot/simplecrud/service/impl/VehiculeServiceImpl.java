package co.simplon.springboot.simplecrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.springboot.simplecrud.model.Vehicule;
import co.simplon.springboot.simplecrud.repository.VehiculeRepository;
import co.simplon.springboot.simplecrud.service.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService{

	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	// sql : "SELECT * FROM vehicule"
	public List<Vehicule> getAllVehicules(){
		return this.vehiculeRepository.findAll();
	}
	
	// sql: "DELETE FROM vehicule WHERE id = " + vehicule.getId();
	public void deleteVehicule(Vehicule vehicule) {
		this.vehiculeRepository.delete(vehicule);
	}
	
	// sql: "SELECT FROM vehicule WHERE id = " + vehicule.getId();
	public Vehicule getVehicule(int id) {
		return this.vehiculeRepository.findOne(id);
	}

	// sql: "ALTER TABLE 
	public Vehicule addVehicule(Vehicule vehicule) {
		return this.vehiculeRepository.save(vehicule);
	}
	
	public Vehicule saveVehicule(Vehicule vehicule) {
		return this.vehiculeRepository.save(vehicule);
	}
}
