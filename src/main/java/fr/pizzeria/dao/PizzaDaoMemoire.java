package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.console.CategoriePizza;
import fr.pizzeria.console.Pizza;

public class PizzaDaoMemoire implements IPizzaDao {
	
	ArrayList<Pizza> pizzas;
	
	public PizzaDaoMemoire() {

		ArrayList<Pizza> pizzas = new ArrayList<>();
		
		Pizza pizzanb1 = new Pizza("PEP", "Pépéroni",CategoriePizza.VIANDE, 12.50);
		Pizza pizzanb2 = new Pizza("MAR", "Margherita",CategoriePizza.VIANDE, 14.00);
		Pizza pizzanb3 = new Pizza("REIN", "La Reine",CategoriePizza.VIANDE, 11.50);
		Pizza pizzanb4 = new Pizza("FRO", "La 4 fromages",CategoriePizza.SANS_VIANDE, 12.00);
		Pizza pizzanb5 = new Pizza("CAN", "La cannibale",CategoriePizza.VIANDE, 12.50);
		Pizza pizzanb6 = new Pizza("SAV", "La savoyarde",CategoriePizza.VIANDE, 13.00);
		Pizza pizzanb7 = new Pizza("ORI", "L'orientale",CategoriePizza.VIANDE ,13.50);
		Pizza pizzanb8 = new Pizza("IND", "L'indienne",CategoriePizza.POISSON, 14.00);

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
	public void deletePizza(int idpizza) {
		for (Pizza p : findAllPizzas()) {
			if (p.getId() == idpizza){
			}
		}
		
	}


	@Override
	public void updatePizza(int idpizza, String editcode, String editnom, CategoriePizza editcategorie, double editprix) {
		
	}

}
