package co.simplon.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.simplon.entities.Compte;
import co.simplon.entities.Operation;
import co.simplon.metier.IBanqueMetier;

@Controller
public class BanqueController {
	@Autowired
	private IBanqueMetier banqueMetier;

	@RequestMapping("/operation")
	public String index() {
		return "compte";
	}

	@RequestMapping("/consulterCompte")
	public String consulter(Model model, String codeCompte) {
		try {
			System.out.println("avant");
			Compte cp = banqueMetier.consulterCompte(codeCompte);
			Page<Operation>pageOperation=banqueMetier.listOperation(codeCompte, 0, 4);
			System.out.println("après");
			
			model.addAttribute("compte",cp);
		} catch(Exception e) {
			model.addAttribute("exeption", e);
		}		
		return "compte";
	}

}
