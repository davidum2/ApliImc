/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class Datos extends Conexion {
    private float peso;
    private float estatura;
    private String fecha;
    private String alias;

                  
    public boolean datos(float peso, float estatura, String fecha, String alias) {
        this.peso=peso;
        this.estatura=estatura;
        this.fecha=fecha;
        this.alias=alias;
        
        PreparedStatement pst = null;
        try {
            String sql = "INSERT INTO datos (peso, altura, fecha, alias_usuario) values (?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setFloat(1, peso);
            pst.setFloat(2, estatura);
            pst.setString(3, fecha);
            pst.setString(4, alias);

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
      
    public float getPeso() {
        return peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public String getFecha() {
        return fecha;
    }

    public String getAlias() {
        return alias;
    }    
    
}
