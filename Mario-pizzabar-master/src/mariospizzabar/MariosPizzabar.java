package mariospizzabar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cecilie
 */
public class MariosPizzabar {
Menukort menukort;
MySystem system;

    public void init() throws FileNotFoundException, IOException {
        menukort = new Menukort();
        system = new MySystem(menukort);
        
        menukort.opretMenukort();
        system.runPizza();
        
        
    } 
    
        public void opretBestillingsListe() throws IOException{
            system.runPizza();
        }
        
    public void opretMenukort() throws IOException{
        menukort.vælgPizza();
        menukort.getMenukort();
    }
//    public void visMenukort(){
//        ArrayList<Pizza> menu = menukort.getMenukort();
//        System.out.println(menu.size());
//        for (Pizza pizza : menu) {
//            
//            System.out.println(pizza);
//        }
//    }
//    

    }

