package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	public SupprimerPizzaOptionMenu(PizzaDaoMemoire dao) {
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

	public void execute(Scanner sc) {
		
		int idpizza = -1;
		String confirm = "";
		
		while (!exists(idpizza)) {
			System.out.println("Saisir le numéro de la pizza à supprimer");
			idpizza = sc.nextInt();
			if (exists(idpizza)) {

				do {

					System.out.println("Etes vous sûr de suprimmer la pizza numéro : "+idpizza+" ? Répondez yes / y ou no / n");
					confirm = sc.nextLine();
					
					if(confirm =="yes".toUpperCase() || confirm=="y".toUpperCase()){
						dao.deletePizza(idpizza);
					}

				}while (!exists(idpizza));
			}
}
	}
}
	
