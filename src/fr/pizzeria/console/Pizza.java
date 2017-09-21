package fr.pizzeria.console;

public class Pizza {
	
	static int count = 0;
	int id;
	String code;
	String nom;
	double prix;
	


	public Pizza (String code, String nom, double prix) {
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		id = count++;
	}
	
	@Override
	public String toString() {
		return "Pizza [Identifiant=" + id + ", Code de la Pizza=" + code + ", Nom de la pizza=" + nom + ", Prix de la pizza=" + prix + "]";
	}

}
