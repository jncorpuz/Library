/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Database;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jncor
 */
public class PenaltyRecord extends javax.swing.JFrame
{

    /**
     * Creates new form PenaltyRecord
     */
    private JFrame backFrame;
    public PenaltyRecord(JFrame backFrame)
    {
        this.backFrame = backFrame;
        initComponents();
        PopulateTable();
    }
    
    public PenaltyRecord()
    {
        initComponents();
    }
    
    private void PopulateTable()
    {
        try
        {
            String sqlStatement = "SELECT borrowinfo.id as 'Borrow ID', bookinfo.isbn as ISBN, bookinfo.title as Title, userdata.username as Username, borrowinfo.dueDate as 'Due Date' from borrowinfo, userdata, bookinfo where borrowinfo.bookISBN=bookinfo.isbn and borrowinfo.userID=userdata.id and borrowinfo.dueDate<CURRENT_DATE and NOT borrowinfo.returnDate=NULL;";
            Class.forName("com.mysql.jdbc.Driver");
            Connection dbCon = Database.DBConnection();
            Statement dbCom = dbCon.createStatement();
            ResultSet bookInfo = dbCom.executeQuery(sqlStatement);
            
            tblPenaltyRecords.setModel(DbUtils.resultSetToTableModel(bookInfo));
            
            dbCom.close();
            dbCon.close();
        } catch (SQLException | ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPenaltyRecords = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmdBack = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        tblPenaltyRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"1", "12435364734", "TheBird", null, "1", "4", "20"},
                {"2", "232", "Shimmer", null, null, null, null},
                {"3", null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String []
            {
                "UserID", "ISBN", "Title", "GenreID", "Length of Books", "Days OverDue:", "Amount"
            }
        ));
        tblPenaltyRecords.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblPenaltyRecordsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPenaltyRecords);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Penalty Records:");

        cmdBack.setText("Back");
        cmdBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmdBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBack, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblPenaltyRecordsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblPenaltyRecordsMouseClicked
    {//GEN-HEADEREND:event_tblPenaltyRecordsMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblPenaltyRecords.getModel();
        //get selected row index
        try
        {
            String borrowInfoID = tblPenaltyRecords.getValueAt(tblPenaltyRecords.getSelectedRow(), 0).toString();
            
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            String statement = "select dueDate, CURRENT_DATE from borrowinfo where id=" + borrowInfoID;
            Connection dbCon = Database.DBConnection();
            Statement dbCom = dbCon.createStatement();
            ResultSet result = dbCom.executeQuery(statement);
            if(result.isBeforeFirst())
            {
                result.next();
                String date = result.getString(1);
                String dateNow = result.getString(2);
                Date date1 = myFormat.parse(date);
                Date date2 = myFormat.parse(dateNow);
                long diff = date2.getTime() - date1.getTime();
                
                if(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)>0)
                {
                    long numofDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                    long amount = numofDays * 10;
                    
                    int message = JOptionPane.showConfirmDialog(null,"Pay the P" + amount + " Fine?","PenaltyRecord",JOptionPane.YES_NO_OPTION);
                    if(message == JOptionPane.YES_OPTION)
                    {
                        statement = "insert into penaltyrecords(borrowInfoID, amount) values('" + borrowInfoID + "', '" + amount + "');";
                        dbCom.execute(statement);
                    }
                }
            }
        }
        catch(HeadlessException | SQLException | ParseException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }
    }//GEN-LAST:event_tblPenaltyRecordsMouseClicked

    private void cmdBackActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmdBackActionPerformed
    {//GEN-HEADEREND:event_cmdBackActionPerformed
        
    }//GEN-LAST:event_cmdBackActionPerformed
    
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
            java.util.logging.Logger.getLogger(PenaltyRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(PenaltyRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(PenaltyRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PenaltyRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PenaltyRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBack;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPenaltyRecords;
    // End of variables declaration//GEN-END:variables
}
