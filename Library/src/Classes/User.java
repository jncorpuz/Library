/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Forms.BorrowerMenu;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author jncor
 */
public class User extends Person
{
    private String id;
    private String username;
    private String password;
    private String userType;
    
    public User(String username)
    {
        this.username = username;
    }
    
    public String getID() { return id; }
    public void setID(String id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public int Login(String password)
    {
        int responseCode = 0; //Error
        try 
        {
            String sqlStatement = "select id, username, password, lastName, firstName, userType from userdata where username='" + username + "';";
            Connection dbCon = Database.DBConnection();
            Statement dbCom = dbCon.createStatement();
            ResultSet sqlRecord = dbCom.executeQuery(sqlStatement);
            
            if (sqlRecord.next())
            {
                this.id = sqlRecord.getString("id");
                this.password = sqlRecord.getString("password");
                this.setLastName(sqlRecord.getString("lastName"));
                this.setFirstName(sqlRecord.getString("firstName"));
                this.userType = sqlRecord.getString("userType");
                
                if (this.password.equals(password))
                {
                    if (this.userType.equals("admin"))
                    {
                        responseCode = 1; //Admin
                    }
                    if (this.userType.equals("borrower"))
                    {
                       responseCode = 2; //Borrower
                    }
                }
                else
                    responseCode = 3; //Wrong Password
            }
            else
                responseCode = 4; //User does not exist
            
            dbCom.close();
            dbCon.close();
            
            return responseCode;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return responseCode;
    }
}
