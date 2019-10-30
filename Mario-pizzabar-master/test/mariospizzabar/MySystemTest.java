/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariospizzabar;

import java.io.FileNotFoundException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class MySystemTest {
    
    @Test
    public void testHentMenukort() throws FileNotFoundException {
        //Arrange
        Menukort menukort = new Menukort();
        
        //Act
        menukort.opretMenukort();
        
        //Assert
        assertEquals(14, menukort.getMenukort().size());
        
        
        
        
        
        
    }
@Test
    public void testMySystem() throws FileNotFoundException {
        //Arrange
        Menukort menukort = new Menukort();
        MySystem mySystem = new MySystem(menukort);
        menukort.opretMenukort();
        
        //Act
        Menukort menukortActual = mySystem.getMenukort();
        
        
        //Assert
        assertEquals(14, menukort.getMenukort().size());
     
    

    }
}
