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
	public List<Vehicule> getAllVehicules() throws Exception{
		return this.vehiculeRepository.getAllVehicules();
	}
	
	// sql: "DELETE FROM vehicule WHERE id = " + vehicule.getId();
	public void deleteVehicule(long id) throws Exception{
		this.vehiculeRepository.deleteVehicule(id);
	}
	
	// sql: "SELECT FROM vehicule WHERE id = " + vehicule.getId();
	public Vehicule getVehicule(long id) throws Exception{
		return this.vehiculeRepository.getVehicule(id);
	}

	// sql: "ALTER TABLE 
	@Override
	public Vehicule addVehicule(Vehicule vehicule) throws Exception{
		return this.vehiculeRepository.insertVehicule(vehicule);
	}

	@Override
	public Vehicule updateVehicule(Vehicule vehicule) throws Exception {
		return this.vehiculeRepository.updateVehicule(vehicule);
	}

}
