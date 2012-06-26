/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoCotizacion;
import java.sql.Date;
import logica.Articulo;
import logica.Cotizacion;

/**
 *
 * @author juandapp
 */
public class CotizacionControlador {

    DaoCotizacion daoCotizacion;

    public CotizacionControlador() {
        daoCotizacion = new DaoCotizacion();
    }

    public int guardar(int numerochasis_v, Date fecha, int precio) {
        int retorno = 0;
        if (!String.valueOf(numerochasis_v).isEmpty() && !String.valueOf(precio).isEmpty() && precio > 0) {
            Cotizacion cotizacion = new Cotizacion(numerochasis_v, precio, fecha);
            retorno = daoCotizacion.guardar(cotizacion);
            return retorno;
        } else {
            return -1;
        }
    }


}
