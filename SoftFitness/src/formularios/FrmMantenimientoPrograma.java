/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

/**
 *
 * @author Ariel
 */
public class FrmMantenimientoPrograma extends javax.swing.JFrame {

    /**
     * Creates new form FrmMantenimientoPrograma
     */
    public FrmMantenimientoPrograma() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfDescripcion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        bIngresar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAdministracion = new javax.swing.JMenu();
        miIngresar = new javax.swing.JMenuItem();
        miEditar = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenu();
        mSalir2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Fecha", "Hora", "Sala", "Capacidad", "Cupo", "Descripcion", "Estado", "Instructor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Programas de Entrenamiento Grupal");

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search-16.png"))); // NOI18N

        bEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496288871_x.png"))); // NOI18N
        bEliminar.setText("Eliminar");

        bIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/plus-16.png"))); // NOI18N
        bIngresar.setText("Ingresar");

        bEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496288689_create.png"))); // NOI18N
        bEditar.setText("Editar");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        mAdministracion.setText("Administracion");

        miIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496289174_group_full_add.png"))); // NOI18N
        miIngresar.setText("Ingresar");
        mAdministracion.add(miIngresar);

        miEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496301991_group_full_edit.png"))); // NOI18N
        miEditar.setText("Editar");
        mAdministracion.add(miEditar);

        miEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496302015_group_full_remove.png"))); // NOI18N
        miEliminar.setText("Eliminar");
        mAdministracion.add(miEliminar);

        jMenuBar1.add(mAdministracion);

        mSalir.setText("Salir");

        mSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1496288659_exit-to-app.png"))); // NOI18N
        mSalir.add(mSalir2);

        jMenuBar1.add(mSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfDescripcion)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bIngresar)
                        .addGap(73, 73, 73)
                        .addComponent(bEditar)
                        .addGap(73, 73, 73)
                        .addComponent(bEliminar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEliminar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bIngresar)
                        .addComponent(bEditar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMantenimientoPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMantenimientoPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bIngresar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu mAdministracion;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenuItem mSalir2;
    private javax.swing.JMenuItem miEditar;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miIngresar;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
