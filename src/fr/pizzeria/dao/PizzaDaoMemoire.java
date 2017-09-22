package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.console.Pizza;

public class PizzaDaoMemoire implements IPizzaDao {
	
	ArrayList<Pizza> pizzas;
	
	public PizzaDaoMemoire() {

		pizzas = new ArrayList<Pizza>();
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
	}

	@Override
	public void savePizza(Pizza pizza) {
		pizzas.add(pizza);
	}

	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public void updatePizza(int idpizza, String editcode, String editnom, double editprix) {
		for (Pizza p : findAllPizzas()) {
			if (p.getId() == idpizza) {
				p.setCode(editcode);
				p.setNom(editnom);
				p.setPrix(editprix);
			}
		}
		
	}

	@Override
	public void deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

}
