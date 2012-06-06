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
import logica.C_compra_V;

/**
 *
 * @author juandrd
 */
public class DAOC_compra_V {
     FachadaBD fachada;

    DAOC_compra_V() {
        fachada = new FachadaBD();
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

    public C_compra_V consultar(int id_c) {
        C_compra_V ccv = new C_compra_V();
        String sql_select;
        sql_select = "SELECT * FROM c_compra_v WHERE id_c='" + id_c + "'";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

                ccv.setNumerochasis_v(tabla.getInt("numerochasis_v"));
                ccv.setContrasena_e(tabla.getString("contrasena_e"));
                
            }

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

    public int editar(C_compra_V e) {

        String sql_update;
        sql_update = "UPDATE c_compra_v SET"
                + "tipo_e='" + e.getTipo_e() + "'"
                + "contrasena_e='" + e.getContrasena_e() + "'"
                + "WHERE id_e='" + e.getId_e().getId_p() + "'";
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
