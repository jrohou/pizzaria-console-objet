package fr.pizzeria.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.console.CategoriePizza;
import fr.pizzeria.console.Pizza;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class IPizzaDaoMariadb implements IPizzaDao {
	
	private static Logger log = LoggerFactory.getLogger(IPizzaDaoMariadb.class);
	
	public Connection connection() throws Exception {
		
		
		Properties prop = new Properties();
		InputStream input = null;
		
		input = new FileInputStream("src/main/resources/jdbc.properties");
		
		prop.load(input);
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		Connection myConnection = DriverManager.getConnection(prop.getProperty("jdbc.url"),prop.getProperty("jdbc.username"),prop.getProperty("jdbc.password"));
		
		return myConnection;
	}

	@Override
	public void savePizza(Pizza pizza) throws Exception {
		Connection conn = connection() ;
		PreparedStatement pizzainserer = conn.prepareStatement("INSERT INTO pizza(code,nom,categorie,prix) VALUES(?,?,?,?)");
		
		pizzainserer.setString(1,pizza.getCode());
		pizzainserer.setString(2, pizza.getNom());
		pizzainserer.setString(3, pizza.getCategorie().toString().toUpperCase());
		pizzainserer.setDouble(4, pizza.getPrix());
		
		pizzainserer.executeUpdate();
		
		log.info("La pizza "+pizza.getNom()+" a bien été enregistrée");
		
		conn.close();
		
	}

	@Override
	public void updatePizza(int idpizza, String editcode, String editnom, CategoriePizza editcategorie, double editprix) throws Exception {
		Connection conn = connection() ;
		PreparedStatement pizzaedit = conn.prepareStatement("UPDATE pizza SET code = ?, nom = ?,categorie = ?, prix = ? WHERE id = ?");
		
		pizzaedit.setString(1,editcode);
		pizzaedit.setString(2, editnom);
		pizzaedit.setString(3, editcategorie.toString().toUpperCase());
		pizzaedit.setDouble(4, editprix);
		pizzaedit.setInt(5, idpizza);
		
		pizzaedit.executeUpdate();
		
		log.info("La pizza "+editnom+" a bien été modifiée");
		
		conn.close();
		
	}

	@Override
	public void deletePizza(int idpizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pizza> findAllPizzas() throws Exception {
		
		Connection conn = connection();
		
		PreparedStatement pizzashow = conn.prepareStatement("SELECT code, nom, categorie, prix FROM pizza");
		ResultSet executeQuery = pizzashow.executeQuery();
		List <Pizza> pizzas = new ArrayList<>();
		
		while(executeQuery.next()) {
			String code = executeQuery.getString("CODE");
			String nom = executeQuery.getString("NOM");
			String categorie = executeQuery.getString("CATEGORIE");
			Double prix = executeQuery.getDouble("PRIX");
			
			CategoriePizza categoriePizza = CategoriePizza.valueOf(categorie);
			
			Pizza p = new Pizza(code,nom,categoriePizza,prix);
			pizzas.add(p);
		}
		return pizzas;
	}

	@Override
	public Pizza findCategorie() {
		// TODO Auto-generated method stub
		return null;
	}
}
