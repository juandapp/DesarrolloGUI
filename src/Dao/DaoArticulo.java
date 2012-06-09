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
import logica.Articulo;

/**
 *
 * @author cdariolo
 */
public class DaoArticulo {

    FachadaBD fachada;

    public DaoArticulo() {
        fachada = new FachadaBD();
    }//

    public int guardar(Articulo articulo) {
        String sql_guardar;
        sql_guardar = "INSERT INTO articulo VALUES ("
                + articulo.getCodigo_a() + ", '"
                + articulo.getNombre() + "', '"
                + articulo.getDescripcion() + "', '"
                + articulo.getCantidad() + "')";
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

    public Articulo consultar(int codigo_a) {
        Articulo a = new Articulo();
        String sql_select;
        sql_select = "SELECT * FROM articulo WHERE codigo_a=" + codigo_a + "";
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
    
    
    
    
    
    public LinkedList consultar_Nombre(String nombre) {
        LinkedList articuloConsulta = new LinkedList();
        String sql_select;
        sql_select = "SELECT * FROM articulo WHERE nombre LIKE '%"+nombre+"%'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Articulo articulo = new Articulo();
                articulo.setCodigo_a(Integer.parseInt(tabla.getString("codigo_a")));
                articulo.setNombre(tabla.getString("nombre"));
                articulo.setCantidad(Integer.parseInt(tabla.getString("cantidad")));
                articulo.setDescripcion(tabla.getString("descripcion"));
                articuloConsulta.add(articulo);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return articuloConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultarTodo() {
        LinkedList articuloConsulta = new LinkedList();
        String sql_select;
        sql_select = "SELECT * FROM articulo ";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Articulo articulo = new Articulo();
                articulo.setCodigo_a(Integer.parseInt(tabla.getString("codigo_a")));
                articulo.setNombre(tabla.getString("nombre"));
                articulo.setCantidad(Integer.parseInt(tabla.getString("cantidad")));
                articulo.setDescripcion(tabla.getString("descripcion"));
                articuloConsulta.add(articulo);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return articuloConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Articulo a) {

        String sql_update;
        sql_update = "UPDATE articulo SET "
                + "nombre='" + a.getNombre() + "', "
                + "cantidad=" + a.getCantidad() + ", "
                + "descripcion='" + a.getDescripcion() + "' "
                + "WHERE codigo_a=" + a.getCodigo_a();
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
