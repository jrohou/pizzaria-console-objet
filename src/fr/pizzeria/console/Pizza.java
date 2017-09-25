package fr.pizzeria.console;
import fr.pizzeria.console.CategoriePizza.*;

/**
 * Pizza's class is the main class for app.java You can find its attributes with
 * its get/set
 * 
 * @author ETY2
 *
 */
public class Pizza {

	int id;
	String code;
	String nom;
	CategoriePizza categorie;
	double prix;

	static int count = 0;

	public Pizza(String code, String nom, CategoriePizza categorie, double prix) {
		this.code = code;
		this.nom = nom;
		this.categorie = categorie;
		this.prix = prix;
		id = count++;
	}

	/**
	 * method returns values for the arrayslist
	 * 
	 */
	@Override
	public String toString() {
		return "Pizza [Identifiant=" + id + ", Code de la Pizza=" + code + ", Nom de la pizza=" + nom
				+ ", Catégorie de la pizza=" + categorie.getLibelle() + ", Prix de la pizza=" + prix + "]";
	}

	/**
	 * all get and set of Pizza's attributes
	 * 
	 * 
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public CategoriePizza getCategorie(CategoriePizza categorie) {
		return this.categorie;
	}
	
	public void setCategorie(CategoriePizza categorie) {
		this.categorie = categorie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
