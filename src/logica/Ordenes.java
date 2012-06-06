/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.Date;

/**
 *
 * @author juandrd
 */
public class Ordenes {

    Empleado id_e;
    Cliente id_c;
    Vehiculo numerochasis_v;
    Articulo codigo_a;
    int valor;
    Date fecha;
    String tipo_orden, descripcion;

    public Ordenes() {
    }

    public Articulo getCodigo_a() {
        return codigo_a;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getId_c() {
        return id_c;
    }

    public Empleado getId_e() {
        return id_e;
    }

    public Vehiculo getNumerochasis_v() {
        return numerochasis_v;
    }

    public String getTipo_orden() {
        return tipo_orden;
    }

    public int getValor() {
        return valor;
    }

    public void setCodigo_a(Articulo codigo_a) {
        this.codigo_a = codigo_a;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setId_c(Cliente id_c) {
        this.id_c = id_c;
    }

    public void setId_e(Empleado id_e) {
        this.id_e = id_e;
    }

    public void setNumerochasis_v(Vehiculo numerochasis_v) {
        this.numerochasis_v = numerochasis_v;
    }

    public void setTipo_orden(String tipo_orden) {
        this.tipo_orden = tipo_orden;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
