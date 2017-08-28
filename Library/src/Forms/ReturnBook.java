/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author Koala
 */
import javax.swing.JFrame;
public class ReturnBook extends JFrame {

    /**
     * Creates new form ReturnBook
     */
    static JFrame backFrame;
    static String bookID,userID;
    public ReturnBook(JFrame a, String uID,String bID) {
        backFrame = a;
        bookID = bID;
        userID = uID;
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

        lblPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtISBN1 = new javax.swing.JTextField();
        cmdSearch = new javax.swing.JButton();
        lblDateBorrowed = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmdLend = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        txtReturnDate = new javax.swing.JTextField();
        cmdBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 210, 160));

        jLabel1.setText("ISBN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 30, 20));
        getContentPane().add(txtISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 110, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 470, 20));

        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 50, 20));

        txtISBN1.setEnabled(false);
        txtISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBN1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtISBN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 110, -1));

        cmdSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdSearch.setText("Search");
        getContentPane().add(cmdSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, 40));
        getContentPane().add(lblDateBorrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 80, 20));

        jLabel5.setText("Return Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 80, 20));

        jLabel6.setText("Date Borrowed:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 20));

        cmdLend.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdLend.setText("Return");
        getContentPane().add(cmdLend, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 110, 40));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 470, 10));

        txtReturnDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReturnDateActionPerformed(evt);
            }
        });
        getContentPane().add(txtReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 100, -1));

        cmdBack.setText("Back");
        cmdBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBN1ActionPerformed

    private void txtReturnDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReturnDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReturnDateActionPerformed

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackActionPerformed
        backFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cmdBackActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook(backFrame, userID, bookID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBack;
    private javax.swing.JButton cmdLend;
    private javax.swing.JButton cmdSearch;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDateBorrowed;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtISBN1;
    private javax.swing.JTextField txtReturnDate;
    // End of variables declaration//GEN-END:variables
}
