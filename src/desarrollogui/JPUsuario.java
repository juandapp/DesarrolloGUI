/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desarrollogui;

/**
 *
 * @author juandapp
 */
public class JPUsuario extends javax.swing.JPanel {

    /**
     * Creates new form JPCliente
     */
    public JPUsuario() {
        initComponents();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCBGenero = new javax.swing.JComboBox();
        jTFFechaNacimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCBCargo = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jTFIdentificacion = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jLabel21 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTFIdentificacion1 = new javax.swing.JTextField();
        jBConsultar = new javax.swing.JButton();
        jTFNombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultados = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jCBCargo1 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTFNombre3 = new javax.swing.JTextField();
        jCBGenero2 = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTFFechaNacimiento2 = new javax.swing.JTextField();
        jTFTelefono2 = new javax.swing.JTextField();
        jTFDireccion2 = new javax.swing.JTextField();
        jTFEmail2 = new javax.swing.JTextField();
        jCBCargo2 = new javax.swing.JComboBox();
        jTFIdentificacion3 = new javax.swing.JTextField();
        jPFPassword1 = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jBModificar = new javax.swing.JButton();

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel5.setLayout(null);
        jPanel5.add(jLabel13);
        jLabel13.setBounds(18, 182, 0, 0);

        jPanel1.setLayout(null);

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 20, 57, 18);

