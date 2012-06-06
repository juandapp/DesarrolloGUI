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
import logica.Ordenes;

/**
 *
 * @author cdariolo
 */
public class DaoOrdenes {
      FachadaBD fachada;

    DaoOrdenes() {
        fachada = new FachadaBD();
    }//

    public int guardar(Ordenes ordenes) {
        String sql_guardar;
        sql_guardar = "INSERT INTO ordenes VALUES ("
                + ordenes.getId_e() + ", "
                + ordenes.getId_c() + ", '"
                + ordenes.getNumerochasis_v().getNumerochasis_v() + "', '"
                + ordenes.getCodigo_a().getCodigo_a() + "', '"
                + ordenes.getValor() + "', '"
                + ordenes.getFecha() + "', '"
                + ordenes.getTipo_orden() + "', '"
                + ordenes.getDescripcion()+ "')";
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

    public Ordenes consultar(int id_e,int id_c) {
        Ordenes o = new Ordenes();
        String sql_select;
        sql_select = "SELECT * FROM ordenes WHERE id_e=" + id_e + " AND id_c=" + id_c + "";
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {

              //HACELO PATIÑO
            }

            conn.close();
            System.out.println("Conexion cerrada");
            return o;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public int editar(Ordenes o) {

        String sql_update;
        sql_update = "UPDATE ordenes SET"
                + "id_e=" + o.getId_e() + ","
                + "id_c='" + o.getId_c() + "',"
                + "numerochasis_v=" + o.getNumerochasis_v() + ","
                + "codigo_a=" + o.getCodigo_a() + ""
                + "valor=" + o.getValor() + ","
                + "fecha=" + o.getFecha()+ ","
                + "tipo_orden='" + o.getTipo_orden() + "',"
                + "descripcion='" + o.getDescripcion() + "'";
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
