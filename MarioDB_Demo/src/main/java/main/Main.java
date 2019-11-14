package main;

import datasource.DBMapper;
import datasource.Datasource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import model.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
        Datasource datasource = new DBMapper();
        new MySystem(datasource).runPizza();
    }
}
