/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//import com.mysql.jdbc.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JNCorpuz
 */
public class Database
{
    //Local Connection Details
    //private static final String connectionStr = "jdbc:mysql://DESKTOP-B322RD1:3306/test?user=noel&password=Wve0Gb49tHt89QHB";
    //private static final String username = "noel";
    //private static final String password = "Wve0Gb49tHt89QHB";
    
    //Online Database Connection Details
    private static final String connectionStr = "jdbc:mysql://db4free.net:3306/libraryjava";
    private static final String username = "libraryjava";
    private static final String password = "x0zKfKOUuNzIWSwI";
    
    /**
     *
     * @param sqlStatement
     */
    public static void Insert(String sqlStatement)
    {
       try 
       {
           Connection dbCon = DriverManager.getConnection(connectionStr, username, password);
           Statement dbCom = dbCon.createStatement();

           dbCom.execute(sqlStatement);
           dbCom.close();
           dbCon.close();
       }
       catch (SQLException e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
       catch (Exception e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage());
       }
    }
}
