/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import desarrollogui.Ordenes.JPOrdenAlistamiento;
import desarrollogui.Ordenes.JPOrdenMantenimiento;
import desarrollogui.Ordenes.JPOrdenReparacion;
import desarrollogui.Reporte.JPReporte;
import desarrollogui.Ventas.JPCotizacion;
import desarrollogui.Ventas.JPVenta;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 *
 * @author juandapp
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jPPrincipal.setLayout(new FlowLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMInventario = new javax.swing.JMenu();
        jMICrearAccesorio = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMIVehiculo = new javax.swing.JMenuItem();
        jMOrdenesTrabajo = new javax.swing.JMenu();
        jMIOrdenAlistamiento = new javax.swing.JMenuItem();
        jMIOrdenReparacion = new javax.swing.JMenuItem();
        jMIOrdenMantenimiento = new javax.swing.JMenuItem();
        jMOpciones = new javax.swing.JMenu();
        jMIModificarDatosPersonales = new javax.swing.JMenuItem();
        jMICliente = new javax.swing.JMenuItem();
        jMICrearUsuario = new javax.swing.JMenuItem();
        jMVentas = new javax.swing.JMenu();
        jMICrearCotizacion = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMIRegistrarVenta = new javax.swing.JMenuItem();
        jMReportes = new javax.swing.JMenu();
        jMIGenerarReporte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPPrincipal.setLayout(null);

        jLabel1.setText("Principal");
        jPPrincipal.add(jLabel1);
        jLabel1.setBounds(280, 180, 59, 30);

        jMInventario.setText(" Inventario ");

        jMICrearAccesorio.setText("Accesorio");
        jMICrearAccesorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICrearAccesorioActionPerformed(evt);
            }
        });
        jMInventario.add(jMICrearAccesorio);
        jMInventario.add(jSeparator2);

        jMIVehiculo.setText("Vehiculo");
        jMIVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVehiculoActionPerformed(evt);
            }
        });
        jMInventario.add(jMIVehiculo);

        jMenuBar1.add(jMInventario);

        jMOrdenesTrabajo.setText(" Ordenes Trabajo  ");

        jMIOrdenAlistamiento.setText("Orden Alistamiento");
        jMIOrdenAlistamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOrdenAlistamientoActionPerformed(evt);
            }
        });
        jMOrdenesTrabajo.add(jMIOrdenAlistamiento);

        jMIOrdenReparacion.setText("Orden Reparacion");
        jMIOrdenReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOrdenReparacionActionPerformed(evt);
            }
        });
        jMOrdenesTrabajo.add(jMIOrdenReparacion);

        jMIOrdenMantenimiento.setText("Orden Mantenimiento");
        jMIOrdenMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOrdenMantenimientoActionPerformed(evt);
            }
        });
        jMOrdenesTrabajo.add(jMIOrdenMantenimiento);

        jMenuBar1.add(jMOrdenesTrabajo);

        jMOpciones.setText("Opciones  ");

        jMIModificarDatosPersonales.setText("Modificar Datos Personales");
        jMIModificarDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIModificarDatosPersonalesActionPerformed(evt);
            }
        });
        jMOpciones.add(jMIModificarDatosPersonales);

        jMICliente.setText("Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        jMOpciones.add(jMICliente);

        jMICrearUsuario.setText("Usuario");
        jMICrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICrearUsuarioActionPerformed(evt);
            }
        });
        jMOpciones.add(jMICrearUsuario);

        jMenuBar1.add(jMOpciones);

        jMVentas.setText(" Ventas  ");

        jMICrearCotizacion.setText("Crear Cotizacion");
        jMICrearCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICrearCotizacionActionPerformed(evt);
            }
        });
        jMVentas.add(jMICrearCotizacion);
        jMVentas.add(jSeparator3);

        jMIRegistrarVenta.setText("Registrar Venta");
        jMIRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegistrarVentaActionPerformed(evt);
            }
        });
        jMVentas.add(jMIRegistrarVenta);

        jMenuBar1.add(jMVentas);

        jMReportes.setText(" Reportes  ");

        jMIGenerarReporte.setText("Generar Reporte");
        jMIGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIGenerarReporteActionPerformed(evt);
            }
        });
        jMReportes.add(jMIGenerarReporte);

        jMenuBar1.add(jMReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        ///interfaz completa
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPCliente jPCC = new JPCliente();
        jPPrincipal.add(jPCC, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jMIOrdenAlistamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOrdenAlistamientoActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPOrdenAlistamiento jPOA = new JPOrdenAlistamiento();
        jPPrincipal.add(jPOA, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIOrdenAlistamientoActionPerformed

    private void jMIOrdenReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOrdenReparacionActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPOrdenReparacion jPOR = new JPOrdenReparacion();
        jPPrincipal.add(jPOR, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIOrdenReparacionActionPerformed

    private void jMIOrdenMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOrdenMantenimientoActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPOrdenMantenimiento jPOM = new JPOrdenMantenimiento();
        jPPrincipal.add(jPOM, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIOrdenMantenimientoActionPerformed

    private void jMICrearCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICrearCotizacionActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPCotizacion jPC = new JPCotizacion();
        jPPrincipal.add(jPC, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMICrearCotizacionActionPerformed

    private void jMIRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegistrarVentaActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPVenta jPV = new JPVenta();
        jPPrincipal.add(jPV, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIRegistrarVentaActionPerformed

    private void jMICrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICrearUsuarioActionPerformed
        ///interfaz completa
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPUsuario jPU = new JPUsuario();
        jPPrincipal.add(jPU, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMICrearUsuarioActionPerformed

    private void jMIGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIGenerarReporteActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPReporte jPR = new JPReporte();
        jPPrincipal.add(jPR, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIGenerarReporteActionPerformed

    private void jMIModificarDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIModificarDatosPersonalesActionPerformed
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPModificarDatosPersonales jPMDP = new JPModificarDatosPersonales();
        jPPrincipal.add(jPMDP, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIModificarDatosPersonalesActionPerformed

    private void jMIVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVehiculoActionPerformed
        ///interfaz completa
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPVehiculo jPV = new JPVehiculo();
        jPPrincipal.add(jPV, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMIVehiculoActionPerformed

    private void jMICrearAccesorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICrearAccesorioActionPerformed
        ///interfaz completa
        try {
            jPPrincipal.removeAll();
        } catch (Exception e) {
        }
        JPAccesorio jPCA = new JPAccesorio();
        jPPrincipal.add(jPCA, BorderLayout.CENTER);
        jPPrincipal.updateUI();
        this.pack();
    }//GEN-LAST:event_jMICrearAccesorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMICrearAccesorio;
    private javax.swing.JMenuItem jMICrearCotizacion;
    private javax.swing.JMenuItem jMICrearUsuario;
    private javax.swing.JMenuItem jMIGenerarReporte;
    private javax.swing.JMenuItem jMIModificarDatosPersonales;
    private javax.swing.JMenuItem jMIOrdenAlistamiento;
    private javax.swing.JMenuItem jMIOrdenMantenimiento;
    private javax.swing.JMenuItem jMIOrdenReparacion;
    private javax.swing.JMenuItem jMIRegistrarVenta;
    private javax.swing.JMenuItem jMIVehiculo;
    private javax.swing.JMenu jMInventario;
    private javax.swing.JMenu jMOpciones;
    private javax.swing.JMenu jMOrdenesTrabajo;
    private javax.swing.JMenu jMReportes;
    private javax.swing.JMenu jMVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}