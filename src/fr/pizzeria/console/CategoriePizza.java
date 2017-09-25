package fr.pizzeria.console;

public enum CategoriePizza {
	
	VIANDE("Viande"),POISSON("Poisson"),SANS_VIANDE("Sans Viande"), UNKNOW_NAME("Sans Catégorie");
	
	private String libelle;
	
	private CategoriePizza(String libelle){
		this.libelle = libelle;
	}
	
	public String getLibelle(){
		return libelle;
	}
	

}
