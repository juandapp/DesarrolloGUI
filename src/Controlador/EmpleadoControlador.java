/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoEmpleado;
import logica.Empleado;
import logica.Persona;

/**
 *
 * @author chokuno
 */
public class EmpleadoControlador {
    DaoEmpleado daoEmpleado;
     PersonaControlador controladorPersona;

    public EmpleadoControlador() {
        daoEmpleado = new DaoEmpleado();
    }

    public int guardar(int id_c,String nombre_p,String direccion_p,int telefono_p,
            String email_p,String genero_p) {
        if (id_c > 0 && !nombre_p.isEmpty() && !direccion_p.isEmpty() && telefono_p>0 && 
                !email_p.isEmpty() && genero_p.isEmpty()) {
            
            Persona per=controladorPersona.guardar(id_c, nombre_p, direccion_p, telefono_p, email_p, genero_p);
            Empleado emp= new Empleado(per);
            
            int retorno = daoEmpleado.guardar(emp);
            return retorno;
        } else {
            return -1;
        }
    }

    public Empleado consultar(int id_c) {
        Empleado cli;
        cli = daoEmpleado.consultar(id_c);
        return cli;
    }
    
    public int editar(int id_c,String nombre_p,String direccion_p,int telefono_p,
            String email_p,String genero_p) {
        if (id_c > 0 && !nombre_p.isEmpty() && !direccion_p.isEmpty() && telefono_p>0 && 
                !email_p.isEmpty() && genero_p.isEmpty()) {
            
            Persona per=controladorPersona.guardar(id_c, nombre_p, direccion_p, telefono_p, email_p, genero_p);
            Empleado emp= new Empleado(per);
            
            int retorno = daoEmpleado.editar(emp);
            return retorno;
        } else {
            return -1;
        }
    }
    
    
}
