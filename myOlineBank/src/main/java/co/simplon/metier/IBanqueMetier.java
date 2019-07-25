package co.simplon.metier;

import org.springframework.data.domain.Page;

import co.simplon.entities.Compte;
import co.simplon.entities.Operation;

public interface IBanqueMetier {
	public Compte consulterCompte(String codeCpte);
	public void Verser(String codeCompte,double montant);
	public void Retirer(String codeCompte,double montant);
	public void Virement(String codeCompte1,String codeCompte2,double montant);
	public Page<Operation>listOperation(String codeCpte,int page, int size);

}
