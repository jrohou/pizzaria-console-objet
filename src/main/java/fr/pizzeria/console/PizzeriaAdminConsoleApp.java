package fr.pizzeria.console;


import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.PizzaDaoHibernate;

public class PizzeriaAdminConsoleApp {

	static Scanner sc = new Scanner(System.in);
	
	private static Logger log = LoggerFactory.getLogger(PizzeriaAdminConsoleApp.class);

	public static void main(String[] args) throws Exception {
		
		PizzaDaoHibernate dao = new PizzaDaoHibernate();

		ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(dao);
		AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu(dao);
		ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu(dao);
		SupprimerPizzaOptionMenu supprimer = new SupprimerPizzaOptionMenu(dao);
		
		
		/**
		 * Print somes menus
		 * Ask the menu's number to access the next step
		 *  - Print pizza's arraylist
		 *  - Add a new pizza
		 *  - Edit information's pizza
		 *  - Delete a pizza
		 *  - Exist the app
		 */
		
		log.info("***** Pizzeria Administration *****");
		log.info("1. Lister les pizzas");
		log.info("2. Ajouter une nouvelle pizza");
		log.info("3. Mettre à jour une pizza");
		log.info("4. Supprimer une pizza");
		log.info("99. Sortir");

		String rep = "";

		log.info("Saisir un des numéros pour accéder aux fonctionnalités");
		rep = sc.nextLine();
		switch (rep) {
		case "1":
		lister.execute(sc);
			break;
		case "2":
			ajouter.execute(sc);
			break;
		case "3":
			modifier.execute(sc);
			break;
		case "4":
			supprimer.execute(sc);
			break;
		default:


		}

	}

}
