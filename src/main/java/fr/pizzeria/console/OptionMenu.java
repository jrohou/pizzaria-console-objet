package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDaoMariadb;

public abstract class OptionMenu {
	
	IPizzaDaoMariadb dao;
	
	public  OptionMenu() {
		
		
	}
	public abstract void execute(Scanner sc) throws Exception;
}