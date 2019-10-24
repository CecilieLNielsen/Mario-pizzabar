/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cecilie
 */
public class MariosPizzabar {

    public static void main(String[] args) {
        Menukort bestillingsliste = new Menukort();
        try {
            bestillingsliste.opretMenukort();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MariosPizzabar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
