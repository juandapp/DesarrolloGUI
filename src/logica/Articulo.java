/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Articulo {

    int codigo_a, cantidad;
    String nombre, descripcion;
        
    public Articulo() {
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCodigo_a() {
        return codigo_a;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo_a(int codigo_a) {
        this.codigo_a = codigo_a;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
