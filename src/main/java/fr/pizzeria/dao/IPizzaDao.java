package fr.pizzeria.dao;

import java.sql.SQLException;
import java.util.List;

import fr.pizzeria.console.CategoriePizza;
import fr.pizzeria.console.Pizza;

public interface IPizzaDao {

	void savePizza(Pizza pizza) throws SQLException, Exception;
	void updatePizza(int idpizza, String editcode, String editnom, CategoriePizza editcategorie, double editprix) throws SQLException, Exception;
	void deletePizza(int idpizza);
	
	List<Pizza> findAllPizzas() throws Exception;
	Pizza findCategorie();
}
