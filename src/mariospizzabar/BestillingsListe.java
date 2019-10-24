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
public class BestillingsListe {

    public static void main(String[] args) throws FileNotFoundException {
        File menukort = new File("Menukort.txt");
        Scanner sc = new Scanner(menukort);
        List<Pizza> bestillinger = new ArrayList<Pizza>();

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

                Pizza p = new Pizza (nummer, navn, fyld, pris, nyhed);
                bestillinger.add(p);
            }
            
             for(Pizza p: bestillinger){
                System.out.println(p.toString());
        }

    }
    }
}

