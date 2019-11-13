package datasource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cecilie
 */
public class Menukort {

    private ArrayList<Pizza> menukort = new ArrayList<Pizza>();
//    File alleBestillinger = new File("bestillinger.txt");
//    File popularitet = new File("pizzapopularitet.txt");
    private PizzaMapper pm = new PizzaMapper();
    Connection con = null;

    public void opretMenukort() throws SQLException {
        //File fil = new File("menukort.txt");
        //Scanner sc = new Scanner(System.in);

        PizzaMapper pm = new PizzaMapper();
        menukort = pm.getPizzas();

    }

    public String vælgPizza() throws IOException {
        Scanner sc = new Scanner(System.in);
        String pizzaNavn = "";

        System.out.print("Pizza: ");
        int valgtPizzaNummer = sc.nextInt();
        try {
            while (valgtPizzaNummer != 0) {
                if (valgtPizzaNummer > 0 && valgtPizzaNummer <= menukort.size()) {
                    pizzaNavn = menukort.get(valgtPizzaNummer - 1).navn;
                    System.out.println(pizzaNavn);
                    Pizza pizza = menukort.get(valgtPizzaNummer - 1);
                    pm.indsætPizza(pizza);
                    //gemBestilling(pizzaNavn);

                }
                System.out.print("Pizza: ");
                valgtPizzaNummer = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        return "";
    }

    public void rydBestillinger() throws IOException, SQLException {
        Statement stmt;
        con = DatabaseConnector.getConnection();
        stmt = con.createStatement();
        String SQL = "TRUNCATE pizzabestillinger";
        stmt.executeUpdate(SQL);
        SQL = "DELETE FROM pizzabestillinger";
        stmt.executeUpdate(SQL);

//        PrintWriter pw = new PrintWriter("bestillinger.txt");
//        pw.close();
    }

    ArrayList<Pizza> getMenukort() {
        return menukort;
    }

}
