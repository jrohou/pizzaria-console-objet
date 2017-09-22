package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class ListerPizzasOptionMenu extends OptionMenu {

	/**
	 * Contructor
	 * 
	 * @param sc
	 */

	public ListerPizzasOptionMenu(PizzaDaoMemoire dao) {
			this.dao = dao;
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

		for (Pizza pizza : dao.findAllPizzas()) {
			System.out.println(pizza);
		}
	}
}
