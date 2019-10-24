
package mariospizzabar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mathias Clausen
 */
public class LæsMenukortKlasse {

    public static void main(String[] args) throws IOException {
        LæsMenukort();
    }
    public static void LæsMenukort() throws FileNotFoundException, IOException {
        
        File menukort = new File("menukort.txt");
        FileReader fr = new FileReader(menukort);
        BufferedReader br = new BufferedReader(fr);
        String menu;
        while((menu = br.readLine()) != null) {
        System.out.println(menu);
        
    }
     br.close();
        
    }
    
}
