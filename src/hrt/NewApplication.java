package hrt;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class NewApplication extends javax.swing.JFrame {

    public NewApplication() {
        initComponents();
    }
    
    public static void AddRowToTable(Object[] dataRow){
    DefaultTableModel model=(DefaultTableModel)tablicaEv.getModel();
    model.addRow(dataRow);
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gumbUpis = new javax.swing.JButton();
        gumbIzlaz = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablicaEv = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        gumbIsprazni = new javax.swing.JButton();
        gumbObrisi = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrt/HRT_logo.svg.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("EVIDENCIJA FILMOVA");

        gumbUpis.setText("UPIS FILMA");
        gumbUpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbUpisActionPerformed(evt);
            }
        });

        gumbIzlaz.setText("IZLAZ");
        gumbIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbIzlazActionPerformed(evt);
            }
        });

        jSeparator1.setSize(new java.awt.Dimension(50, 5));

        tablicaEv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ime filma", "Redatelj", "Godina", "Žanr"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablicaEv.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablicaEv.setShowGrid(false);
        jScrollPane1.setViewportView(tablicaEv);
        if (tablicaEv.getColumnModel().getColumnCount() > 0) {
            tablicaEv.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel3.setText("Pretraga: ");

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        gumbIsprazni.setText("ISPRAZNI TABLICU");
        gumbIsprazni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbIsprazniActionPerformed(evt);
            }
        });

        gumbObrisi.setText("OBRIŠI");
        gumbObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gumbObrisiActionPerformed(evt);
            }
        });
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(gumbIsprazni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(gumbObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gumbIzlaz, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gumbUpis, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(183, 183, 183)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gumbUpis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gumbIzlaz, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gumbIsprazni)
                    .addComponent(gumbObrisi))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gumbUpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumbUpisActionPerformed
        // TODO add your handling code here:
        upisFilma frameText=new upisFilma();
        frameText.setVisible(true);
        frameText.pack();
        frameText.setLocationRelativeTo(null);
        frameText.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_gumbUpisActionPerformed

    private void gumbIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumbIzlazActionPerformed
      Object[] options = { "Da", "Ne" };
     int response = JOptionPane.showOptionDialog(null, "Jeste li sigurni da želite izaći?", "Izlazak iz aplikacije", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
     if (response == 0){
         System.exit(0);
     }
    }//GEN-LAST:event_gumbIzlazActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void gumbObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumbObrisiActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table=(DefaultTableModel)tablicaEv.getModel();
        
        if(tablicaEv.getSelectedRowCount()==1){
            Object[] options = { "Da", "Ne" };
            int response = JOptionPane.showOptionDialog(null, "Jeste li sigurni da želite obrisati film?", "Brisanje filma", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            if (response == 0){
                table.removeRow(tablicaEv.getSelectedRow());
            }
        }
        else if(tablicaEv.getRowCount()==0){
            JOptionPane.showMessageDialog(this, "Nema podataka u tablici!");   
        }
        else{
            JOptionPane.showMessageDialog(this, "Niste odabrali koji film želite obrisati!");
        }
    }//GEN-LAST:event_gumbObrisiActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table=(DefaultTableModel)tablicaEv.getModel();
        String search=jTextField1.getText();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<> (table);
        tablicaEv.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + search));
    }//GEN-LAST:event_jTextField1KeyReleased

    private void gumbIsprazniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gumbIsprazniActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tablicaEv.getModel();
        Object[] options = { "Da", "Ne" };
        int response = JOptionPane.showOptionDialog(null, "Jeste li sigurni da želite obrisati cijelu tablicu?\nNapomena: svi uneseni podatci su spremljeni u datoteku \"Filmovi\"", "Brisanje tablice", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, options, options[0]);
        if (response == 0){
         model.setRowCount(0);
        }
    }//GEN-LAST:event_gumbIsprazniActionPerformed

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
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewApplication().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gumbIsprazni;
    private javax.swing.JButton gumbIzlaz;
    private javax.swing.JButton gumbObrisi;
    private javax.swing.JButton gumbUpis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuBar menuBar;
    private static javax.swing.JTable tablicaEv;
    // End of variables declaration//GEN-END:variables

}
