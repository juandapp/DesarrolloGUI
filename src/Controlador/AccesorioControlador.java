/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoArticulo;
import logica.Articulo;

/**
 *
 * @author juandapp
 */
public class AccesorioControlador {

    DaoArticulo daoArticulo;

    public AccesorioControlador() {
        daoArticulo = new DaoArticulo();
    }  

    public int guardar(int codigo_a, String nombre, String descripcion, int cantidad) {
        if (!nombre.isEmpty() && !descripcion.isEmpty() && codigo_a > 0 && cantidad > 0) {
            Articulo art = new Articulo(codigo_a, cantidad, nombre, descripcion);
            int retorno = daoArticulo.guardar(art);
            return retorno;
        } else {
            return -1;
        }
    }

    public Articulo consultar(int codigo_a) {
        Articulo art;
        art = daoArticulo.consultar(codigo_a);
        return art;
    }
    
    public int editar(int codigo_a, String nombre, String descripcion, int cantidad) {
        if (!nombre.isEmpty() && !descripcion.isEmpty() && codigo_a > 0 && cantidad > 0) {
            Articulo art = new Articulo(codigo_a, cantidad, nombre, descripcion);
            int retorno = daoArticulo.editar(art);
            return retorno;
        } else {
            return -1;
        }
    }
}
