package co.simplon.springboot.simplecrud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.springboot.simplecrud.model.Vehicule;
import co.simplon.springboot.simplecrud.repository.VehiculeRepository;
import co.simplon.springboot.simplecrud.service.VehiculeService;

@Service
public class VehiculeServiceImpl implements VehiculeService {

	@Autowired
	private VehiculeRepository vehiculeRepository;
	
	// sql : "SELECT * FROM vehicule"
	public List<Vehicule> getAllVehicules() {
		return this.vehiculeRepository.findAll();
	}
	
	// sql: "DELETE FROM vehicule WHERE id = " + vehicule.getId();
	public void deleteVehicule(long id) {
		this.vehiculeRepository.delete(id);
	}
	
	// sql: "SELECT FROM vehicule WHERE id = " + vehicule.getId();
	public Vehicule getVehicule(long id) {
		return this.vehiculeRepository.findOne(id);
	}

	@Override
	public Vehicule addVehicule(Vehicule vehicule) {
		return this.vehiculeRepository.save(vehicule);
	}

	@Override
	public Vehicule updateVehicule(Vehicule vehicule) {
		return this.vehiculeRepository.save(vehicule);
	}


}
