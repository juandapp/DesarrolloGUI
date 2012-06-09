/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import accesoDatos.FachadaBD;
import java.sql.*;

import logica.Ordenes;

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
                + ordenes.getId_e() + ", "
                + ordenes.getId_c() + ", '"
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

    public Ordenes consultar(int id_e, int id_c, int numerochasis_v, int codigo_a) {
        Ordenes o = new Ordenes();
        String sql_select;
        int id_e_consulta = 0, id_c_consulta = 0, codigo_a_consulta = 0, numerochasis_v_consulta = 0;


        sql_select = "SELECT * FROM ordenes WHERE id_e=" + id_e + " AND id_c=" + id_c
                + " AND numerochasis_v=" + numerochasis_v + " AND codigo_a=" + codigo_a + "";


        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            //
            if (tabla.next()) {
                id_e_consulta = Integer.parseInt(tabla.getString("id_e"));
                id_c_consulta = Integer.parseInt(tabla.getString("id_c"));
                codigo_a_consulta = Integer.parseInt(tabla.getString("codigo_a"));
                numerochasis_v_consulta = Integer.parseInt(tabla.getString("numerochasis_v"));
                o.setFecha(Date.valueOf(tabla.getString("fecha")));
                o.setTipo_orden(tabla.getString("tipo_orden"));
                o.setValor(Integer.parseInt(tabla.getString("valor")));
                o.setDescripcion(tabla.getString("descripcion"));

            }
            o.setCodigo_a(daoArticulo.consultar(codigo_a_consulta));
            o.setId_c(daoCliente.consultar(id_c_consulta));
            o.setId_e(daoEmpleado.consultar(id_e_consulta));
            o.setNumerochasis_v(daoVehiculo.consultar(numerochasis_v_consulta));

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
