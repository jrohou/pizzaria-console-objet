package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

public class AjouterPizzaOptionMenu extends OptionMenu {

	String newcode;
	String newnom;
	double newprix;
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

	/**
	 * Constructor
	 * 
	 */

	public AjouterPizzaOptionMenu() {

	}

	/**
	 * Creates a method "execute" for app.java
	 * Add a new pizza with somes questions
	 * Add the new pizza in the arraylist
	 * Print the arraylist
	 * 
	 * @param sc
	 */
	public void execute(Scanner sc) {

		System.out.println("Ajout d'une nouvelle pizza");

		do {

			System.out.println("Veuillez insérer le code la pizza");
			newcode = sc.nextLine();

			do {

				System.out.println("Veuillez insérer le nom de la pizza");

				newnom = sc.nextLine();

				do {

					System.out.println("Veuillez insérer le prix de la pizza");

					String newprixStr = sc.nextLine();
					newprix = Double.parseDouble(newprixStr);

					Pizza nouveau = new Pizza(newcode, newnom, newprix);
					pizzas.add(nouveau);
					for (Pizza pizza : pizzas) {
						System.out.println(pizza);
					}

				} while (newprix < 0);

			} while (newnom == "");

		} while (newcode == null);
	}

}
