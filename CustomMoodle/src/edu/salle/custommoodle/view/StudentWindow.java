/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.view;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;

/**
 *
 * @author bedo9
 */
public class StudentWindow extends javax.swing.JFrame {

    private StudentBLO studentBLO = new StudentBLO();
    
    /**
     * Creates new form StudentWindow
     */
    public StudentWindow() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        bSave = new javax.swing.JButton();
        bSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel2.setText("LastName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 120, -1));
        getContentPane().add(tfLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        bSave.setText("save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        getContentPane().add(bSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel3.setText("id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        String name = tfName.getText();
        String lastName = tfLastName.getText();
        Student student = new Student(name,lastName);
        studentBLO.save(student);
        tfName.setText("");
        tfLastName.setText("");
    }//GEN-LAST:event_bSaveActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
       String id = tfId.getText();
       Student student = studentBLO.find(id);
       if (student != null)
       {
           tfName.setText(student.getName());
           tfLastName.setText(student.getLastname());
       }
    }//GEN-LAST:event_bSearchActionPerformed

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
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
