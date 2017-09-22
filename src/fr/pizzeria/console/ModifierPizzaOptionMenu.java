package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifierPizzaOptionMenu extends OptionMenu {

	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	private boolean exists(int idpizza) {
		for (Pizza pizza : pizzas) {
			if (pizza.id == idpizza) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Contructor
	 * 
	 * @param sc
	 */

	public ModifierPizzaOptionMenu() {

	}

	/**
	 * Creates a method "execute" for app.java
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

							for (Pizza pizza : pizzas) {
								if (pizza.getId() == idpizza) {
									pizza.setCode(editcode);
									pizza.setNom(editnom);
									pizza.setPrix(editprix);
								}
							}

						} while (editprix < 0);

					} while (editnom == "");

				} while (!exists(idpizza) || editcode == null);
			}

		}

	}

}
