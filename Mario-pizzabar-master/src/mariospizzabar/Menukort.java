package mariospizzabar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cecilie
 */
public class Menukort {

    private ArrayList<Pizza> menukort = new ArrayList<Pizza>();
    File file = new File("bestillinger.txt");
    File file1 = new File("pizzapopularitet.txt");
    
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

         //   System.out.println(p.toString());
        }

    }

    public String vælgPizza() throws IOException {
        Scanner sc = new Scanner(System.in);
        String bestilling = "";
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(file1, true));
        
        System.out.print("Pizza: ");
        String pizzaIn = sc.next();
        try{
            Scanner scan = new Scanner(new File("Menukort.txt"));
            while (scan.hasNext()) {
                String valgtPizza = scan.nextLine().toString();
                if(valgtPizza.contains(pizzaIn))
                {
                    bestilling = valgtPizza; 
                    System.out.println(valgtPizza);
                    bw.write(valgtPizza);
                    bw1.write(valgtPizza);
                    bw.newLine();
                    bw1.newLine();
                    bw.close();
                    bw1.close();
                    
                }
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        
return "";
    }

    ArrayList<Pizza> getMenukort() {
        return menukort;
    }

}
