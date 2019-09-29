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
public class Guardar extends Conexion{
    public boolean guardar(float imc, String fecha, String usuario) {
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO calculo (imc, fecha, usuario) values (?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setFloat(1, imc);
            pst.setString(2, fecha);
            pst.setString(5, usuario);
            

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
