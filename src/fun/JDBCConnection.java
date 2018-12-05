package fun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCConnection {

    String dbName;
    String username;
    String password;
    Connection dbConn;

    public JDBCConnection() {

        this.dbName = "jdbc:postgresql://localhost:5432/TheMartAlpha"; //
        this.username = "ioannis";
        this.password = "martalpha";

    }


    public void SQLConnect (){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver not found");
        }

        System.out.println("PostgreSQL driver registered.");
        dbConn = null;

        try {
            dbConn = DriverManager.getConnection(dbName, username, password);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (dbConn != null) {
            System.out.println("Database accessed!");
        } else {
            System.out.println("Failed to make dbConnection");
        }
    }

    public Connection getConnection(){
        return dbConn;
    }



}