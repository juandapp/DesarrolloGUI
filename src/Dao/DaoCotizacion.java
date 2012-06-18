/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import accesoDatos.FachadaBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author chokuno
 */
public class DaoCotizacion {
    
    FachadaBD fachada;
    
    public DaoCotizacion(){
    fachada = new FachadaBD();
    }
    
    
    public int guardar(String marca,String modelo,String linea,
            String color,String cojineria,int valor)
            {
            {
        String sql_guardar;
        sql_guardar = "INSERT INTO cotizacion VALUES ("
                + marca + ", '"
                + modelo+ "', '"
                + linea + "', '"
                + color + "', '"
                + cojineria + "', "
                + valor + ")";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            int numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();
            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
            
            }
}
