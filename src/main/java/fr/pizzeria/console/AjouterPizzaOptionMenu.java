package fr.pizzeria.console;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoMariadb;

public class AjouterPizzaOptionMenu extends OptionMenu {

	String newcode;
	String newnom;
	CategoriePizza newcategorie;
	double newprix;

	private static Logger log = LoggerFactory.getLogger(PizzeriaAdminConsoleApp.class);
	/**
	 * Contructor
	 */
	public AjouterPizzaOptionMenu(IPizzaDao dao) {
		this.dao = dao;
	}

	/**
	 * Creates a method "execute" for app.java Add a new pizza with somes
	 * questions Add the new pizza in the arraylist Print the arraylist
	 * 
	 * @param sc
	 * @throws Exception 
	 */
	public void execute(Scanner sc) throws Exception {

		log.info("Ajout d'une nouvelle pizza");

		do {

			log.info("Veuillez insérer le code la pizza");
			newcode = sc.nextLine();

			do {

				log.info("Veuillez insérer le nom de la pizza");

				newnom = sc.nextLine();

				do {

					log.info("Veuillez insérer la catégorie de pizza en fonction de son numéro : ");
					log.info("1 - Viande"+"\n"+" 2 - Poisson"+ "\n 3 - Sans Viande");
					String categStr = sc.nextLine();
					
					if(categStr.equals("1")){
						newcategorie = CategoriePizza.VIANDE;
					}
					else if(categStr.equals("2")) {
						newcategorie = CategoriePizza.POISSON;
					}
					else if (categStr.equals("3")) {
							newcategorie = CategoriePizza.SANS_VIANDE;
					}
					else{
							newcategorie = CategoriePizza.UNKNOW_NAME;
					}
					do {

						log.info("Veuillez insérer le prix de la pizza");

						String newprixStr = sc.nextLine();
						newprix = Double.parseDouble(newprixStr);

						Pizza nouveau = new Pizza(newcode, newnom, newcategorie, newprix);

						dao.savePizza(nouveau);

					} while (newprix < 0);

				} while (newcategorie == null);

			} while (newnom == "");

		} while (newcode == null);
	}

}
