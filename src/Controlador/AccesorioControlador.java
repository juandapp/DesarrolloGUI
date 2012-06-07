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

    public int guardar(int codigo_a, int cantidad, String nombre, String descripcion) {
        Articulo art = new Articulo(codigo_a, cantidad, nombre, descripcion);
        int retorno = daoArticulo.guardar(art);
        return retorno;
    }

    public Articulo consultar(String codigo_a) {
        Articulo art;
        art = daoArticulo.consultar(Integer.parseInt(codigo_a));
        return art;
    }
}
