/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dao.DaoPersona;
import logica.Persona;

/**
 *
 * @author chokuno
 */
public class PersonaControlador {
    
    DaoPersona daoPersona;

    public PersonaControlador() {
        daoPersona = new DaoPersona();
    }
    
    public Persona guardar(int id_p,String nombre_p,String direccion_p,int telefono_p,
            String email_p,String genero_p) {
       
            
            Persona per = new Persona(id_p,nombre_p,direccion_p,telefono_p,email_p,
                    genero_p);
            
            daoPersona.guardar(per);
            return per;
        
        }
    

    public Persona consultar(int id_p) {
        Persona per;
        per = daoPersona.consultar(id_p);
        return per;
    }
    
    public Persona editar(int id_p,String nombre_p,String direccion_p,int telefono_p,
            String email_p,String genero_p) {
     
            
            Persona per = new Persona(id_p,nombre_p,direccion_p,telefono_p,email_p,
                    genero_p);
            
            daoPersona.editar(per);
            return per;
       
    }
}
