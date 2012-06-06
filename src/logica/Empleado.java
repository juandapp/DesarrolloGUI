/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Empleado {
    String tipo_e, contrasena_e;
    int id_e;

    public Empleado() {
    }

    public int getId_e() {
        return id_e;
    }

    public String getTipo_e() {
        return tipo_e;
    }

    public String getContrasena_e() {
        return contrasena_e;
    }

    public void setContrasena_e(String contrasena_e) {
        this.contrasena_e = contrasena_e;
    }

    public void setTipo_e(String tipo_e) {
        this.tipo_e = tipo_e;
    }

    public void setId_e(int id_e) {
        this.id_e = id_e;
    }
    
    
}
