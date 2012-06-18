/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author juandrd
 */
public class Vehiculo {

    int numerochasis_v;
    String linea_v, marca_v, color_v, modelo_v, cojineria_v;
    Boolean disponible_v;
    
    public Vehiculo(){}
    
    
    public Vehiculo(int numerochasis_v,String linea_v,String marca_v,String color_v
            ,String modelo_v,String cojineria_v,Boolean disponible_v) {
        this.numerochasis_v=numerochasis_v;
        this.linea_v=linea_v;
        this.marca_v=marca_v;
        this.color_v=color_v;
        this.modelo_v=modelo_v;
        this.cojineria_v=cojineria_v;
        this.disponible_v=disponible_v;
    }

    public String getCojineria_v() {
        return cojineria_v;
    }

    public String getColor_v() {
        return color_v;
    }

    public Boolean getDisponible_v() {
        return disponible_v;
    }

    public String getLinea_v() {
        return linea_v;
    }

    public String getMarca_v() {
        return marca_v;
    }

    public String getModelo_v() {
        return modelo_v;
    }

    public int getNumerochasis_v() {
        return numerochasis_v;
    }

    public void setCojineria_v(String cojineria_v) {
        this.cojineria_v = cojineria_v;
    }

    public void setColor_v(String color_v) {
        this.color_v = color_v;
    }

    public void setDisponible_v(Boolean disponible_v) {
        this.disponible_v = disponible_v;
    }

    public void setLinea_v(String linea_v) {
        this.linea_v = linea_v;
    }

    public void setMarca_v(String marca_v) {
        this.marca_v = marca_v;
    }

    public void setModelo_v(String modelo_v) {
        this.modelo_v = modelo_v;
    }

    public void setNumerochasis_v(int numerochasis_v) {
        this.numerochasis_v = numerochasis_v;
    }
    
    
    
}
