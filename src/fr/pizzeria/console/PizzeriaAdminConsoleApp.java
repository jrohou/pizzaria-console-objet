package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class PizzeriaAdminConsoleApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaDaoMemoire dao = new PizzaDaoMemoire();

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
		
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		String rep = "";

		System.out.println("Saisir un des numéros pour accéder aux fonctionnalités");
		rep = sc.nextLine();
		switch (rep) {
		case "1":
			lister.execute(sc);
			break;
		case "2":
			ajouter.execute(sc);
		case "3":
			modifier.execute(sc);
		case "4":
			supprimer.execute(sc);
		default:
			System.out.println("Saisir un des numéros pour accéder aux fonctionnalités");
			rep = sc.nextLine();

		}

	}

}
