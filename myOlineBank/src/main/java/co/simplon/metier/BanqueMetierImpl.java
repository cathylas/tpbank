package co.simplon.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.dao.CompteRepository;
import co.simplon.dao.OperationRepository;
import co.simplon.entities.Compte;
import co.simplon.entities.CompteCourant;
import co.simplon.entities.Operation;
import co.simplon.entities.Retrait;
import co.simplon.entities.Versement;

@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier{
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationRepository operationRepository;

	@Override
	public Compte consulterCompte(String codeCompte) {
		Compte cp= compteRepository.findOne(codeCompte);
		if(cp==null)throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@Override
	public void Verser(String codeCompte, double montant) {
		Compte cp=consulterCompte(codeCompte);
		Versement v=new Versement(new Date(),montant,cp);
		operationRepository.save(v);
		cp.setSolde(cp.getSolde()+montant);
		compteRepository.save(cp);
		
	}

	@Override
	public void Retirer(String codeCompte, double montant) {
		Compte cp=consulterCompte(codeCompte);
		double facilitesCaisse=0;
		if(cp instanceof CompteCourant)
		   facilitesCaisse=((CompteCourant) cp).getDecouvert();
		if(cp.getSolde()+facilitesCaisse<montant)
		throw new RuntimeException("solde insuffisant");
		Retrait r= new Retrait(new Date(),montant,cp);
		operationRepository.save(r);
		cp.setSolde(cp.getSolde()-montant);
		compteRepository.save(cp);
		
	}

	@Override
	public void Virement(String codeCompte1, String codeCompte2, double montant) {
		Retirer(codeCompte1, montant);
		Verser(codeCompte2, montant);
		
	}

	@Override
	public Page<Operation> listOperation(String codeCompte, int page, int size) {
		
		return operationRepository.listOperation(codeCompte,PageRequest.of(page, size));
	}

}
