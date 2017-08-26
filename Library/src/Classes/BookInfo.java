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
public class BookInfo implements IDatabase
{
    private String isbn;
    private String title;
    private Author author = new Author();
    private Genre genre = new Genre();
    private String summary;
    private String length;
    private String alternateTitles;
    private String yearReleased;
    private String publicationInfo;
    
    BookInfo(String isbn) throws SQLException
    {
        this.isbn = isbn;
        GetData();
    }
    
    public String getISBN() { return isbn; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public Genre getGenre() { return genre; }
    public String getSummary() { return summary; }
    public String getLength() { return length; }
    public String getAlternateTitles() { return alternateTitles; }
    public String getYearReleased() { return yearReleased; }
    public String getPublicationInfo() { return publicationInfo; }
    
    @Override
    public final void GetData()
    {
        try
        {
        String sqlStatement = "select * from bookinfo where isbn='" + this.isbn + "';";
        Connection dbCon = Database.DBConnection();
        Statement dbCom = dbCon.createStatement();
        ResultSet bookInfo = dbCom.executeQuery(sqlStatement);
        
        this.title = bookInfo.getString("title");
        this.author.setFirstName(null);
        this.author.setLastName(null);
        this.genre = new Genre(bookInfo.getString("genreID"));
        this.summary = bookInfo.getString("summary");
        this.length = bookInfo.getString("length");
        this.alternateTitles = bookInfo.getString("alternateTitle");
        this.yearReleased = bookInfo.getString("yearReleased");
        this.publicationInfo = bookInfo.getString("publicationInfo");
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

