/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Date;

/**
 *
 * @author juandrd
 */
public class Cotizacion {

    int numerochasis_v, precio;
    Date fecha;
        
    public Cotizacion() {
    }

    public Cotizacion(int numerochasis_v, int precio, Date fecha) {
        this.numerochasis_v = numerochasis_v;
        this.precio = precio;
        this.fecha = fecha;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNumerochasis_v(int numerochasis_v) {
        this.numerochasis_v = numerochasis_v;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumerochasis_v() {
        return numerochasis_v;
    }

    public Date getFecha() {
        return fecha;
    }

    
    
}
