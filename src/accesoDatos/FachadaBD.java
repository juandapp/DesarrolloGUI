/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package accesoDatos;

/**
 *
 * @author Oswaldo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class FachadaBD {
        String url, usuario, password;
        Connection conexion;
        Statement instruccion;
        ResultSet tabla;
        public FachadaBD(){
//            url="jdbc:postgresql://pgsql:5432/juandapp";
//            usuario="juandapp";
//            password="juandapp";
//            
//            url="jdbc:postgresql://localhost:5432/proyectoDSI";
//            usuario="postgres";
//            password="JUANPAULO";
            
        }

        public Connection conectar(){
            try {
            // Se carga el driver
            Class.forName("org.postgresql.Driver");
            //System.out.println( "Driver Cargado" );
            } catch( Exception e ) {
                System.out.println( "No se pudo cargar el driver." );
            }

            try{
                     //Crear el objeto de conexion a la base de datos
                     conexion = DriverManager.getConnection(url, usuario, password);
                     System.out.println( "Conexion Abierta" );
                     return conexion;
                  //Crear objeto Statement para realizar queries a la base de datos
             } catch( Exception e ) {
                System.out.println( "No se pudo abrir la bd." );
                return null;
             }

        }//end connectar

        public void cerrarConexion(Connection c){
            try{
                 c.close();
            } catch( Exception e ) {
                System.out.println( "No se pudo cerrar." );
            }
        }
}