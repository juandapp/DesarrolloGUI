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
import logica.*;

/**
 *
 * @author juandrd
 */
public class DAOC_compra_V {
     FachadaBD fachada;
     DaoCliente daoCliente;
     DaoVehiculo daoVehiculo;

    DAOC_compra_V() {
        fachada = new FachadaBD();
        daoCliente= new DaoCliente();
        daoVehiculo= new DaoVehiculo();
    }//

    public int guardar(C_compra_V ccv) {
        String sql_guardar;
        sql_guardar = "INSERT INTO c_compra_v VALUES ("
                + ccv.getId_c().getId_c().getId_p()+ ", "
                + ccv.getNumerochasis_v().getNumerochasis_v() + ", '"
                + ccv.getTipo_pago() + "')";
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

    public C_compra_V consultar(String id_c, String numerochasis_v) {
        C_compra_V ccv = new C_compra_V();
        String sql_select;
        int id_c_consulta=0,numerochasis_v_consulta=0;
        sql_select = "SELECT * FROM c_compra_v WHERE id_c=" + id_c +"AND numerochasis_v=" + numerochasis_v + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {
                
                id_c_consulta=Integer.parseInt(tabla.getString("id_c"));
                numerochasis_v_consulta=Integer.parseInt(tabla.getString("numerochasis_v"));
                ccv.setTipo_pago(tabla.getString("tipo_pago"));

           
                
            }
            
            ccv.setId_c(daoCliente.consultar(id_c_consulta));
            ccv.setNumerochasis_v(daoVehiculo.consultar(numerochasis_v_consulta));

            conn.close();
            System.out.println("Conexion cerrada");
            return ccv;

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return null;
    }
    
    
    
    
    
    
    public LinkedList consultar(String id_c, String numerochasis_v) {
        
        LinkedList empleadoConsultado = new LinkedList();
        String sql_select = "SELECT * FROM c_compra_v WHERE id_c=" + id_c +"AND numerochasis_v=" + numerochasis_v + "      ";
        if (!id_c.equals("") || !numerochasis_v.equals("") ) {
            sql_select += "WHERE ";
        }
        if (!id_c.equals("")) {
            sql_select += "id_e = " + id_c + " AND ";
        }
        if (!numerochasis_v.equals("")) {
            sql_select += "numerochasis_v =" + numerochasis_v + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                C_compra_V venta = new C_compra_V();
                Cliente cliente = new Cliente((Cliente)new DaoPersona().consultar(id_c, ""));
                
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
    
    
    
    
    
    
    

    public int editar(C_compra_V ccv) {

        String sql_update;
        sql_update = "UPDATE c_compra_v SET"
               
                + "WHERE id_c=" + ccv.getId_c().getId_c().getId_p() + "";
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
