/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoCliente;
import logica.Cliente;

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
        if (!String.valueOf(id_c).isEmpty() && !nombre_c.isEmpty() && !direccion_c.isEmpty() && !telefono_c.isEmpty()
                && !email_c.isEmpty() && !genero_c.isEmpty()) {
            int retorno = controladorPersona.guardar(id_c, nombre_c, direccion_c, telefono_c, email_c, genero_c);
            return retorno;
        } else {
            return -1;
        }
    }

    public Cliente consultar(int id_c) {
        Cliente cli;
        cli = daoCliente.consultar(id_c);
        return cli;
    }
//    public int editar(int id_c,String nombre_p,String direccion_p,String telefono_p,
//            String email_p,String genero_p) {
//        if (id_c > 0 && !nombre_p.isEmpty() && !direccion_p.isEmpty() && !telefono_p.isEmpty() && 
//                !email_p.isEmpty() && genero_p.isEmpty()) {
//            /*
//            Persona per=controladorPersona.guardar(id_c, nombre_p, direccion_p, telefono_p, email_p, genero_p);
//            Cliente cli= new Cliente(per);
//            */
//            //int retorno = daoCliente.editar(cli);
//            return retorno;
//        } else {
//            return -1;
//        }
//    }
}