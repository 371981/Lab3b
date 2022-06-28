package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestMyDB {
        public static void main(String [] args)
        {
            MyDB db= new MyDB("localhost" 3306,"mydb");
           db.setUser("root");
           db.setPassword("******");

            Connection conn = db.getConnection();

            if (conn !=null)

            System.out.println("Connected to database");
        }
    }
}
