package fr.pizzeria.console;


import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public class AjouterPizzaOptionMenu extends OptionMenu {

	String newcode;
	String newnom;
	CategoriePizza newcategorie;
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
					
					System.out.println("Veuillez insérer la catégorie de pizza");
					String categStr= sc.nextLine().toUpperCase();
					
					boolean trouver = false;
					for( CategoriePizza catg : CategoriePizza.values()){
						
						if(categStr.equals(catg.getLibelle())){
							
							trouver = true;
						}
					}
					if(!trouver){
						newcategorie = CategoriePizza.UNKNOW_NAME;  
					}
					else {
						newcategorie = CategoriePizza.valueOf(categStr);
					}
					

					do {
	
						System.out.println("Veuillez insérer le prix de la pizza");
	
						String newprixStr = sc.nextLine();
						newprix = Double.parseDouble(newprixStr);
	
						Pizza nouveau = new Pizza(newcode, newnom, newcategorie, newprix);
						
						dao.savePizza(nouveau);

					} while (newprix < 0);
				
				} while(newcategorie == null);

			} while (newnom == "");

		} while (newcode == null);
	}

}
