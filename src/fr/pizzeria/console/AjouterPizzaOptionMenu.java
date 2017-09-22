package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class AjouterPizzaOptionMenu extends OptionMenu {

	String newcode;
	String newnom;
	double newprix;

	/**
	 * Contructor
	 */
	public AjouterPizzaOptionMenu(PizzaDaoMemoire dao) {
		this.dao = dao;
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
					
					dao.savePizza(nouveau);

				} while (newprix < 0);

			} while (newnom == "");

		} while (newcode == null);
	}

}
