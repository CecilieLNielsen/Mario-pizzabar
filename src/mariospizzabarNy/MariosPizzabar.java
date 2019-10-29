package mariospizzabarNy;

import java.io.FileNotFoundException;
import java.io.IOException;

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

    public void opretBestillingsListe() throws IOException {
        system.runPizza();
    }

    public void opretMenukort() throws IOException {
        menukort.vælgPizza();
        menukort.getMenukort();
    }
}
