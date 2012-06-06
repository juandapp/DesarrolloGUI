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

    int id_e, id_c, numerochasis_v, codigo_a, valor;
    Date fecha;
    String tipo_orden, descripcion;

    public Ordenes() {
    }

    public int getCodigo_a() {
        return codigo_a;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getId_c() {
        return id_c;
    }

    public int getId_e() {
        return id_e;
    }

    public int getNumerochasis_v() {
        return numerochasis_v;
    }

    public String getTipo_orden() {
        return tipo_orden;
    }

    public int getValor() {
        return valor;
    }

    public void setCodigo_a(int codigo_a) {
        this.codigo_a = codigo_a;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setId_c(int id_c) {
        this.id_c = id_c;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }

    public void setNumerochasis_v(int numerochasis_v) {
        this.numerochasis_v = numerochasis_v;
    }

    public void setTipo_orden(String tipo_orden) {
        this.tipo_orden = tipo_orden;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
