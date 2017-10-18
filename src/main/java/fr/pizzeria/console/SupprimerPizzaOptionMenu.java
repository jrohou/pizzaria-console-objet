package fr.pizzeria.console;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDao;

public class SupprimerPizzaOptionMenu extends OptionMenu {
	private static Logger log = LoggerFactory.getLogger(SupprimerPizzaOptionMenu.class);

	public SupprimerPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
}
	
	private boolean exists(int idpizza){
		for (Pizza pizza : dao.findAllPizzas()) {
			if (pizza.id == idpizza) {
				return true;
			}
		}
		return false;
	}

	public void execute(Scanner sc) throws Exception {
		
		int idpizza = -1;
		
		while (!exists(idpizza)) {
			log.info("Saisir le numéro de la pizza à supprimer");
			idpizza = sc.nextInt();
				do {

						dao.deletePizza(idpizza);

				}while (!exists(idpizza));
}
	}
}
	
