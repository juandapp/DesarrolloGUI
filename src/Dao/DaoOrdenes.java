/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import accesoDatos.FachadaBD;
import java.sql.*;
import java.util.LinkedList;
import logica.*;

/**
 *
 * @author cdariolo
 */
public class DaoOrdenes {

    FachadaBD fachada;
    DaoCliente daoCliente;
    DaoEmpleado daoEmpleado;
    DaoArticulo daoArticulo;
    DaoVehiculo daoVehiculo;

    public DaoOrdenes() {
        fachada = new FachadaBD();
        daoCliente = new DaoCliente();
        daoEmpleado = new DaoEmpleado();
        daoArticulo = new DaoArticulo();
        daoVehiculo = new DaoVehiculo();
    }

    public int guardar(Ordenes ordenes) {
        String sql_guardar;
        sql_guardar = "INSERT INTO ordenes VALUES ("
                + ordenes.getId_e().getId_e().getId_p() + ", "
                + ordenes.getId_c().getId_c().getId_p() + ", '"
                + ordenes.getNumerochasis_v().getNumerochasis_v() + "', '"
                + ordenes.getCodigo_a().getCodigo_a() + "', '"
                + ordenes.getValor() + "', '"
                + ordenes.getFecha() + "', '"
                + ordenes.getTipo_orden() + "', '"
                + ordenes.getDescripcion() + "')";
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
   
     public LinkedList consultar(String id_e, String id_c, String numerochasis_v, String codigo_a) {
        LinkedList ordenConsultada = new LinkedList();

        String sql_select = "SELECT * FROM ordenes      ";
        if (!id_e.equals("") || !id_c.equals("")|| !numerochasis_v.equals("")|| !codigo_a.equals("")) {
            sql_select += "WHERE ";
        }
        if (!id_e.equals("")) {
            sql_select += "id_e = " + id_e + " AND ";
        }
        if (!id_c.equals("")) {
            sql_select += "id_c =" + id_c + " AND ";
        }
        if (!numerochasis_v.equals("")) {
            sql_select += "numerochasis_v =" + numerochasis_v + " AND ";
        }
        if (!codigo_a.equals("")) {
            sql_select += "codigo_a =" + codigo_a + " AND ";
        }
        sql_select = sql_select.substring(0, sql_select.length() - 5);
        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            while (tabla.next()) {
                Ordenes orden = new Ordenes();
                orden.setId_c((Cliente)new DaoCliente().consultar(tabla.getString("id_c"), "").getFirst());
                orden.setId_e((Empleado)new DaoEmpleado().consultar(tabla.getString("id_e"), "","").getFirst());
                orden.setNumerochasis_v((Vehiculo)new DaoVehiculo().consultar(tabla.getString("id_e"), "","","","").getFirst());
                orden.setCodigo_a((Articulo)new DaoArticulo().consultar(tabla.getString("id_e"), "").getFirst());
                orden.setDescripcion(tabla.getString("descripcion_a"));
                orden.setTipo_orden(tabla.getString("tipo_orden"));
                orden.setFecha(tabla.getDate("fecha"));
                orden.setValor(Integer.parseInt(tabla.getString("valor")));
                ordenConsultada.add(orden);
            }
            conn.close();
            System.out.println("Conexion cerrada");
            return ordenConsultada;

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
                + "fecha=" + o.getFecha() + ","
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
