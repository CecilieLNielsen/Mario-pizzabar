package model;

import datasource.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menukort {

    private ArrayList<Pizza> menukort;
    Datasource pm;

    public Menukort(Datasource datasource) {
        pm = datasource;
        try {
            menukort = pm.getPizzas();
        } catch (SQLException ex) {
            Logger.getLogger(Menukort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String vælgPizza() throws IOException {
        Scanner sc = new Scanner(System.in);
        String pizzaNavn = "";
        System.out.println("Gå til menu indtast 0");
        System.out.println("Pizza: ");
        int valgtPizzaNummer = sc.nextInt();
        try {
            while (valgtPizzaNummer != 0) {
                if (valgtPizzaNummer > 0 && valgtPizzaNummer <= menukort.size()) {
                    pizzaNavn = menukort.get(valgtPizzaNummer - 1).navn;
                    Pizza pizza = menukort.get(valgtPizzaNummer - 1);
                    pm.indsætPizza(pizza);
                }
                System.out.print("Pizza: ");
                System.out.println(pizzaNavn);
                valgtPizzaNummer = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        return "";
    }

    //Til jUnit test
    ArrayList<Pizza> getMenukort() {
        return menukort;
    }
}
