
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
import logica.Persona;

/**
 *
 * @author juandrd
 */
public class DaoPersona {
    //

    FachadaBD fachada;

    public DaoPersona() {
        fachada = new FachadaBD();
    }

    public int guardar(Persona persona) {
        String sql_guardar;
        sql_guardar = "INSERT INTO persona VALUES ("
                + persona.getId_p() + ", '"
                + persona.getNombre_p() + "', '"
                + persona.getDireccion_p() + "', '"
                + persona.getTelefono_p() + "','"
                + persona.getEmail_p() + "','"
                + persona.getGenero_p() + "')";
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

    public Persona consultarNN(int id_p, String nombre) {
        Persona p = new Persona();
        String sql_select = "SELECT * FROM persona      ";
        if (!String.valueOf(id_p).equals("") || !nombre.equals("")) {
            sql_select += "WHERE ";
        }
        if (!String.valueOf(id_p).equals("")) {
            sql_select += "id_p = " + id_p + " AND ";
        }
        if(!nombre.equals("")){
            sql_select += "nombre_p = '" + nombre + "' AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            if (tabla.next()) {
                p.setId_p(Integer.parseInt(tabla.getString("id_p")));
                p.setNombre_p(tabla.getString("nombre_p"));
                p.setDireccion_p(tabla.getString("direccion_p"));
                p.setTelefono_p(tabla.getString("telefono_p"));
                p.setEmail_p(tabla.getString("email_p"));
                p.setGenero_p(tabla.getString("genero_p"));
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return p;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public LinkedList consultar(int id_p, String nombre) {
        LinkedList personaConsulta = new LinkedList();
        String sql_select = "SELECT * FROM persona      ";
        if (!String.valueOf(id_p).equals("") || !nombre.equals("")) {
            sql_select += "WHERE ";
        }
        if (!String.valueOf(id_p).equals("")) {
            sql_select += "id_p = " + id_p + " AND ";
        }
        if(!nombre.equals("")){
            sql_select += "nombre_p = '" + nombre + "' AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Persona persona = new Persona();
                persona.setId_p(Integer.parseInt(tabla.getString("id_p")));
                persona.setNombre_p(tabla.getString("nombre_p"));
                persona.setDireccion_p(tabla.getString("direccion_p"));
                persona.setTelefono_p(tabla.getString("telefono_p"));
                persona.setEmail_p(tabla.getString("email_p"));
                persona.setGenero_p(tabla.getString("genero_p"));
                personaConsulta.add(persona);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return personaConsulta;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Persona p) {

        String sql_update;
        sql_update = "UPDATE persona SET"
                + "nombre_p='" + p.getNombre_p() + "',"
                + "direccion_p='" + p.getDireccion_p() + "',"
                + "telefono_p='" + p.getTelefono_p() + "',"
                + "email_p='" + p.getEmail_p() + "',"
                + "genero_p='" + p.getGenero_p() + "',"
                + "WHERE id_p=" + p.getId_p() + "";
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
