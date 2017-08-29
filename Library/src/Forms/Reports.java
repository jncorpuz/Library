/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jncor
 */
public class Reports extends javax.swing.JFrame
{
    private JFrame backForm;
    /**
     * Creates new form Reports
     */
    public Reports()
    {
        initComponents();
    }

    public Reports(JFrame backForm)
    {
        this.backForm = backForm;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel4 = new javax.swing.JLabel();
        cmdBorrowedBooks = new javax.swing.JButton();
        cmdPenaltyRecords = new javax.swing.JButton();
        cmdLendBook2 = new javax.swing.JButton();
        cmdLendBook3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        cmdBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Reports");

        cmdBorrowedBooks.setText("Borrowed Books");
        cmdBorrowedBooks.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdBorrowedBooks.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdBorrowedBooks.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdBorrowedBooksActionPerformed(evt);
            }
        });

        cmdPenaltyRecords.setText("Penalty Records");
        cmdPenaltyRecords.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdPenaltyRecords.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdPenaltyRecords.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdPenaltyRecordsActionPerformed(evt);
            }
        });

        cmdLendBook2.setText("Lend Book");
        cmdLendBook2.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdLendBook2.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdLendBook2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdLendBook2ActionPerformed(evt);
            }
        });

        cmdLendBook3.setText("Lend Book");
        cmdLendBook3.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdLendBook3.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdLendBook3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdLendBook3ActionPerformed(evt);
            }
        });

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tblReport);

        cmdBack.setText("Back");
        cmdBack.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdBack.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdPenaltyRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdLendBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdLendBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdPenaltyRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdLendBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdLendBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBorrowedBooksActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdBorrowedBooksActionPerformed
    {//GEN-HEADEREND:event_cmdBorrowedBooksActionPerformed
        // TODO add your handling code here:
        PopulateTable("SELECT bookinfo.isbn as ISBN, bookinfo.title as Title, userdata.username as Username, borrowinfo.borrowDate as 'Borrow Date', borrowinfo.dueDate as 'Due Date' from bookinfo, userdata, borrowinfo WHERE bookinfo.isbn=borrowinfo.bookISBN and userdata.id=borrowinfo.userID;");
        
    }//GEN-LAST:event_cmdBorrowedBooksActionPerformed

    private void PopulateTable(String sqlStatement)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection dbCon = Database.DBConnection();
            Statement dbCom = dbCon.createStatement();
            ResultSet bookInfo = dbCom.executeQuery(sqlStatement);
            
            tblReport.setModel(DbUtils.resultSetToTableModel(bookInfo));
            
            dbCom.close();
            dbCon.close();
        } catch (SQLException | ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    private void cmdPenaltyRecordsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdPenaltyRecordsActionPerformed
    {//GEN-HEADEREND:event_cmdPenaltyRecordsActionPerformed
        // TODO add your handling code here:
        PopulateTable("SELECT penaltyrecords.id as 'Penalty ID', borrowinfo.id as 'BorrowInfo ID', bookinfo.title as Title, userdata.username as Username, penaltyrecords.amount as Amount FROM penaltyrecords, borrowinfo, bookinfo, userdata WHERE penaltyrecords.borrowInfoID=borrowinfo.id AND borrowinfo.userID=userdata.id AND borrowinfo.bookISBN=bookinfo.isbn;");
    }//GEN-LAST:event_cmdPenaltyRecordsActionPerformed

    private void cmdLendBook2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdLendBook2ActionPerformed
    {//GEN-HEADEREND:event_cmdLendBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLendBook2ActionPerformed

    private void cmdLendBook3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdLendBook3ActionPerformed
    {//GEN-HEADEREND:event_cmdLendBook3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdLendBook3ActionPerformed

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdBackActionPerformed
    {//GEN-HEADEREND:event_cmdBackActionPerformed
        // TODO add your handling code here:
        CloseForm();
    }//GEN-LAST:event_cmdBackActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        // TODO add your handling code here:
        CloseForm();
    }//GEN-LAST:event_formWindowClosing
    
    private void CloseForm()
    {
        this.backForm.setVisible(true);
        this.dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBack;
    private javax.swing.JButton cmdBorrowedBooks;
    private javax.swing.JButton cmdLendBook2;
    private javax.swing.JButton cmdLendBook3;
    private javax.swing.JButton cmdPenaltyRecords;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReport;
    // End of variables declaration//GEN-END:variables
}
