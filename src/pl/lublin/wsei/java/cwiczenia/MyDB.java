package pl.lublin.wsei.java.cwiczenia;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


// nie potrafię wyknać tych konstruktorów dla klasy MyDB
// także wiem że w sumie dalsze przepisywanie nie ma sensu

public class MyDB {
    private Connection conn=null;
}

private void connect()
{
    Properties connectionProps = new Properties()
    connectionProps.put("user", user);
    connectionProps.put("password", password);
    connectionProps.put("serverTimezone", "Europe/Warsaw");

    String jdbcString = "jdbc:mysql://" + host + ":" +port +"/"+dbName;

    try
    {
        conn = DriverManager.getConnection(jdbcString, connectionProps);
    }

    catch (SQLException e)
    {
        System.out.println("Błąd połączenia do bazy" +jdbcString);
        System.out.println("Kominikat błędU: " +e.getMessage());
        conn = null
    }

    System.out.println("Connected to database" +dbName);
}

public Connection getConnection()
{
    if (conn == null)
        connect();
    return conn;
}