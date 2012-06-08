/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controlador.AccesorioControlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import logica.Articulo;

/**
 *
 * @author juandapp
 */
public class JPAccesorio extends javax.swing.JPanel {

    /**
     * Creates new form JPCliente
     */
    AccesorioControlador accesorioControlador;

    public JPAccesorio() {
        initComponents();
        accesorioControlador = new AccesorioControlador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTFCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFCantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTPDescripcion = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jBLimpiarCrear = new javax.swing.JButton();
        jBCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTFCodigo1 = new javax.swing.JTextField();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTFCodigo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFNombre3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFCantidad1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTPDescripcion1 = new javax.swing.JTextPane();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Accesorio"));
        jPanel4.setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFCodigo.setColumns(20);
        jPanel1.add(jTFCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        jTFNombre.setColumns(20);
        jPanel1.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jTFCantidad.setColumns(20);
        jPanel1.add(jTFCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, -1));

        jScrollPane2.setViewportView(jTPDescripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 270, 72));

        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jBLimpiarCrear.setText("Limpiar");
        jBLimpiarCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiarCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 80, -1));

        jBCrear.setText("Crear");
        jBCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCrearActionPerformed(evt);
            }
        });
        jPanel1.add(jBCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, -1));

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(jBConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 90, -1));

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 470, 125));

        jLabel5.setText("Codigo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTFCodigo1.setColumns(20);
        jPanel2.add(jTFCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jTFNombre1.setColumns(20);
        jPanel2.add(jTFNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        jPanel3.add(jBModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 90, -1));

        jLabel7.setText("Codigo");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTFCodigo2.setColumns(20);
        jTFCodigo2.setEnabled(false);
        jPanel3.add(jTFCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel8.setText("Nombre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTFNombre3.setColumns(20);
        jPanel3.add(jTFNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel9.setText("Cantidad");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTFCantidad1.setColumns(20);
        jPanel3.add(jTFCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));

        jLabel15.setText("Descripcion");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jScrollPane3.setViewportView(jTPDescripcion1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 270, 72));

        jTabbedPane1.addTab("Modificar", jPanel3);

        jPanel4.add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 20, 524, 267);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int editar = -1;
        try {
            editar = accesorioControlador.editar(Integer.parseInt(jTFCodigo2.getText()),
                    jTFNombre3.getText(),
                    jTPDescripcion1.getText(),
                    Integer.parseInt(jTFCantidad1.getText()));
        } catch (Exception e) {
            System.out.print(e);
        }
        if (editar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo modificar el accesorio", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Accesorio modificado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            jTFCodigo1.setText(jTFCodigo2.getText());
            jBConsultar.doClick();
            jTabbedPane1.setSelectedIndex(1);
            limpiarCamposModificar();
        }
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBLimpiarCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCrearActionPerformed
        limpiarCamposCrear();
    }//GEN-LAST:event_jBLimpiarCrearActionPerformed

    private void jBCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCrearActionPerformed
        int guardar = -1;
        try {
            guardar = accesorioControlador.guardar(
                    Integer.parseInt(jTFCodigo.getText()),
                    jTFNombre.getText(),
                    jTPDescripcion.getText(),
                    Integer.parseInt(jTFCantidad.getText()));

        } catch (Exception e) {
        }

        if (guardar == -1) {
            JOptionPane.showMessageDialog(this, "No su pudo crear la Accesorio", "Error Base Datos", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Accesorio Creado correctamente", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
            jTFCodigo1.setText(jTFCodigo.getText());
            jBConsultar.doClick();
            jBLimpiarCrear.doClick();
            jTabbedPane1.setSelectedIndex(1);

        }


    }//GEN-LAST:event_jBCrearActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        Articulo consultar = null;
        try {
            consultar = accesorioControlador.consultar(Integer.parseInt(jTFCodigo1.getText()));
        } catch (Exception e) {
        }
        jTResultados.setModel(new DefaultTableModel(null, new String[]{"Codigo", "Nombre", "Descripcion", "Cantidad"}));
        if ((consultar != null) && (consultar.getCodigo_a() != 0)) {
            Object[][] s = new Object[1][4];
            s[0][0] = consultar.getCodigo_a();
            s[0][1] = consultar.getNombre();
            s[0][2] = consultar.getDescripcion();
            s[0][3] = consultar.getCantidad();



            TableModel myModel = new javax.swing.table.DefaultTableModel(s, new String[]{"Codigo", "Nombre", "Descripcion", "Cantidad"}) {

                boolean[] canEdit = new boolean[]{false, false, false, false
                };

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            };
            ///remover filas
            jTResultados.setModel(myModel);
            ///  jTResultados.setRowSorter(new TableRowSorter(myModel));
        }
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void limpiarCamposModificar() {
        jTFCantidad1.setText("");
        jTFCodigo2.setText("");
        jTFNombre3.setText("");
        jTPDescripcion1.setText("");
    }

    private void limpiarCamposCrear() {
        jTPDescripcion.setText("");
        jTFNombre.setText("");
        jTFCantidad.setText("");
        jTFCodigo.setText("");
    }

    private void jTResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTResultadosMouseClicked
        int selectedRow = jTResultados.getSelectedRow();
        jTFCodigo2.setText("" + jTResultados.getModel().getValueAt(selectedRow, 0));
        jTFNombre3.setText("" + jTResultados.getModel().getValueAt(selectedRow, 1));
        jTPDescripcion1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 2));
        jTFCantidad1.setText("" + jTResultados.getModel().getValueAt(selectedRow, 3));
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jTResultadosMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBLimpiarCrear;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFCantidad;
    private javax.swing.JTextField jTFCantidad1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCodigo1;
    private javax.swing.JTextField jTFCodigo2;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTextPane jTPDescripcion;
    private javax.swing.JTextPane jTPDescripcion1;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