        jTFNombre.setColumns(20);
        jPanel1.add(jTFNombre);
        jTFNombre.setBounds(170, 10, 270, 28);

        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 110, 64, 18);

        jLabel3.setText("Genero");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 50, 52, 18);

        jCBGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGenero.setName(""); // NOI18N
        jCBGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGeneroActionPerformed(evt);
            }
        });
        jPanel1.add(jCBGenero);
        jCBGenero.setBounds(170, 40, 119, 28);

        jTFFechaNacimiento.setColumns(20);
        jPanel1.add(jTFFechaNacimiento);
        jTFFechaNacimiento.setBounds(170, 70, 270, 28);

        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 80, 143, 18);

        jTFTelefono.setColumns(20);
        jPanel1.add(jTFTelefono);
        jTFTelefono.setBounds(170, 100, 270, 28);
        jPanel1.add(jLabel7);
        jLabel7.setBounds(12, 131, 0, 0);

        jTFDireccion.setColumns(20);
        jPanel1.add(jTFDireccion);
        jTFDireccion.setBounds(170, 130, 270, 28);

        jLabel8.setText("Direccion");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 140, 66, 18);

        jTFEmail.setColumns(20);
        jPanel1.add(jTFEmail);
        jTFEmail.setBounds(170, 160, 270, 28);

        jLabel9.setText("Email");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 170, 37, 18);

        jLabel15.setText("Cargo");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 200, 42, 18);

        jCBCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Gerente", "Jefe de Taller", "Vendedor" }));
        jCBCargo.setName(""); // NOI18N
        jCBCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jCBCargo);
        jCBCargo.setBounds(170, 190, 134, 28);

        jLabel20.setText("Identificacion");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(50, 240, 93, 18);

        jTFIdentificacion.setColumns(20);
        jPanel1.add(jTFIdentificacion);
        jTFIdentificacion.setBounds(170, 230, 270, 28);

        jPFPassword.setText("jPasswordField1");
        jPFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(jPFPassword);
        jPFPassword.setBounds(170, 260, 115, 28);

        jLabel21.setText("Password");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(50, 270, 68, 18);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jBLimpiar);
        jBLimpiar.setBounds(190, 300, 80, 30);

        jBCrear.setText("Crear");
        jPanel1.add(jBCrear);
        jBCrear.setBounds(330, 300, 100, 30);

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel2.setLayout(null);

        jLabel16.setText("Identificacion");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 20, 93, 18);

        jTFIdentificacion1.setColumns(20);
        jPanel2.add(jTFIdentificacion1);
        jTFIdentificacion1.setBounds(120, 10, 190, 28);

        jBConsultar.setText("Consultar");
        jPanel2.add(jBConsultar);
        jBConsultar.setBounds(320, 10, 90, 30);

        jTFNombre1.setColumns(20);
        jPanel2.add(jTFNombre1);
        jTFNombre1.setBounds(120, 40, 190, 28);

        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 50, 57, 18);

        jTResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Direccion", "Telefono", "Email", "Genero", "Cargo", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTResultados);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 530, 125);

        jLabel22.setText("Cargo");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(20, 80, 42, 18);

        jCBCargo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Gerente", "Jefe de Taller", "Vendedor" }));
        jCBCargo1.setName(""); // NOI18N
        jCBCargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCargo1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCBCargo1);
        jCBCargo1.setBounds(120, 70, 134, 28);

        jTabbedPane1.addTab("Consultar", jPanel2);

        jPanel3.setLayout(null);

        jLabel23.setText("Nombre");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(50, 20, 57, 18);

        jTFNombre3.setColumns(20);
        jPanel3.add(jTFNombre3);
        jTFNombre3.setBounds(170, 10, 270, 28);

        jCBGenero2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Femenino", "Masculino" }));
        jCBGenero2.setName(""); // NOI18N
        jCBGenero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBGenero2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCBGenero2);
        jCBGenero2.setBounds(170, 40, 119, 28);

        jLabel24.setText("Genero");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(50, 50, 52, 18);

        jLabel25.setText("Fecha de nacimiento");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(20, 80, 143, 18);

        jTFFechaNacimiento2.setColumns(20);
        jPanel3.add(jTFFechaNacimiento2);
        jTFFechaNacimiento2.setBounds(170, 70, 270, 28);

        jTFTelefono2.setColumns(20);
        jPanel3.add(jTFTelefono2);
        jTFTelefono2.setBounds(170, 100, 270, 28);

        jTFDireccion2.setColumns(20);
        jPanel3.add(jTFDireccion2);
        jTFDireccion2.setBounds(170, 130, 270, 28);

        jTFEmail2.setColumns(20);
        jPanel3.add(jTFEmail2);
        jTFEmail2.setBounds(170, 160, 270, 28);

        jCBCargo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Gerente", "Jefe de Taller", "Vendedor" }));
        jCBCargo2.setName(""); // NOI18N
        jCBCargo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCargo2ActionPerformed(evt);
            }
        });
        jPanel3.add(jCBCargo2);
        jCBCargo2.setBounds(170, 190, 134, 28);

        jTFIdentificacion3.setColumns(20);
        jPanel3.add(jTFIdentificacion3);
        jTFIdentificacion3.setBounds(170, 230, 270, 28);

        jPFPassword1.setText("jPasswordField1");
        jPFPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFPassword1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPFPassword1);
        jPFPassword1.setBounds(170, 260, 115, 28);

        jLabel26.setText("Password");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(50, 270, 68, 18);

        jLabel27.setText("Identificacion");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(50, 240, 93, 18);

        jLabel28.setText("Cargo");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(50, 200, 42, 18);

        jLabel29.setText("Email");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(50, 170, 37, 18);

        jLabel30.setText("Direccion");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(50, 140, 66, 18);

        jLabel31.setText("Telefono");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(50, 110, 64, 18);

        jBModificar.setText("Modificar");
        jPanel3.add(jBModificar);
        jBModificar.setBounds(340, 290, 100, 30);

        jTabbedPane1.addTab("Modificar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGeneroActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jCBGeneroActionPerformed

    private void jCBCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCargoActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jCBCargoActionPerformed

    private void jPFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFPasswordActionPerformed

   }//GEN-LAST:event_jPFPasswordActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jCBCargo.setSelectedIndex(0);
        jCBGenero.setSelectedIndex(0);
        jPFPassword.setText("");
        jTFDireccion.setText("");
        jTFEmail.setText("");
        jTFFechaNacimiento.setText("");
        jTFIdentificacion.setText("");
        jTFNombre.setText("");
        jTFTelefono.setText("");
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jCBCargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCargo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCargo1ActionPerformed

    private void jCBGenero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBGenero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBGenero2ActionPerformed

    private void jCBCargo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCargo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBCargo2ActionPerformed

    private void jPFPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPFPassword1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBCrear;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JComboBox jCBCargo;
    private javax.swing.JComboBox jCBCargo1;
    private javax.swing.JComboBox jCBCargo2;
    private javax.swing.JComboBox jCBGenero;
    private javax.swing.JComboBox jCBGenero2;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPasswordField jPFPassword1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDireccion2;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFFechaNacimiento;
    private javax.swing.JTextField jTFFechaNacimiento2;
    private javax.swing.JTextField jTFIdentificacion;
    private javax.swing.JTextField jTFIdentificacion1;
    private javax.swing.JTextField jTFIdentificacion3;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombre1;
    private javax.swing.JTextField jTFNombre3;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFTelefono2;
    private javax.swing.JTable jTResultados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
