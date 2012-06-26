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
import java.io.File;

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
        
   JasperReport report=null;
   String destino="Reportes/";
   int contador=1;
        try{
         if(tipo.equals("reporteVentaRegistrada"))
         {  report = JasperCompileManager.compileReport(
          "Reportes/reporteVentaRegistrada.jrxml");
         destino+="reporteVentaRegistrada";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
         if(tipo.equals("reporteOrdenRegistrada"))
         {  report = JasperCompileManager.compileReport(
          "Reportes/reporteOrdenRegistrada.jrxml");
         destino+="reporteOrdenRegistrada";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
         if(tipo.equals("reporteUsuarios"))
         {  report = JasperCompileManager.compileReport(
          "Reportes/reporteUsuarios.jrxml");
         destino+="reporteUsuarios";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
         if(tipo.equals("reporteVentas"))
         {  report = JasperCompileManager.compileReport(
          "Reportes/reporteVentas.jrxml");
         destino+="reporteVentas";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
         if(tipo.equals("reporteClientes"))
         {  report = JasperCompileManager.compileReport(
          "Reportes/reporteClientes.jrxml");
         destino+="reporteClientes";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
         if(tipo.equals("reporteCotizacion"))
         { report = JasperCompileManager.compileReport(
          "Reportes/reporteCotizacion.jrxml");
         destino+="reporteCotizacion";
         while(new File(destino+contador+".pdf").exists())
             contador++;
         }
         
      JasperPrint print = JasperFillManager.fillReport(report, null, conn);
      // Exporta el informe a PDF
      JasperExportManager.exportReportToPdfFile(print,
          destino);
      //Para visualizar el pdf directamente desde java
      
      JasperViewer.viewReport(print, false);
     
        }
        catch(Exception ej){ej.printStackTrace();}
        fachada.cerrarConexion(conn);
    }
    
    
        
   

    
   
       
    
}
