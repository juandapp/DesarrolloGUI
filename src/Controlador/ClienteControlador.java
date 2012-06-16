/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoCliente;
import java.util.LinkedList;
import logica.Cliente;
import logica.Persona;

/**
 *
 * @author chokuno
 */
public class ClienteControlador {

    DaoCliente daoCliente;
    PersonaControlador controladorPersona;

    public ClienteControlador() {
        daoCliente = new DaoCliente();
        controladorPersona = new PersonaControlador();
    }

    public int guardar(int id_c, String nombre_c, String direccion_c, String telefono_c,
            String email_c, String genero_c) {
        int retorno = 0;
        
        if (!String.valueOf(id_c).isEmpty() && !nombre_c.isEmpty() && !direccion_c.isEmpty() && !telefono_c.isEmpty()
                && !email_c.isEmpty() && !genero_c.isEmpty() && !genero_c.equals("Seleccionar")) {
            
            Cliente cliente = new Cliente(new Persona(id_c, nombre_c, direccion_c, telefono_c, email_c, genero_c));
            retorno = daoCliente.guardar(cliente);
        } else {
            retorno = -1;
        }

        return retorno;
    }

    public LinkedList consultar(String id_p, String nombre) {
        LinkedList personasConsultados = new LinkedList();
        personasConsultados = daoCliente.consultar(id_p, nombre);
        return personasConsultados;
    }
    public int editar(int id_c, String nombre_c, String direccion_c, String telefono_c,
            String email_c, String genero_c) {
        int retorno = 0;
        if (!String.valueOf(id_c).isEmpty() && !nombre_c.isEmpty() && !direccion_c.isEmpty() && !telefono_c.isEmpty()
                && !email_c.isEmpty() && !genero_c.isEmpty() && !genero_c.equals("Seleccionar")) {
            Cliente cliente = new Cliente(new Persona(id_c, nombre_c, direccion_c, telefono_c, email_c, genero_c));
            retorno = daoCliente.editar(cliente);
        } else {
            retorno = -1;;
        }
        return retorno;
    }
}