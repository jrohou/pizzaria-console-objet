package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.console.Pizza;

public interface IPizzaDao {

	void savePizza(Pizza pizza);
	void updatePizza(int idpizza, String editcode, String editnom, double editprix);
	void deletePizza(int idpizza);
	
	List<Pizza> findAllPizzas();
	Pizza findCategorie();
}
