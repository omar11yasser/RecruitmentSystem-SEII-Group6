/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job.recruitment.system.seii.group.pkg6;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Vacancy;
import job.recruitment.system.seii.group.pkg6.Utils.VacancyTableDatabasUtils;
import static job.recruitment.system.seii.group.pkg6.Utils.VacancyTableDatabasUtils.retrieveAllVacanciesOfACertainEmployer;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Omar
 */
public class ViewAllVacanciesByCertainEmployer extends javax.swing.JFrame {
    private ResultSet vacanciesResultSet;
    private void populateJTableUsingAllTheEmloyerVacancies(){
        try{
            vacanciesResultSet = retrieveAllVacanciesOfACertainEmployer("wejff");
            vacanciesJTable.setModel(DbUtils.resultSetToTableModel(vacanciesResultSet));
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public ViewAllVacanciesByCertainEmployer() {
        initComponents();
        populateJTableUsingAllTheEmloyerVacancies();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vacanciesJTable = new javax.swing.JTable();
        modifySelectedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        vacanciesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vacancy title", "vacancy requirments", "Vacancy deadline", "Vacancy status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vacanciesJTable);

        modifySelectedButton.setText("Modify selected vacancy");
        modifySelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifySelectedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifySelectedButton)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifySelectedButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifySelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifySelectedButtonActionPerformed
        int row = vacanciesJTable.getSelectedRow();
        String selectedVacancyId = vacanciesJTable.getModel().getValueAt(row, 0).toString();
        try {
            Vacancy vacancy = VacancyTableDatabasUtils.retieveFromVacancyUsingVacancyId("wejff");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_modifySelectedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAllVacanciesByCertainEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAllVacanciesByCertainEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAllVacanciesByCertainEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAllVacanciesByCertainEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAllVacanciesByCertainEmployer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifySelectedButton;
    private javax.swing.JTable vacanciesJTable;
    // End of variables declaration//GEN-END:variables
}
