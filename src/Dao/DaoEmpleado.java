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
import logica.Empleado;

/**
 *
 * @author juandrd
 */
public class DaoEmpleado {
    FachadaBD fachada;

    DaoEmpleado() {
        fachada = new FachadaBD();
    }//

    public int guardar(Empleado empleado) {
        String sql_guardar;
        sql_guardar = "INSERT INTO empleado VALUES ("
                + empleado.getId_e().getId_p() + ", '"
                + empleado.getTipo_e() + "', '"
                + empleado.getContrasena_e() + "')";
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

    public Empleado consultar(int id_e) {
        Empleado e = new Empleado();
        String sql_select;
        sql_select = "SELECT * FROM empleado WHERE id_e=" + id_e + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            
            if (tabla.next()) {
               
                e.setTipo_e(tabla.getString("tipo_e"));
                e.setContrasena_e(tabla.getString("contrasena_e"));
                
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return e;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }

    public int editar(Empleado e) {

        String sql_update;
        sql_update = "UPDATE empleado SET"
                + "tipo_e='" + e.getTipo_e() + "'"
                + "contrasena_e='" + e.getContrasena_e() + "'"
                + "WHERE id_e=" + e.getId_e().getId_p() + "";
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
