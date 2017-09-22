package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		
		Pizza pizzanb1 = new Pizza("PEP", "Pépéroni", 12.50);
		Pizza pizzanb2 = new Pizza("MAR", "Margherita", 14.00);
		Pizza pizzanb3 = new Pizza("REIN", "La Reine", 11.50);
		Pizza pizzanb4 = new Pizza("FRO", "La 4 fromages", 12.00);
		Pizza pizzanb5 = new Pizza("CAN", "La cannibale", 12.50);
		Pizza pizzanb6 = new Pizza("SAV", "La savoyarde", 13.00);
		Pizza pizzanb7 = new Pizza("ORI", "L'orientale", 13.50);
		Pizza pizzanb8 = new Pizza("IND", "L'indienne", 14.00);

		pizzas.add(pizzanb1);
		pizzas.add(pizzanb2);
		pizzas.add(pizzanb3);
		pizzas.add(pizzanb4);
		pizzas.add(pizzanb5);
		pizzas.add(pizzanb6);
		pizzas.add(pizzanb7);
		pizzas.add(pizzanb8);

		ListerPizzasOptionMenu lister = new ListerPizzasOptionMenu(pizzas);
		AjouterPizzaOptionMenu ajouter = new AjouterPizzaOptionMenu();
		ModifierPizzaOptionMenu modifier = new ModifierPizzaOptionMenu();
		
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
			// supprimer.execute(sc);
		default:
			System.out.println("Saisir un des numéros pour accéder aux fonctionnalités");
			rep = sc.nextLine();

		}

	}

}
