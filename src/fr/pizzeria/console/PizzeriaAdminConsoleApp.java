package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
		
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		pizzas.add(pizzanb1);
		pizzas.add(pizzanb2);
		pizzas.add(pizzanb3);
		pizzas.add(pizzanb4);
		pizzas.add(pizzanb5);
		pizzas.add(pizzanb6);
		pizzas.add(pizzanb7);
		pizzas.add(pizzanb8);
		
		
		
		Scanner sc = new Scanner(System.in);
		

		int rep = 0;
		do {
			System.out.println("Saisir un des numéros pour accéder aux fonctionnalités");
			rep = sc.nextInt();
			if (rep == 1) {
				
				System.out.println("Liste des pizzas");
				
				for(Pizza pizza: pizzas){
					System.out.println(pizza);
				}
			}
			else if (rep == 2) {
				
				System.out.println("Ajout d'une nouvelle pizza");
				String newcode;
				String newnom;
				double newprix;
				
				do {
				
						System.out.println("Veuillez insérer le code la pizza");
				
							newcode = sc.nextLine();
							
							do {
							
								System.out.println("Veuillez insérer le nom de la pizza");
								
									newnom = sc.nextLine();
									
									do {
									
										System.out.println("Veuillez insérer le prix de la pizza");
										
											newprix = sc.nextDouble();
											
											
											Pizza nouveau = new Pizza(newcode,newnom,newprix);
											pizzas.add(nouveau);
											
										}while(newprix<0);
								
								}while(newnom=="");
						
					}while(newcode=="");									

			}
			else if (rep == 3) {
				
				System.out.println("Mise à jour d'une pizza");
			}
			else if (rep == 4) {
				
				System.out.println("Suppression d'une pizza");
			}
			else if (rep == 99) {
				System.out.println("Au revoir ");
			}
			
		} while (rep != 1 && rep!=2 && rep!=3 && rep!=4 && rep!=99 );
		
		
		
		

	}

}
