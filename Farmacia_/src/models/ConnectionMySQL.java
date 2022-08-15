package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {

    private String database_name = "Pharmacy_database";
    private String user = "root";
    private String password = "root";
    private String url = "jdb:mysql://localhost:3306" + database_name;
    Connection conn = null;

    //Metodo para conectar 
    public Connection getConnection() {
        try {
            //obtener dato del driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtenemos la conexion
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            
            System.err.println("Ha ocurrido un classFoundException" +e.getMessage());
        } catch (SQLException e) {
            System.err.println("ha ocurrido un sql Exception" + e.getMessage());
        }
        return conn;

    }
}
