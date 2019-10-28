package mariospizzabar;

import java.io.FileNotFoundException;
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

    public void start() throws FileNotFoundException {
        menukort = new Menukort();
        menukort.opretMenukort();
        opretBestilling();
        visMenukort();
        
    }
    public void opretBestilling(){
        menukort.bestilling();
    }
    public void visMenukort(){
        ArrayList<Pizza> menu = menukort.getMenukort();
        System.out.println(menu.size());
        for (Pizza pizza : menu) {
            
            System.out.println(pizza);
        }
    }

    }

