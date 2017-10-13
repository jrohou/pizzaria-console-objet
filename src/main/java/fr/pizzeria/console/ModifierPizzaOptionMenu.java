package fr.pizzeria.console;


import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fr.pizzeria.dao.PizzaDaoMemoire;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private static Logger log = LoggerFactory.getLogger(ModifierPizzaOptionMenu.class);
	/**
	 * Contructor
	 */
	public ModifierPizzaOptionMenu(PizzaDaoMemoire dao) {
			this.dao = dao;
	}

	private boolean exists(int idpizza) {
		for (Pizza pizza : dao.findAllPizzas()) {
			if (pizza.id == idpizza) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Ask the pizza's number
	 * Edit info of the pizza
	 * Update values
	 * Print the arraylist
	 * 
	 * @param sc
	 */

	public void execute(Scanner sc) {

		log.info("Mise à jour d'une pizza");

		int idpizza = -1;
		String editcode;
		String editnom;
		double editprix;

		while (!exists(idpizza)) {
			log.info("Saisir le numéro de la pizza à modifier");
			idpizza = sc.nextInt();
			if (exists(idpizza)) {

				do {

					log.info("Veuillez insérer le code la pizza");
					editcode = sc.nextLine();

					do {

						log.info("Veuillez insérer le nom de la pizza");

						editnom = sc.nextLine();

						do {

							log.info("Veuillez insérer le prix de la pizza");

							String editprixStr = sc.nextLine();
							editprix = Double.parseDouble(editprixStr);
							
							dao.updatePizza(idpizza, editcode, editnom, editprix);

						} while (editprix < 0);

					} while (editnom == "");

				} while (!exists(idpizza) || editcode == null);
			}

		}

	}

}
