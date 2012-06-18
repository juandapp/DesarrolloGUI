/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class C_compra_V {

    Cliente id_c;
    Vehiculo numerochasis_v;
    String tipo_pago;

    public C_compra_V() {
    }

    public C_compra_V(Cliente id_c, Vehiculo numerochasis_v, String tipo_pago) {
        this.id_c = id_c;
        this.numerochasis_v = numerochasis_v;
        this.tipo_pago = tipo_pago;
    }

    public Cliente getId_c() {
        return id_c;
    }

    public Vehiculo getNumerochasis_v() {
        return numerochasis_v;
    }

    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setId_c(Cliente id_c) {
        this.id_c = id_c;
    }

    public void setNumerochasis_v(Vehiculo numerochasis_v) {
        this.numerochasis_v = numerochasis_v;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }
}
