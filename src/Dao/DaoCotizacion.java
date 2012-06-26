/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import accesoDatos.FachadaBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Cotizacion;

/**
 *
 * @author chokuno
 */
public class DaoCotizacion {

    FachadaBD fachada;

    public DaoCotizacion() {
        fachada = new FachadaBD();
    }

    public int guardar(Cotizacion c) {
        {
            String sql_guardar;
            sql_guardar = "INSERT INTO cotizacion VALUES ("
                    + c.getNumerochasis_v() + ", '"
                    + c.getFecha() + "', "
                    + c.getPrecio()+ ")";
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
