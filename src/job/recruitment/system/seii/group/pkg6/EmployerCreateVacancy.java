package job.recruitment.system.seii.group.pkg6;
import java.sql.SQLException;
import java.text.ParseException;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Employer;
import job.recruitment.system.seii.group.pkg6.Utils.TextUtils;
import job.recruitment.system.seii.group.pkg6.FunctionalityClasses.Vacancy;
import job.recruitment.system.seii.group.pkg6.Utils.VacancyTableDatabasUtils;

/**
 *
 * @author Omar
 */
public class EmployerCreateVacancy extends javax.swing.JFrame {

    Employer employer;
    public EmployerCreateVacancy() {
        initComponents();
        employer = new Employer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        vacancyTitleTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vacancyDeadlineTextField = new javax.swing.JTextField();
        vacancySubmitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        vacancyJobRequirmentsTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("Create new vacancy");

        vacancyTitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacancyTitleTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Vacancy title");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Vacancy deadline");

        vacancyDeadlineTextField.setText(" (yyyy/MM/dd)");
        vacancyDeadlineTextField.setToolTipText("");
        vacancyDeadlineTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacancyDeadlineTextFieldActionPerformed(evt);
            }
        });

        vacancySubmitButton.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        vacancySubmitButton.setText("Submit vacancy");
        vacancySubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vacancySubmitButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setText("Vacancy job requirments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(vacancySubmitButton)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68)
                        .addComponent(vacancyJobRequirmentsTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vacancyTitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addComponent(vacancyDeadlineTextField)))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vacancyTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vacancyDeadlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(vacancyJobRequirmentsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(vacancySubmitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vacancyTitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacancyTitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacancyTitleTextFieldActionPerformed

    private void vacancyDeadlineTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacancyDeadlineTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vacancyDeadlineTextFieldActionPerformed

    // Serves as onClickListener for the submit button.
    private void vacancySubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vacancySubmitButtonActionPerformed
        // Checks for the validity of the data entered by the user.
        if (!TextUtils.isEmpty(vacancyTitleTextField.getText()) && !TextUtils.isEmpty(vacancyJobRequirmentsTextField.getText())
                && !TextUtils.isEmpty(vacancyDeadlineTextField.getText())){
            // try - catch statment to insure the validity of the format of the date eneterd by the employer.
            try{
                long deadlineTimestamp = TextUtils.transformDateIntoALongTimestamp(vacancyDeadlineTextField.getText());
                //Create a new vacancy From the data the user entered.
                Vacancy vacancy = new Vacancy(vacancyTitleTextField.getText() , vacancyJobRequirmentsTextField.getText() , "wejff" , deadlineTimestamp); 
                //Generate ID and assign it and the state to the vacancy
                String vacancyId = "vacancy" + String.valueOf(System.currentTimeMillis());
                vacancy.setVacancyID(vacancyId);
                vacancy.setVacancyState("available");
                // insert the vacancy into the database.    
                try{
                    VacancyTableDatabasUtils.insertVacancyIntoDatabase(vacancy);
                } catch(SQLException e){
                    e.printStackTrace();
                }
            } catch(ParseException e){
                e.printStackTrace();
            }          
        }        
    }//GEN-LAST:event_vacancySubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployerCreateVacancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployerCreateVacancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployerCreateVacancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployerCreateVacancy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployerCreateVacancy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField vacancyDeadlineTextField;
    private javax.swing.JTextField vacancyJobRequirmentsTextField;
    private javax.swing.JButton vacancySubmitButton;
    private javax.swing.JTextField vacancyTitleTextField;
    // End of variables declaration//GEN-END:variables
}
