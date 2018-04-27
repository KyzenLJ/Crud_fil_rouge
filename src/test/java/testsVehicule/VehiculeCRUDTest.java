package testsVehicule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.springboot.simplecrud.SimpleCrudApplication;
import co.simplon.springboot.simplecrud.model.Vehicule;
import co.simplon.springboot.simplecrud.repository.VehiculeRepository;
import co.simplon.springboot.simplecrud.service.impl.VehiculeServiceImpl;

//Invoque la classe de référence pour exécuter les tests
//ici SpringRunner pour SpringBoot
@RunWith(SpringRunner.class)
//Charge le contexte global de l'application
@SpringBootTest(classes = SimpleCrudApplication.class)
//Permet de contrôler les transactions avec la base de donnée
@Transactional
public class VehiculeCRUDTest {

	 //Instanciation des classes
    static Vehicule vehicule;
    
    static VehiculeServiceImpl vehiculeServ;
    
    @Autowired
    VehiculeRepository vehiculeRepo;
    
    //Déclarations des objets et variable utilisés pour les tests
    @BeforeClass
    public static void initVehicule() throws Exception{
    	vehiculeServ = new VehiculeServiceImpl();
    	vehicule = new Vehicule(); 
    }
    
    @Test
    public void testFindOneOk(){
    	vehicule = vehiculeRepo.findOne((long) 4);
   	 assertEquals("Seat",vehicule.getMarque());
   	 }
    
    @Test
    public void testFindOneKo(){
   	 assertNull(vehiculeRepo.findOne((long) 300));
    }
    
    
    @Test
    //L'annotation @Rollback(true) permet de ne pas instancier l'objet dans la base
    @Rollback(true)
    public void testSaveOk(){
    	vehicule.setMarque("citroen");
    	vehicule.setModele("C4 picasso");
    	vehicule.setCouleur("gris");
    	vehicule.setImmatriculation("AY-080-MP");
   	 assertTrue(vehiculeRepo.save(vehicule) != null);
    }
    
    @Test
    public void testSaveKo(){
    	vehicule.setMarque("citroen");
    	vehicule.setModele("C4 picasso");
    	vehicule.setCouleur("gris");
    	vehicule.setImmatriculation("AY-080-MP");  
   	 assertNotNull("Immatriculation ne peut pas être vide !",vehicule);
    }
}