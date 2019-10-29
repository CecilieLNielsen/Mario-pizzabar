package mariospizzabarNy;

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
