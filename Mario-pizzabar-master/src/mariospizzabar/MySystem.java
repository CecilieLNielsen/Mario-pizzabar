package mariospizzabar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MySystem {

    Menukort menukort;

    public MySystem(Menukort menukort) {
        this.menukort = menukort;
    }

    public void runPizza() throws IOException {
        //visMenukort();
        System.out.println("1 = Menukort");
        System.out.println("2 = Opret bestilling");
        System.out.println("3 = Fjern pizza");
        System.out.println("4 = Se bestilling");
        System.out.println("5 = Afslut bestilling");
        System.out.println("6 = Exit");
        System.out.println("Vælg 1 - 6: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        while (input < 6) {
            // 1 = vismenukort, 2 = opret bestilling, 3 = Fjern pizza, 4 = se bestilling, 5 = afslut bestilling, 6 = afslut loop
            if (input == 1) {
                System.out.println(menukort.getMenukort());
                visMenukort();
                System.out.println();
                runPizza();
            } else if (input == 2) {
                System.out.println(menukort.vælgPizza());
                System.out.println();
                runPizza();
            } else if (input == 3) {
                System.out.println();
                System.out.println();
                runPizza();
            } else if (input == 4) {
                seBestilling();
                System.out.println();
                runPizza();
            } else if (input == 5) {
                System.out.println("Bestilling afsluttet.");
                System.out.println();
                runPizza();
            //input = scan.nextInt();
        }
    }
    }
    public void visMenukort() {
        ArrayList<Pizza> pizzaListe = menukort.getMenukort();
        for (Pizza pizza : pizzaListe) {
            System.out.println(pizza);
        }
    }

    public void seBestilling() throws FileNotFoundException, IOException {
        //ArrayList<Pizza> valgtePizzaer = new ArrayList();
        try (BufferedReader br = new BufferedReader(new FileReader("bestillinger.txt"))) {
                    String valgtePizzaer;
                    while ((valgtePizzaer = br.readLine()) != null) {
                        System.out.println(valgtePizzaer);
                    }
                }
    }

    public void afslutBestilling() {

    }

    public void pizzaPopularitet() throws FileNotFoundException, IOException{
        BufferedReader reader1 = new BufferedReader(new FileReader("bestillinger.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("pizzapopularitet.txt"));
            
        String pizza1 = reader1.readLine();
        String pizza2 = reader2.readLine();
        }
    
    
}
