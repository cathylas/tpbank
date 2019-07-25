package co.simplon;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import co.simplon.dao.ClientRepository;
import co.simplon.dao.CompteRepository;
import co.simplon.dao.OperationRepository;
import co.simplon.entities.Client;
import co.simplon.entities.Compte;
import co.simplon.entities.CompteCourant;
import co.simplon.entities.CompteEpargne;
import co.simplon.entities.Retrait;
import co.simplon.entities.Versement;
import co.simplon.metier.IBanqueMetier;



@SpringBootApplication
public class MyOlineBankApplication<operationRepository> implements CommandLineRunner{
	
	/*
	 * @Autowired private ClientRepository clientRepository;
	 * 
	 * @Autowired private CompteRepository compteRepository;
	 * 
	 * @Autowired private OperationRepository operationRepository;
	 * 
	 * @Autowired private IBanqueMetier banqueMetier;
	 */
	 
	public static void main(String[]args) {
		SpringApplication.run (MyOlineBankApplication.class, args);
				
	}
    
	@Override
	public void run(String...arg0)throws Exception {
		
		
		/*
		 * Client c1= clientRepository.save(new Client("Pica","Pica@gmail.com")); Client
		 * c2= clientRepository.save(new Client("Barthelemy","Barthelemy@gmail.com"));
		 * Client c3= clientRepository.save(new Client("David","David@gmail.com"));
		 * Client c4= clientRepository.save(new Client("Dacosta","Dacosta@gmail.com"));
		 * 
		 * Compte cp1= compteRepository.save(new CompteCourant("c1" ,new
		 * Date(),80000,c1,4000.0)); Compte cp2= compteRepository.save(new
		 * CompteEpargne("c2" ,new Date(),5500,c2,4.5)); Compte cp3=
		 * compteRepository.save(new CompteCourant("c3" ,new Date(),90000,c3,6000));
		 * Compte cp4= compteRepository.save(new CompteEpargne("c4" ,new
		 * Date(),2000,c4,3.5));
		 * 
		 * operationRepository.save(new Versement(new Date(),5000, cp1));
		 * operationRepository.save(new Versement(new Date(),2500, cp2));
		 * operationRepository.save(new Versement(new Date(),7000,cp3));
		 * operationRepository.save(new Versement(new Date(),5000,cp4));
		 * 
		 * operationRepository.save(new Retrait(new Date(),10000,cp1));
		 * operationRepository.save(new Retrait(new Date(),500,cp2));
		 * operationRepository.save(new Retrait(new Date(),5000,cp3));
		 * operationRepository.save(new Retrait(new Date(),5000,cp1));
		 */
		 
		
		//banqueMetier.Verser("c2",123123);
	}
}
