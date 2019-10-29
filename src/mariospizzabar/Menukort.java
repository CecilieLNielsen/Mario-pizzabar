/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cecilie
 */
public class Menukort {

    private ArrayList<Pizza> menukort = new ArrayList<Pizza>();

    public void opretMenukort() throws FileNotFoundException {
        File fil = new File("menukort.txt");
        Scanner sc = new Scanner(fil);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] details = line.split(" ");
            int nummer = Integer.parseInt(details[0].replace(".", ""));
            String navn = details[1].replace(":", "");
            String[] fyld = details[2].split(",");
            int pris = Integer.parseInt(details[3].replace(",-", ""));
            boolean nyhed = false;
            if (details.length == 5) {
                nyhed = true;
            }
            Pizza p = new Pizza(nummer, navn, fyld, pris, nyhed);
            menukort.add(p);

            System.out.println(p.toString());
        }

    }

    public String bestilling() {
        Scanner sc = new Scanner(System.in);
        String bestilling = "";

        System.out.print("Pizza: ");
        String pizzaIn = sc.next();
        try {
            Scanner scan = new Scanner(new File("Menukort.txt"));
            while (scan.hasNext()) {
                String line = scan.nextLine().toString();
                if (line.contains(pizzaIn)) {
                    bestilling = line;
                    System.out.println(line);

                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }

        return "";
    }

    ArrayList<Pizza> getMenukort() {
        return menukort;
    }

}
