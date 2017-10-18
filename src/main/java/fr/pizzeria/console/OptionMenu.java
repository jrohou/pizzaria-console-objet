package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public abstract class OptionMenu {
	
	IPizzaDao dao;
	
	public  OptionMenu() {
		
		
	}
	public abstract void execute(Scanner sc) throws Exception;
}