/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class Registro extends Conexion {

    public boolean registrar(String nombre, String sexo, int edad, float estatura, String alias, String pass) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO usuario (nombre, sexo, edad, estatura, alias, pass) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, sexo);
            pst.setInt(3, edad);
            pst.setDouble(4, estatura);
            pst.setString(5, alias);
            pst.setString(6, pass);

            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getCause());
        } finally {
            try {
                if (getConnection() != null) {
                    getConnection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }

}
