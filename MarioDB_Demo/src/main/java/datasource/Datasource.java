package datasource;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pizza;

public interface Datasource {

    public ArrayList<Pizza> getPizzas() throws SQLException;
       
    public void indsætPizza(Pizza pizza);
    
    public ArrayList<Pizza> seBestillinger() throws SQLException;
    
    public void rydBestillinger() throws IOException, SQLException;
}
