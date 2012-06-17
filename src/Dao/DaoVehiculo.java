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
import java.util.LinkedList;
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
                + vehiculo.getCojineria_v() + "', '"
                + vehiculo.getDisponible_v() + "')";
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

    public LinkedList consultar(String numerochasis_v, String marca_v, String modelo_v, String linea_v, String color_v) {
        LinkedList vehiculoConsulta = new LinkedList();
        String sql_select;
        sql_select = "SELECT * FROM vehiculo      ";
        if (!numerochasis_v.equals("")|| !marca_v.equals("") || !modelo_v.equals("") || !linea_v.equals("")
                || !color_v.equals("")) {
            sql_select += "WHERE ";
        }
        if (!numerochasis_v.equals("")) {
            sql_select += "numerochasis_v = " +numerochasis_v+ " AND ";
        }
        if (!marca_v.equals("")) {
            sql_select += "marca_v LIKE '%" +marca_v+ "%'" + " AND ";
        }
        if (!modelo_v.equals("")) {
            sql_select += "modelo_v LIKE '%" +modelo_v+ "%'" + " AND ";
        }
        if (!linea_v.equals("")) {
            sql_select += "linea_v LIKE '%" +linea_v+ "%'" + " AND ";
        }
        if (!color_v.equals("")) {
            sql_select += "color_v LIKE '%" +color_v+ "%'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                Vehiculo v = new Vehiculo();
                v.setNumerochasis_v(Integer.parseInt(tabla.getString("numerochasis_v")));
                v.setLinea_v(tabla.getString("linea_v"));
                v.setMarca_v(tabla.getString("marca_v"));
                v.setColor_v(tabla.getString("color_v"));
                v.setModelo_v(tabla.getString("modelo_v"));
                v.setCojineria_v(tabla.getString("cojineria_v"));
                v.setDisponible_v(tabla.getBoolean("disponible_v"));
                vehiculoConsulta.add(v);

            }

            conn.close();
            System.out.println("Conexion cerrada");
            return vehiculoConsulta;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }

    public int editar(Vehiculo v) {

        String sql_update;
        sql_update = "UPDATE vehiculo SET "
                + "linea_v='" + v.getLinea_v() + "', "
                + "marca_v='" + v.getMarca_v() + "', "
                + "color_v='" + v.getColor_v() + "', "
                + "modelo_v='" + v.getModelo_v() + "', "
                + "cojineria_v='" + v.getCojineria_v() + "', "
                + "disponible_v='" + v.getDisponible_v() + "' "
                + "WHERE numerochasis_v=" + v.getNumerochasis_v();
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
