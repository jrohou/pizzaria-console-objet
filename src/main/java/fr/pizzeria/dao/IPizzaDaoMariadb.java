package fr.pizzeria.dao;

import java.sql.*;
import java.util.List;
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
	public void updatePizza(int idpizza, String editcode, String editnom, double editprix) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePizza(int idpizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pizza findCategorie() {
		// TODO Auto-generated method stub
		return null;
	}
}
