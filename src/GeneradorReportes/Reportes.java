/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneradorReportes;

import java.sql.*;
import javax.swing.*;
import net.sf.jasperreports.engine.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.view.JasperViewer;
import accesoDatos.FachadaBD;

/**
 *
 * @author chokuno
 */
public class Reportes {
    FachadaBD fachada;
    
    public Reportes()
    {
    fachada = new FachadaBD();
    
    
    }
    
    
    public void generarReporte(String tipo){
    Connection conn=fachada.conectar();
        
   

        try{
         if(tipo.equals("reporteVentaRegistrada"))
    JasperReport report = JasperCompileManager.compileReport(
          "Reportes/reporteVentaRegistrada.jrxml");
         
         if(tipo.equals("reporteOrdenRegistrada"))
    JasperReport report = JasperCompileManager.compileReport(
          "Reportes/reporteOrdenRegistrada.jrxml");
         
         if(tipo.equals("reporteUsuarios"))
    JasperReport report = JasperCompileManager.compileReport(
          "Reportes/reporteUsuarios.jrxml");
         
         if(tipo.equals("reporteVentas"))
    JasperReport report = JasperCompileManager.compileReport(
          "Reportes/reporteVentas.jrxml");
         
         if(tipo.equals("reporteClientes"))
    JasperReport report = JasperCompileManager.compileReport(
          "Reportes/reporteClientes.jrxml");
         
      JasperPrint print = JasperFillManager.fillReport(report, null, conn);
      // Exporta el informe a PDF
      JasperExportManager.exportReportToPdfFile(print,
          "Reportes");
      //Para visualizar el pdf directamente desde java
      JasperViewer.viewReport(print, false);
     
        }
        catch(Exception ej){ej.printStackTrace();}
    }
    
    
        
   

    
   
       
    
}
