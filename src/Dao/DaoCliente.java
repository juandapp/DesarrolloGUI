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
import logica.Cliente;

/**
 *
 * @author juandrd
 */
public class DaoCliente {

    FachadaBD fachada;
    DaoPersona daoPersona;

    public DaoCliente() {
        fachada = new FachadaBD();
        daoPersona = new DaoPersona();
    }

    public int guardar(Cliente cliente) {
        String sql_guardar;
        sql_guardar = "INSERT INTO cliente VALUES ("
                + cliente.getId_c().getId_p() + ")";
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

    public Cliente consultar(int id_c) {
        Cliente c = new Cliente();
        String sql_select;
        int id_c_consulta = 0;
        sql_select = "SELECT * FROM cliente WHERE id_c=" + id_c + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                id_c_consulta = Integer.parseInt(tabla.getString("id_c"));

            }

            // c.setId_c(daoPersona.consultar(id_c_consulta));

            conn.close();
            System.out.println("Conexion cerrada");
            return c;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }

    public int editar(Cliente c) {

        String sql_update;
        sql_update = "UPDATE cliente SET"
                + "WHERE id_e=" + c.getId_c().getId_p() + "";
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
