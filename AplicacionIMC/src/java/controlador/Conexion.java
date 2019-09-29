/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class Conexion {
    private String username = "root";
    private String password = "edgar186";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "app";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/app";
    private Connection con;
    
    public Conexion(){
        try {
            Class.forName(classname);
            con = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getMessage());
        }
    }
    
    public Connection getConnection(){
    return con;            
    }
}
