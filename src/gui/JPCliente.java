/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controlador.ClienteControlador;
import Controlador.PersonaControlador;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.Cliente;

/**
 *
 * @author juandapp
 */
public class JPCliente extends javax.swing.JPanel {

    /**
     * Creates new form JPCliente
     */
    ClienteControlador clienteControlador;
    PersonaControlador personaControlador;

    public JPCliente() {
        initComponents();
        clienteControlador = new ClienteControlador();             
                   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTFIdentificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBGenero = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jBLimpiarCrear = new javax.swing.JButton();
        jBCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTFIdentificacion1 = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jBLimpiarConsultar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTFIdentificacion2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFNombre2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCBGenero1 = new javax.swing.JComboBox();
        jTFTelefono1 = new javax.swing.JTextField();
        jTFDireccion1 = new javax.swing.JTextField();
        jTFEmail1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel5.setLayout(null);
        jPanel5.add(jLabel13);
        jLabel13.setBounds(18, 182, 0, 0);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel4.setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Identificacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTFIdentificacion.setColumns(20);
        jPanel1.add(jTFIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTFNombre.setColumns(20);
        jPanel1.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel2.setText("Genero");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jCBGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGenero.setName(""); // NOI18N
        jPanel1.add(jCBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jTFTelefono.setColumns(20);
        jPanel1.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jTFDireccion.setColumns(20);
        jPanel1.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTFEmail.setColumns(20);
        jPanel1.add(jTFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jBLimpiarCrear.setText("Limpiar");
        jBLimpiarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, -1));

        jBCrear.setText("Crear");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setText("Identificacion");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTFIdentificacion1.setColumns(20);
        jPanel2.add(jTFIdentificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 190, -1));

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 90, -1));

        jTFNombre1.setColumns(20);
        jPanel2.add(jTFNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, -1));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Direccion", "Telefono", "Email", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 480, 125));

        jBLimpiarConsultar.setText("Limpiar");
        jBLimpiarConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiarConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 90, -1));

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Identificacion");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTFIdentificacion2.setColumns(20);
        jTFIdentificacion2.setEnabled(false);
        jPanel3.add(jTFIdentificacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel10.setText("Nombre");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTFNombre2.setColumns(20);
        jPanel3.add(jTFNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel12.setText("Genero");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jCBGenero1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGenero1.setName(""); // NOI18N
        jPanel3.add(jCBGenero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jTFTelefono1.setColumns(20);
        jPanel3.add(jTFTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jTFDireccion1.setColumns(20);
        jPanel3.add(jTFDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jTFEmail1.setColumns(20);
        jPanel3.add(jTFEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        jLabel18.setText("Email");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel17.setText("Direccion");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel11.setText("Telefono");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        jPanel3.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 90, -1));

        jTabbedPane1.addTab("Modificar", jPanel3);

        jPanel4.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 500, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCrearActionPerformed
        limpiarCamposCrear();
    }//GEN-LAST:event_jBLimpiarCrearActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
         int editar = -1;
        try {
            Integer.parseInt(jTFTelefono1.getText());
            editar = clienteControlador.editar(Integer.parseInt(jTFIdentificacion2.getText()),
                    jTFNombre2.getText(),
                    jTFDireccion1.getText(),
                    jTFTelefono1.getText(),
                    jTFEmail1.getText(),
                    jCBGenero1.getSelectedItem().toString());
        } catch (Exception e) {
            System.out.print(e);
        }
        if (editar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo modificar el cliente", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente modificado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTFIdentificacion1.setText(jTFIdentificacion2.getText());
            jBConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposModificar();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        int guardar = -1;
        try {
            Integer.parseInt(jTFTelefono.getText());
            Integer.parseInt(jTFIdentificacion.getText());
            guardar = clienteControlador.guardar(
                    Integer.parseInt(jTFIdentificacion.getText()),
                    jTFNombre.getText(),
                    jTFDireccion.getText(),
                    jTFTelefono.getText(),
                    jTFEmail.getText(),
                    jCBGenero.getSelectedItem().toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println();
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear el cliente", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente Creado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            limpiarCamposConsultar();
            jTFIdentificacion1.setText(jTFIdentificacion.getText());
            jBConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposCrear();
        }



    }//GEN-LAST:event_jBCrearActionPerformed

    private void jBLimpiarConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarConsultarActionPerformed
        limpiarCamposConsultar();
        jBConsultar.doClick();
    }//GEN-LAST:event_jBLimpiarConsultarActionPerformed

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        int selectedRow = jTResultados.getSelectedRow();

        jTFIdentificacion2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTFNombre2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 1));
        jTFDireccion1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 2));
        jTFTelefono1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 3));
        jTFEmail1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 4));
        jCBGenero1.setSelectedItem("" + jTResultados.getModel().getValueAt(selectedRow, 5));
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jTResultadosMouseClicked

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        LinkedList consulta = new LinkedList();
        try {
            consulta = clienteControlador.consultar(jTFIdentificacion1.getText(), jTFNombre1.getText());
            Object[][] s = new Object[consulta.size()][6];
            for (int i = 0; i < consulta.size(); i++) {
                Cliente cliente = (Cliente) consulta.get(i);
                if (cliente.getId_c().getNombre_p() != null) {
                    s[i][0] = cliente.getId_c().getId_p();
                    s[i][1] = cliente.getId_c().getNombre_p();
                    s[i][2] = cliente.getId_c().getDireccion_p();
                    s[i][3] = cliente.getId_c().getTelefono_p();
                    s[i][4] = cliente.getId_c().getEmail_p();
                    s[i][5] = cliente.getId_c().getGenero_p();
                } else {
                    s = null;
                }
            }
            TableModel myModel = new javax.swing.table.DefaultTableModel(s, new String[]{"Identificacion", "Nombre",
                        "Direccion", "Telefono", "Email", "Genero"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false,false,false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            ///remover filas
            jTResultados.setModel(myModel);            
            jTResultados.setRowSorter(new TableRowSorter(myModel));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void limpiarCamposModificar() {
        jTFDireccion1.setText("");
        jTFEmail1.setText("");
        jTFIdentificacion2.setText("");
        jTFNombre2.setText("");
        jTFTelefono1.setText("");
        jCBGenero1.setSelectedIndex(0);
    }

    private void limpiarCamposCrear() {
        jTFDireccion.setText("");
        jTFEmail.setText("");
        jTFIdentificacion.setText("");
        jTFNombre.setText("");
        jTFTelefono.setText("");
        jCBGenero.setSelectedIndex(0);
    }

    private void limpiarCamposConsultar() {
        jTFIdentificacion1.setText("");
        jTFNombre1.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBLimpiarConsultar;
    private javax.swing.JButton jBLimpiarCrear;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox jCBGenero;
    private javax.swing.JComboBox jCBGenero1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDireccion1;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmail1;
    private javax.swing.JTextField jTFIdentificacion;
    private javax.swing.JTextField jTFIdentificacion1;
    private javax.swing.JTextField jTFIdentificacion2;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre2;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefono1;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
