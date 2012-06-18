package Dao;

import accesoDatos.FachadaBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import logica.Empleado;
import logica.Persona;

/**
 *
 * @author juandrd
 */
public class DaoEmpleado {

    FachadaBD fachada;
    DaoPersona daoPersona;

    public DaoEmpleado() {
        fachada = new FachadaBD();
        daoPersona = new DaoPersona();
    }

    public int guardar(Empleado empleado) {
        System.out.println("en guardar de empleado" );
        String sql_guardar;
        sql_guardar = "INSERT INTO empleado VALUES ("
                + empleado.getId_e().getId_p() + ", '"
                + empleado.getTipo_e() + "', '"
                + empleado.getContrasena_e() + "')";
        daoPersona.guardar(empleado.getId_e());

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

    public LinkedList consultar(String id_e, String nombre_e, String cargo) {
        
        LinkedList empleadoConsultado = new LinkedList();
        String sql_select = "SELECT * FROM empleado JOIN persona ON id_p=id_e      ";
        if (!id_e.equals("") || !nombre_e.equals("") || !cargo.equals("")) {
            sql_select += "WHERE ";
        }
        if (!id_e.equals("")) {
            sql_select += "id_e = " + id_e + " AND ";
        }
        if (!nombre_e.equals("")) {
            sql_select += "nombre_p LIKE '%" + nombre_e + "%'" + " AND ";
        }
        if (!cargo.equals("")) {
            sql_select += "tipo_e LIKE '%" + cargo + "%'" + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Empleado empleado = new Empleado();
                Persona persona = new Persona();
                persona.setId_p(Integer.parseInt(tabla.getString("id_p")));
                persona.setNombre_p(tabla.getString("nombre_p"));
                persona.setDireccion_p(tabla.getString("direccion_p"));
                persona.setTelefono_p(tabla.getString("telefono_p"));
                persona.setEmail_p(tabla.getString("email_p"));
                persona.setGenero_p(tabla.getString("genero_p"));
                empleado.setId_e(persona);
                empleado.setTipo_e(tabla.getString("tipo_e"));
                empleado.setContrasena_e(tabla.getString("contrasena_e"));
                empleadoConsultado.add(empleado);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return empleadoConsultado;

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Empleado empleado) {

        String sql_update;
        sql_update = "UPDATE empleado SET "
                + "tipo_e='" + empleado.getTipo_e() + "',"
                + "contrasena_e='" + empleado.getContrasena_e() + "' "
                + "WHERE id_e=" + empleado.getId_e().getId_p() + "";
        daoPersona.editar(empleado.getId_e());
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
    
    public int tipoEmpleado(int usuario, String pass){
    
        String sql_select = "SELECT tipo_e FROM empleado"
                +           " WHERE id_e="+usuario+" AND contrasena_e='"+pass+"';";
        
         try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
               
                String tipo=tabla.getString("tipo_e");
                
                System.err.println(tipo);
                
                if(tipo.equalsIgnoreCase("Gerente")) return 1;
                if(tipo.equalsIgnoreCase("Vendedor")) return 2;
                if(tipo.equalsIgnoreCase("Jefe de taller")) return 3;
                
                
            }
            conn.close();
            System.out.println("Conexion cerrada");
            

        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        }

        
        return -1;
    }
    
    
}