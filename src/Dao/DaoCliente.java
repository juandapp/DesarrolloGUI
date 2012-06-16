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
import logica.Cliente;
import logica.Persona;

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
        daoPersona.guardar(cliente.getId_c());

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

    public LinkedList consultar(String id_p, String nombre) {
        LinkedList clienteConsultado = new LinkedList();
        String sql_select = "SELECT * FROM cliente JOIN persona ON id_p=id_c      ";
        if (!id_p.equals("") || !nombre.equals("")) {
            sql_select += "WHERE ";
        }
        if (!id_p.equals("")) {
            sql_select += "id_p = " + id_p + " AND ";
        }
        if (!nombre.equals("")) {
            sql_select += "nombre_p LIKE '%" + nombre + "%'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Cliente cliente = new Cliente();
                Persona persona = new Persona();
                persona.setId_p(Integer.parseInt(tabla.getString("id_p")));
                persona.setNombre_p(tabla.getString("nombre_p"));
                persona.setDireccion_p(tabla.getString("direccion_p"));
                persona.setTelefono_p(tabla.getString("telefono_p"));
                persona.setEmail_p(tabla.getString("email_p"));
                persona.setGenero_p(tabla.getString("genero_p"));
                cliente.setId_c(persona);
                clienteConsultado.add(cliente);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return clienteConsultado;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Cliente c) {

        String sql_update;
        sql_update = "UPDATE cliente SET " 
                + "id_c= "+c.getId_c().getId_p()
                +"WHERE id_c=" + c.getId_c().getId_p() + "";
        daoPersona.editar(c.getId_c());
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
