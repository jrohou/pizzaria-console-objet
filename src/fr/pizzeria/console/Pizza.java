package fr.pizzeria.console;

public class Pizza {
	
	int id;
	String code;
	String nom;
	double prix;

	static int count = 0;
	
	
	public Pizza(String code, String nom, double prix) {
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		id = count++;
	}

	@Override
	public String toString() {
		return "Pizza [Identifiant=" + id + ", Code de la Pizza=" + code + ", Nom de la pizza=" + nom
				+ ", Prix de la pizza=" + prix + "]";
	}

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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

}
