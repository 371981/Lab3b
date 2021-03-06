package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.Properties;


public class TestConnection {
    public static void main(String [] args) throws ClassNotFoundException, SQLException
    {
        String serverName = "localhost";
        String database = "mydb";
        Number portNumber = 3306;
        Connection conn = null;
        Properties connectionProps = new Properties();  //parametry serwera

        connectionProps.put("user", "root");
        connectionProps.put("password", "******");
        connectionProps.put("serverTimezone", "Europe/Warsaw");

        conn = DriverManager.getConnection(  //najważniejsze
                "jbcd:mysql://" + serverName+ ":"+ portNumber + "/"+database,connectionProps);

        System.out.println("Connected to database");
    }
}
