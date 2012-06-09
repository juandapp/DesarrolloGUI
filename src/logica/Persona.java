package logica;

/**
 *
 * @author juandrd
 */
public class Persona {

    int id_p;
    String nombre_p, direccion_p, telefono_p, email_p, genero_p;

    public Persona() {
    }

    public Persona(int id_p, String nombre_p, String direccion_p, String telefono_p,
            String email_p, String genero_p) {
        this.id_p = id_p;
        this.nombre_p = nombre_p;
        this.direccion_p = direccion_p;
        this.telefono_p = telefono_p;
        this.email_p = email_p;
        this.genero_p = genero_p;


    }

    public String getDireccion_p() {
        return direccion_p;
    }

    public String getGenero_p() {
        return genero_p;
    }

    public String getEmail_p() {
        return email_p;
    }

    public int getId_p() {
        return id_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getTelefono_p() {
        return telefono_p;
    }

    public void setDireccion_p(String direccion_p) {
        this.direccion_p = direccion_p;
    }

    public void setEmail_p(String email_p) {
        this.email_p = email_p;
    }

    public void setGenero_p(String genero_p) {
        this.genero_p = genero_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setTelefono_p(String telefono_p) {
        this.telefono_p = telefono_p;
    }
}