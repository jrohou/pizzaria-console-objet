package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

public class ListerPizzasOptionMenu extends OptionMenu {

	ArrayList<Pizza> pizzas;

	/**
	 * Contructor
	 * 
	 * @param sc
	 */

	public ListerPizzasOptionMenu(ArrayList<Pizza> pizzas) {
			this.pizzas = pizzas;
		// TODO Auto-generated constructor stub

	}

	/**
	 * Creates a method "execute" for app.java
	 * Add pizzas in the arraylist
	 * Print the arraylist
	 * 
	 * @param sc
	 */

	public void execute(Scanner sc) {



		System.out.println("Liste des pizzas");

		for (Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
	}
}
