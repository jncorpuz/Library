/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jncor
 */
public class Genre implements IDatabase
{
    private String id;
    private String name;
    
    Genre()
    {
        
    }
    
    Genre(String id)
    {
        this.id = id;
        GetData();
    }
    
    public String getID() { return id; }
    public void setID(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void GetData()
    {
        try
        {
        String sqlStatement = "select genreName from genre where id='" + this.id + "';";
        Connection dbCon = Database.DBConnection();
        Statement dbCom = dbCon.createStatement();
        ResultSet sqlRecord = dbCom.executeQuery(sqlStatement);
        
        this.name = sqlRecord.getString("genreName");
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
