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
import logica.Articulo;

/**
 *
 * @author cdariolo
 */
public class DaoArticulo {
    
    FachadaBD fachada;

    DaoArticulo() {
        fachada = new FachadaBD();
    }//

    public int guardar(Articulo articulo) {
        String sql_guardar;
        sql_guardar = "INSERT INTO articulo VALUES ('"
                + articulo.getCodigo_a() + "', '"
                + articulo.getNombre() + "', '"
                + articulo.getCantidad() + "', '"
                + articulo.getDescripcion()+ "')";
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

    public Articulo consultar(int id_p) {
        Articulo a = new Articulo();
        String sql_select;
        sql_select = "SELECT * FROM persona WHERE id_p='" + id_p + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                a.setCodigo_a(Integer.parseInt(tabla.getString("codigo_a")));
                a.setNombre(tabla.getString("nombre"));
                a.setCantidad(Integer.parseInt(tabla.getString("cantidad")));
                a.setDescripcion(tabla.getString("descripcion"));
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return a;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Articulo a) {

        String sql_update;
        sql_update = "UPDATE persona SET"
                + "codigo_a=" + a.getCodigo_a() + ""
                + "nombre='" + a.getNombre() + "'"
                + "cantidad=" + a.getCantidad() + ""
                + "descripcion='" + a.getDescripcion() + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_update);


            conn.close();

            System.out.println("Conexion cerrada");
            return 0;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
    

