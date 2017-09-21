package fr.pizzeria.console;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		
		Pizza pizzanb1 = new Pizza ("PEP","Pépéroni",12.50);
		Pizza pizzanb2 = new Pizza("MAR","Margherita",14.00);
		Pizza pizzanb3 = new Pizza("REIN","La Reine",11.50);
		Pizza pizzanb4 = new Pizza("FRO","La 4 fromages",12.00);
		Pizza pizzanb5 = new Pizza("CAN","La cannibale",12.50);
		Pizza pizzanb6 = new Pizza("SAV","La savoyarde",13.00);
		Pizza pizzanb7 = new Pizza("ORI","L'orientale",13.50);
		Pizza pizzanb8 = new Pizza("IND","L'indienne",14.00);
		
		

	}

}
