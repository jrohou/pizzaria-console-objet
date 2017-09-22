package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class ModifierPizzaOptionMenu extends OptionMenu {

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

		System.out.println("Mise à jour d'une pizza");

		int idpizza = -1;
		String editcode;
		String editnom;
		double editprix;

		while (!exists(idpizza)) {
			System.out.println("Saisir le numéro de la pizza à modifier");
			idpizza = sc.nextInt();
			if (exists(idpizza)) {

				do {

					System.out.println("Veuillez insérer le code la pizza");
					editcode = sc.nextLine();

					do {

						System.out.println("Veuillez insérer le nom de la pizza");

						editnom = sc.nextLine();

						do {

							System.out.println("Veuillez insérer le prix de la pizza");

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
