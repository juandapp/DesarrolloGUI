package gui;

import Controlador.EmpleadoControlador;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import logica.Empleado;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author juandapp
 */
public class JPModificarDatosPersonales extends javax.swing.JPanel {

    /**
     * Creates new form JPModificarDatosPersonales
     */
          Empleado e;
    EmpleadoControlador empleadoControlador;
    
    public JPModificarDatosPersonales() {
        initComponents();
    }
    

    public JPModificarDatosPersonales(String usuario) {
        initComponents();
        empleadoControlador=new EmpleadoControlador();
        llenarCampos(usuario);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFEmail = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jBGuardar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Datos Personales"));
        jPanel1.setLayout(null);

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 30, 57, 18);

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 60, 64, 18);

        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 90, 66, 18);

        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 120, 37, 18);

        jLabel10.setText("Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 150, 68, 18);

        jTFNombre.setColumns(20);
        jTFNombre.setEnabled(false);
        jPanel1.add(jTFNombre);
        jTFNombre.setBounds(110, 30, 270, 28);

        jTFDireccion.setColumns(20);
        jPanel1.add(jTFDireccion);
        jTFDireccion.setBounds(110, 90, 270, 28);

        jTFTelefono.setColumns(20);
        jPanel1.add(jTFTelefono);
        jTFTelefono.setBounds(110, 60, 270, 28);

        jTFEmail.setColumns(20);
        jPanel1.add(jTFEmail);
        jTFEmail.setBounds(110, 120, 270, 28);

        jPFPassword.setText("jPasswordField1");
        jPanel1.add(jPFPassword);
        jPFPassword.setBounds(110, 150, 270, 28);

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBGuardar);
        jBGuardar.setBounds(278, 180, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
     int editar = -1;
        try {
            
            editar = empleadoControlador.editar(
                    e.getId_e().getId_p(),
                    e.getId_e().getNombre_p(), 
                    jTFDireccion.getText(),
                    jTFTelefono.getText(),
                    jTFEmail.getText(),
                    e.getId_e().getGenero_p(),
                    e.getTipo_e(),
                    jPFPassword.getText());
        } catch (Exception e) {
            System.out.print(e);
        }
        if (editar == -1) {
            JOptionPane.showMessageDialog(this, "No se pudieron modificar los datos", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);            
        }

    }//GEN-LAST:event_jBGuardarActionPerformed

    private void llenarCampos(String id_e){
        LinkedList consulta=new LinkedList();
        consulta=empleadoControlador.consultar(id_e, "", "");
        
        e=(Empleado)consulta.getFirst();
        jTFNombre.setText(e.getId_e().getNombre_p());
        jTFTelefono.setText(e.getId_e().getTelefono_p());
        jTFDireccion.setText(e.getId_e().getDireccion_p());
        jTFEmail.setText(e.getId_e().getEmail_p());
        jPFPassword.setText(e.getContrasena_e());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables

 
}
