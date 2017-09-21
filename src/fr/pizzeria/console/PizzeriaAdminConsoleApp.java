package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
	
	static Scanner sc = new Scanner(System.in);

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
	

		String rep = "";
		do {
			System.out.println("Saisir un des numéros pour accéder aux fonctionnalités");
			rep = sc.nextLine();
			if (rep.equals("1")) {
				
				System.out.println("Liste des pizzas");
				
				for(Pizza pizza: pizzas){
					System.out.println(pizza);
				}
			}
			else if (rep.equals("2")) {
				
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
										
											String newprixStr = sc.nextLine();
											newprix = Double.parseDouble(newprixStr);
											
											
											Pizza nouveau = new Pizza(newcode,newnom,newprix);
											pizzas.add(nouveau);
											for(Pizza pizza: pizzas){
												System.out.println(pizza);
											}
											
										}while(newprix<0);
								
								}while(newnom=="");
						
					}while(newcode==null);									

			}
			else if (rep.equals("3")) {
				
				System.out.println("Mise à jour d'une pizza");
				
				String editcode;
				String editnom;
				double editprix;
				
				do {
					
					System.out.println("Veuillez insérer le code la pizza");
						editcode = sc.nextLine();
						
						do {
						
								System.out.println("Veuillez insérer le nom de la pizza");
							
								editnom = sc.nextLine();
								
								do {
								
										System.out.println("Veuillez insérer le prix de la pizza");
									
										String editprixStr = sc.nextLine();
										editprix = Double.parseDouble(editprixStr);
										
										
										Pizza.set(editcode,editnom,editprix);
										for(Pizza pizza: pizzas){
											System.out.println(pizza);
										}
										
									}while(editprix<0);
							
							}while(editnom=="");
					
				}while(editcode==null);	
				
				
			}
			else if (rep.equals("4")) {
				
				System.out.println("Suppression d'une pizza");
			}
			else if (rep.equals("99")) {
				System.out.println("Au revoir ");
			}
			
		} while (!rep.equals("99"));
		
		
		
		

	}

}
