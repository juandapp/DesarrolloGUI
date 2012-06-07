/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import accesoDatos.FachadaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Vehiculo;

/**
 *
 * @author juandrd
 */
public class DaoVehiculo {
     FachadaBD fachada;

    public DaoVehiculo() {
        fachada = new FachadaBD();
    }//

    public int guardar(Vehiculo vehiculo) {
        String sql_guardar;
        sql_guardar = "INSERT INTO vehiculo VALUES ("
                + vehiculo.getNumerochasis_v() + ", '"
                + vehiculo.getLinea_v() + "', '"
                + vehiculo.getMarca_v() + "', '"
                + vehiculo.getColor_v() + "', '"
                + vehiculo.getModelo_v() + "', '"
                + vehiculo.getCojineria_v() + "', "
                + vehiculo.getDisponible_v() +")";
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
    }//fin guardar

    public Vehiculo consultar(int numerochasis_v) {
        Vehiculo v = new Vehiculo();
        String sql_select;
        sql_select = "SELECT * FROM vehiculo WHERE numerochasis_v=" + numerochasis_v + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {
                v.setNumerochasis_v(Integer.parseInt(tabla.getString("numero_chasis_v")));
                v.setLinea_v(tabla.getString("linea_v"));
                v.setMarca_v(tabla.getString("marca_v"));
                v.setColor_v(tabla.getString("color_v"));
                v.setModelo_v(tabla.getString("modelo_v"));
                v.setCojineria_v(tabla.getString("cojineria_v"));
                v.setDisponible_v(tabla.getBoolean("disponible_v"));
                
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return v;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }

    public int editar(Vehiculo v) {

        String sql_update;
        sql_update = "UPDATE vehiculo SET"
                + "linea_v='" + v.getLinea_v() + "'"
                + "marca_v='" + v.getMarca_v() + "'"
                + "color_v='" + v.getColor_v() + "'"
                + "modelo_v='" + v.getModelo_v() + "'"
                + "cojineria_v='" + v.getCojineria_v() + "'"
                + "disponible_v=" + v.getDisponible_v() + ""
                + "WHERE numerochasis_v=" + v.getNumerochasis_v() + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return -1;
    }
}
