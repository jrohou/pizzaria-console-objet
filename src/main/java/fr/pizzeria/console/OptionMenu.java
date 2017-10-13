package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoMemoire;

public abstract class OptionMenu {
	
	PizzaDaoMemoire dao;
	
	public  OptionMenu() {
		
		
	}
	public abstract void execute(Scanner sc);
}