package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.console.CategoriePizza;
import fr.pizzeria.console.Pizza;

/**
 * @author ETY2
 *
 */
public interface IPizzaDao {

	/** Method
	 * @param pizza
	 */
	void savePizza(Pizza pizza);
	/** Method
	 * @param idpizza
	 * @param editcode
	 * @param editnom
	 * @param editcategorie
	 * @param editprix
	 */
	void updatePizza(int idpizza, String editcode, String editnom, CategoriePizza editcategorie, double editprix);
	/** Method
	 * @param idpizza
	 */
	void deletePizza(int idpizza);
	
	/** Method
	 * @return
	 */
	List<Pizza> findAllPizzas();
}
