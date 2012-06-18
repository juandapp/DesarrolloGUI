/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoArticulo;
import Dao.DaoCliente;
import Dao.DaoEmpleado;
import Dao.DaoVehiculo;
import java.sql.Date;
import logica.*;

/**
 *
 * @author JUANPAULO
 */
public class VentaControlador {

    public VentaControlador() {
    }
    
     public int guardar(int id_e, int id_c, int numerochasis_v, int codigo_a,
            int valor, Date fecha, String tipo_orden, String descripcion) {
        int retorno = 0;

        if (!String.valueOf(id_e).isEmpty() && !String.valueOf(id_c).isEmpty() && !String.valueOf(numerochasis_v).isEmpty()
                && !String.valueOf(codigo_a).isEmpty() && !String.valueOf(valor).isEmpty() && !tipo_orden.isEmpty() && !tipo_orden.equals("Seleccionar")
                && !descripcion.isEmpty()) {
            Empleado e = (Empleado) new DaoEmpleado().consultar(id_e + "", "", "").getFirst();
            Cliente c = (Cliente) new DaoCliente().consultar(id_c + "", "").getFirst();
            Vehiculo v = ((Vehiculo) new DaoVehiculo().consultar(numerochasis_v+"", "", "", "", "").getFirst());
            Articulo a = (Articulo) new DaoArticulo().consultar(codigo_a+"", "").getFirst();
            Ordenes orden = new Ordenes(e, c, v, a, valor, fecha, tipo_orden, descripcion);
            
            retorno = daoOrdenes.guardar(orden);
        } else {
            retorno = -1;
        }

        return retorno;
    }
    
}
