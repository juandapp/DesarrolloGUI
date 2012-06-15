/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoPersona;
import java.util.LinkedList;
import logica.Persona;

/**
 *
 * @author juandapp
 */
public class PersonaControlador {

    DaoPersona daoPersona;

    public PersonaControlador() {
        daoPersona = new DaoPersona();
    }

    public int guardar(int id_p, String nombre_p, String direccion_p, String telefono_p, String email_p, String genero_p) {
        int retorno = 0;
        try {
            if (!String.valueOf(id_p).isEmpty() && !nombre_p.isEmpty() && !direccion_p.isEmpty() && !telefono_p.isEmpty() && !email_p.isEmpty() && !genero_p.isEmpty()) {
                int parsetel = Integer.parseInt(telefono_p);
                Persona persona = new Persona(id_p, nombre_p, direccion_p, telefono_p, email_p, genero_p);
                retorno = daoPersona.guardar(persona);

            }
        } catch (Exception e) {
            retorno = -1;
        }
        return retorno;
    }

    public LinkedList consultar(String id_p, String nombre) {
        LinkedList personasConsultados = new LinkedList();
        personasConsultados = daoPersona.consultar(id_p, nombre);
        return personasConsultados;
    }

    public Persona editar(int id_p, String nombre_p, String direccion_p, String telefono_p,
            String email_p, String genero_p) {
        Persona per = new Persona(id_p, nombre_p, direccion_p, telefono_p, email_p, genero_p);
        daoPersona.editar(per);
        return per;

    }
}
