/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoEmpleado;
import java.util.LinkedList;
import logica.Cliente;
import logica.Empleado;
import logica.Persona;

/**
 *
 *
 * @author juandapp
 */
public class EmpleadoControlador {

    DaoEmpleado daoEmpleado;
    //PersonaControlador controladorPersona;

    public EmpleadoControlador() {
        daoEmpleado = new DaoEmpleado();
    }

    public int guardar(int id_e, String nombre_e, String direccion_e, String telefono_e,
            String email_e, String genero_e, String cargo_e, String contrasena_e) {

        int retorno = 0;

        if (!String.valueOf(id_e).isEmpty() && !nombre_e.isEmpty() && !direccion_e.isEmpty() && !telefono_e.isEmpty()
                && !email_e.isEmpty() && !genero_e.isEmpty() && !genero_e.equals("Seleccionar") && !cargo_e.isEmpty()
                && !cargo_e.equals("Seleccionar") && !contrasena_e.isEmpty()) {

            Empleado empleado = new Empleado(cargo_e, contrasena_e, new Persona(id_e, nombre_e, direccion_e, telefono_e, email_e, genero_e));
            retorno = daoEmpleado.guardar(empleado);
        } else {
            retorno = -1;
        }
        return retorno;
    }

    public LinkedList consultar(String id_e, String nombre_e, String cargo) {
        LinkedList empleadoConsultados = new LinkedList();
        empleadoConsultados = daoEmpleado.consultar(id_e, nombre_e, cargo);
        return empleadoConsultados;
    }

    public int editar(int id_e, String nombre_e, String direccion_e, String telefono_e,
            String email_e, String genero_e, String cargo_e, String contrasena_e) {
        int retorno = 0;
        if (!String.valueOf(id_e).isEmpty() && !nombre_e.isEmpty() && !direccion_e.isEmpty() && !telefono_e.isEmpty()
                && !email_e.isEmpty() && !genero_e.isEmpty() && !genero_e.equals("Seleccionar") && !cargo_e.isEmpty()
                && !cargo_e.equals("Seleccionar") && !contrasena_e.isEmpty()) {
            Empleado empleado = new Empleado(cargo_e, contrasena_e, new Persona(id_e, nombre_e, direccion_e, telefono_e, email_e, genero_e));
            retorno = daoEmpleado.guardar(empleado);
        } else {
            retorno = -1;
        }
        return retorno;
    }
}