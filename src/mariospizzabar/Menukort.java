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

    ArrayList<Pizza> menukort = new ArrayList<Pizza>();

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

                Pizza p = new Pizza(nummer, navn, fyld, pris, nyhed);
                menukort.add(p);
            }

            for (Pizza p : menukort) {
                System.out.println(p.toString());

            }

        }

    }
}
