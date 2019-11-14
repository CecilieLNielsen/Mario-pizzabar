package datasource;

import java.io.IOException;
import model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBMapper implements Datasource {

    Connection con = null;

    public ArrayList<Pizza> getPizzas() throws SQLException {
        Statement stmt;
        ArrayList<Pizza> pizzaer = new ArrayList();
        Pizza pizza;

        con = DatabaseConnector.getConnection();
        stmt = con.createStatement();

        try {

            con = DatabaseConnector.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pizzaer");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                pizza = new Pizza(id, name, description, price);
                pizzaer.add(pizza);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pizzaer;
    }

    public void indsætPizza(Pizza pizza) {
        try {
            String SQL = "INSERT INTO pizzabestillinger (name, description, price) VALUES (?, ?, ?)";
            con = DatabaseConnector.getConnection();

            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pizza.getNavn());
            ps.setString(2, pizza.getFyld());
            ps.setInt(3, pizza.getPris());
            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            pizza.setNummer(id);
        } catch (SQLException ex) {
            Logger.getLogger(DBMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Pizza> seBestillinger() throws SQLException {
        Statement stmt;
        ArrayList<Pizza> pizzaer = new ArrayList();
        Pizza pizza;

        try {

            con = DatabaseConnector.getConnection();
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pizzabestillinger");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int price = rs.getInt("price");
                pizza = new Pizza(id, name, description, price);
                pizzaer.add(pizza);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }

        return pizzaer;
    }

    public void rydBestillinger() throws IOException, SQLException {
        Statement stmt;
        con = DatabaseConnector.getConnection();
        stmt = con.createStatement();
        String SQL = "TRUNCATE pizzabestillinger";
        stmt.executeUpdate(SQL);
        SQL = "DELETE FROM pizzabestillinger";
        stmt.executeUpdate(SQL);
    }

}
