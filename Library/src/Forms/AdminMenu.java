/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author jncor
 */
public class AdminMenu extends javax.swing.JFrame
{
    private String userID;
    /**
     * Creates new form AdminMenu
     */
    public AdminMenu()
    {
        initComponents();
    }
    
    public AdminMenu(String userID)
    {
        initComponents();
        this.userID = userID;
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
        cmdBorrowBook = new javax.swing.JButton();
        cmdReturnBook = new javax.swing.JButton();
        cmdAddBook = new javax.swing.JButton();
        cmdViewBooks = new javax.swing.JButton();
        cmdPenaltyRecords = new javax.swing.JButton();
        cmdHolidayManagement = new javax.swing.JButton();
        cmdMessages = new javax.swing.JButton();
        cmdAccountManagement = new javax.swing.JButton();
        cmdReports = new javax.swing.JButton();
        cmdLogout = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBorrowBook.setText("Borrow Book");
        cmdBorrowBook.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdBorrowBook.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrowBookActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrowBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 50));

        cmdReturnBook.setText("Return Book");
        cmdReturnBook.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdReturnBook.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReturnBookActionPerformed(evt);
            }
        });
        jPanel1.add(cmdReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 130, 50));

        cmdAddBook.setText("Add Book");
        cmdAddBook.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdAddBook.setMinimumSize(new java.awt.Dimension(91, 24));
        jPanel1.add(cmdAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, 50));

        cmdViewBooks.setText("View Books");
        cmdViewBooks.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdViewBooks.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdViewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdViewBooksActionPerformed(evt);
            }
        });
        jPanel1.add(cmdViewBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 130, 50));

        cmdPenaltyRecords.setText("Penalty Records");
        cmdPenaltyRecords.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdPenaltyRecords.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdPenaltyRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPenaltyRecordsActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPenaltyRecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 50));

        cmdHolidayManagement.setLabel("<html>Holiday<br>Management</html>");
        cmdHolidayManagement.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdHolidayManagement.setMinimumSize(new java.awt.Dimension(91, 24));
        jPanel1.add(cmdHolidayManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 130, 50));

        cmdMessages.setText("Messages");
        cmdMessages.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdMessages.setMinimumSize(new java.awt.Dimension(91, 24));
        jPanel1.add(cmdMessages, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 50));

        cmdAccountManagement.setLabel("<html></center>Account<br>Management</center></html>");
        cmdAccountManagement.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdAccountManagement.setMinimumSize(new java.awt.Dimension(91, 24));
        jPanel1.add(cmdAccountManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 130, 50));
        cmdAccountManagement.getAccessibleContext().setAccessibleName("<html>Account<br>Management</html>");

        cmdReports.setText("Reports");
        cmdReports.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdReports.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReportsActionPerformed(evt);
            }
        });
        jPanel1.add(cmdReports, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, 50));

        cmdLogout.setText("Logout");
        cmdLogout.setMaximumSize(new java.awt.Dimension(91, 24));
        cmdLogout.setMinimumSize(new java.awt.Dimension(91, 24));
        cmdLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 130, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 310));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 470, 310));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdLogoutActionPerformed
    {//GEN-HEADEREND:event_cmdLogoutActionPerformed
        // TODO add your handling code here:
        Login form = new Login();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmdLogoutActionPerformed

    private void cmdReportsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdReportsActionPerformed
    {//GEN-HEADEREND:event_cmdReportsActionPerformed
        // TODO add your handling code here:
        Reports form = new Reports();
        form.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmdReportsActionPerformed

    private void cmdPenaltyRecordsActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdPenaltyRecordsActionPerformed
    {//GEN-HEADEREND:event_cmdPenaltyRecordsActionPerformed
        // TODO add your handling code here:
        //PenaltyRecords form = new PenaltyRecords();
        //form.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_cmdPenaltyRecordsActionPerformed

    private void cmdViewBooksActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdViewBooksActionPerformed
    {//GEN-HEADEREND:event_cmdViewBooksActionPerformed
        // TODO add your handling code here:
        LibraryBooks librarybooks = new LibraryBooks(this);
        librarybooks.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cmdViewBooksActionPerformed

    private void cmdBorrowBookActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdBorrowBookActionPerformed
    {//GEN-HEADEREND:event_cmdBorrowBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBorrowBookActionPerformed

    private void cmdReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReturnBookActionPerformed
        
    }//GEN-LAST:event_cmdReturnBookActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AdminMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AdminMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAccountManagement;
    private javax.swing.JButton cmdAddBook;
    private javax.swing.JButton cmdBorrowBook;
    private javax.swing.JButton cmdHolidayManagement;
    private javax.swing.JButton cmdLogout;
    private javax.swing.JButton cmdMessages;
    private javax.swing.JButton cmdPenaltyRecords;
    private javax.swing.JButton cmdReports;
    private javax.swing.JButton cmdReturnBook;
    private javax.swing.JButton cmdViewBooks;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
