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
    private static final String connectionStr = "jdbc:mysql://DESKTOP-B322RD1:3306/library?useSSL=false";
    private static final String username = "library";
    private static final String password = "Okja2017";
    
    //Online Database Connection Details
    //private static final String connectionStr = "jdbc:mysql://db4free.net:3306/libraryjava";
    //private static final String username = "libraryjava";
    //private static final String password = "x0zKfKOUuNzIWSwI";
    
    /**
     *
     * @param sqlStatement
     */
    public static void ExecuteStatement(String sqlStatement) //Insert, Update, Delete
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
    
    public static ResultSet ExecuteQuery(String sqlStatement) //Select
    {
        try 
        {
            Connection dbCon = DriverManager.getConnection(connectionStr, username, password);
            Statement dbCom = dbCon.createStatement();
            ResultSet sqlRecord = dbCom.executeQuery(sqlStatement);
            dbCom.close();
            dbCon.close();
           
            return sqlRecord;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }
    
    public static Connection DBConnection() throws SQLException
    {
        return DriverManager.getConnection(connectionStr, username, password);
    }
}
