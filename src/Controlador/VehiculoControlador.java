/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoVehiculo;
import logica.Vehiculo;

/**
 *
 * @author chokuno
 */
public class VehiculoControlador {
    
    DaoVehiculo daoVehiculo;

    public VehiculoControlador() {
        daoVehiculo = new DaoVehiculo();
    }

    public int guardar(int numerochasis_v,String linea_v,String marca_v,String color_v
            ,String modelo_v,String cojineria_v,Boolean disponible_v)
    {
        if (!linea_v.isEmpty() && !marca_v.isEmpty() && !color_v.isEmpty()
                && !modelo_v.isEmpty() && !cojineria_v.isEmpty() && numerochasis_v > 0 && disponible_v != null) 
        {
            Vehiculo veh = new Vehiculo( numerochasis_v, linea_v, marca_v, color_v
            , modelo_v, cojineria_v, disponible_v);
            
            
            int retorno = daoVehiculo.guardar(veh);
            return retorno;
        } else {
            return -1;
        }
    }

    public Vehiculo consultar(int numerochasis_v) {
        Vehiculo veh;
        veh = daoVehiculo.consultar(numerochasis_v);
        return veh;
    }
    
    
    public int editar(int numerochasis_v,String linea_v,String marca_v,String color_v
            ,String modelo_v,String cojineria_v,Boolean disponible_v)
    {
     if (!linea_v.isEmpty() && !marca_v.isEmpty() && !color_v.isEmpty()
                && !modelo_v.isEmpty() && !cojineria_v.isEmpty() && numerochasis_v > 0 && disponible_v != null) 
        {
            Vehiculo veh = new Vehiculo( numerochasis_v, linea_v, marca_v, color_v
            , modelo_v, cojineria_v, disponible_v);
            
            
            int retorno = daoVehiculo.editar(veh);
            return retorno;
        } else {
            return -1;
        }
    
    }
}
