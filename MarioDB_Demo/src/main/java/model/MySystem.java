package model;

import datasource.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySystem {

    private Menukort menukort;
    private Datasource pm;

    public MySystem(Datasource datasource) {
        menukort = new Menukort(datasource);
        pm = datasource;

    }

    public void runPizza() throws IOException, SQLException {

        Scanner scan = new Scanner(System.in);
        int input = 0;
        while (input < 5) {
            System.out.println("1 = Menukort");
            System.out.println("2 = Opret bestilling");
            System.out.println("3 = Ryd bestillinger");
            System.out.println("4 = Se bestilling");
            System.out.println("5 = Exit");
            System.out.println("Vælg 1 - 5: ");
            input = scan.nextInt();
            // 1 = vismenukort, 2 = opret bestilling, 3 = Ryd bestillinger, 4 = se bestilling, 5 = afslut loop
            if (input == 1) {
                visMenukort();
            } else if (input == 2) {
                menukort.vælgPizza();
            } else if (input == 3) {
                fjernBestilling();
            } else if (input == 4) {
                seBestilling();
            }
        }
    }

    public void visMenukort() {

        try {
            ArrayList<Pizza> pizzaListe = pm.getPizzas();
            for (Pizza pizza : pizzaListe) {
                System.out.println(pizza);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println();
    }

    public void fjernBestilling() throws IOException {
        try {
            pm.rydBestillinger();
        } catch (SQLException ex) {
            Logger.getLogger(MySystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println();
    }

    public void seBestilling() throws FileNotFoundException, IOException {
        try {
            ArrayList<Pizza> pizzaListe = pm.seBestillinger();
            for (Pizza pizza : pizzaListe) {
                System.out.println(pizza);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println();
    }
}
