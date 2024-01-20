package JForms.Pages;

import JForms.InsertInfo.InsertEmployeeInfo;
import JForms.ListsAndUpdates.donorList;
import JForms.ListsAndUpdates.employeeList;
import JForms.SearchPage.EmployeeSearchPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class employeePage extends javax.swing.JFrame {
    
    employeeList empList= new employeeList();
    /**
     * Creates new form employeePage
     */
    public employeePage() {
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

        jPanel1 = new javax.swing.JPanel();
        btn_NEWEMPLOYEE = new javax.swing.JButton();
        btn_EMPLOYEELIST = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(null);

        btn_NEWEMPLOYEE.setBackground(new java.awt.Color(255, 255, 255));
        btn_NEWEMPLOYEE.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btn_NEWEMPLOYEE.setText("NEW EMPLOYEE");
        btn_NEWEMPLOYEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NEWEMPLOYEEActionPerformed(evt);
            }
        });
        jPanel1.add(btn_NEWEMPLOYEE);
        btn_NEWEMPLOYEE.setBounds(64, 101, 163, 31);

        btn_EMPLOYEELIST.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        btn_EMPLOYEELIST.setText("EMPLOYEE LIST");
        btn_EMPLOYEELIST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EMPLOYEELISTActionPerformed(evt);
            }
        });
        jPanel1.add(btn_EMPLOYEELIST);
        btn_EMPLOYEELIST.setBounds(64, 192, 159, 31);

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(26, 24, 65, 29);

        jButton2.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(64, 279, 159, 31);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-5, -3, 300, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NEWEMPLOYEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NEWEMPLOYEEActionPerformed
        InsertEmployeeInfo window;
        window = new InsertEmployeeInfo();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_NEWEMPLOYEEActionPerformed

    private void btn_EMPLOYEELISTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EMPLOYEELISTActionPerformed
         JTable jTable1 = null;
        
        
        employeeList window;
        window = new employeeList();
        window.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_btn_EMPLOYEELISTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EmployeeSearchPage window;
        window = new  EmployeeSearchPage();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        derbInfo window;
        window = new derbInfo();
        window.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(employeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_EMPLOYEELIST;
    private javax.swing.JButton btn_NEWEMPLOYEE;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}