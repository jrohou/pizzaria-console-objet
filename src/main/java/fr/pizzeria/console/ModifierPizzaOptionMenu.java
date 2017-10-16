package fr.pizzeria.console;


import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDaoMariadb;

public class ModifierPizzaOptionMenu extends OptionMenu {

	private static Logger log = LoggerFactory.getLogger(ModifierPizzaOptionMenu.class);
	/**
	 * Contructor
	 */
	public ModifierPizzaOptionMenu(IPizzaDaoMariadb dao) {
			this.dao = dao;
	}

	private boolean exists(int idpizza) throws Exception {
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
	 * @throws Exception 
	 */

	public void execute(Scanner sc) throws Exception {

		log.info("Mise à jour d'une pizza");

		int idpizza = -1;
		String editcode;
		String editnom;
		String categStr;
		CategoriePizza editcategorie;
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
							log.info("Veuillez insérer la catégorie de pizza en fonction de son numéro : ");
							log.info("1 - Viande"+"\n"+" 2 - Poisson"+ "\n 3 - Sans Viande");
							 categStr = sc.nextLine();
							
							if(categStr.equals("1")){
								editcategorie = CategoriePizza.VIANDE;
							}
							else if(categStr.equals("2")) {
								editcategorie = CategoriePizza.POISSON;
							}
							else if (categStr.equals("3")) {
									editcategorie = CategoriePizza.SANS_VIANDE;
							}
							else{
									editcategorie = CategoriePizza.UNKNOW_NAME;
							}
							
							do {

								log.info("Veuillez insérer le prix de la pizza");
	
								String editprixStr = sc.nextLine();
								editprix = Double.parseDouble(editprixStr);
								
								dao.updatePizza(idpizza, editcode, editnom, editcategorie, editprix);
							
							}while (editprix < 0);

						}while (categStr.equals(""));

					} while (editnom.equals(""));

				} while (!exists(idpizza) || editcode == null);
			}

		}

	}

}
