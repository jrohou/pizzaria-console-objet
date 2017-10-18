package fr.pizzeria.console;


import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDao;

public class ListerPizzasOptionMenu extends OptionMenu {

	private static Logger log = LoggerFactory.getLogger(ListerPizzasOptionMenu.class);
	/**
	 * Contructor
	 * 
	 * @param sc
	 */

	public ListerPizzasOptionMenu(IPizzaDao dao) {
			this.dao = dao;
	}

	/**
	 * Creates a method "execute" for app.java
	 * Add pizzas in the arraylist
	 * Print the arraylist
	 * 
	 * @param sc
	 * @throws Exception 
	 */

	public void execute(Scanner sc) throws Exception {

		log.info("Liste des pizzas");

		for (Pizza pizza : dao.findAllPizzas()) {
			log.info(pizza.toString());
		}
	}
}
