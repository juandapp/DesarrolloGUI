/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoArticulo;
import Dao.DAOC_compra_V;
import Dao.DaoCliente;
import Dao.DaoEmpleado;
import Dao.DaoVehiculo;
import java.sql.Date;
import logica.*;

/**
 *
 * @author JUANPAULO
 */
public class C_compra_VControlador {

    DAOC_compra_V daoc_compra_v;

    public C_compra_VControlador() {
        daoc_compra_v = new DAOC_compra_V();

    }

    public int guardar(int id_c, int numerochasis_v, String tipo_pago) {
        int retorno = 0;

        if (!String.valueOf(id_c).isEmpty() && !String.valueOf(numerochasis_v).isEmpty()
                && !tipo_pago.equals("Seleccionar") && !tipo_pago.isEmpty()) {
            Cliente c = (Cliente) new DaoCliente().consultar(id_c + "", "").getFirst();
            Vehiculo v = ((Vehiculo) new DaoVehiculo().consultar(numerochasis_v + "", "", "", "", "").getFirst());
            C_compra_V venta = new C_compra_V();
            venta.setId_c(c);
            venta.setNumerochasis_v(v);
            venta.setTipo_pago(tipo_pago);
            retorno = daoc_compra_v.guardar(venta);
        } else {
            retorno = -1;
        }

        return retorno;
    }
}
