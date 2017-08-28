/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author jncor
 */
public class BookInfo implements IDatabase
{
    private String isbn;
    private String title;
    //private Author author = new Author();
    private String author;
    private Genre genre = new Genre();
    private String summary;
    private String length;
    private String alternateTitles;
    private String yearReleased;
    private String publicationInfo;
    private String imageLocation;
    
    public BookInfo(String isbn) throws SQLException
    {
        this.isbn = isbn;
        GetData();
    }
    
    public BookInfo()
    {
        
    }
    
    public String getISBN() { return isbn; }
    public String getTitle() { return title; }
    //public Author getAuthor() { return author; }
    public String getAuthor() { return author; }
    public Genre getGenre() { return genre; }
    public String getSummary() { return summary; }
    public String getLength() { return length; }
    public String getAlternateTitles() { return alternateTitles; }
    public String getYearReleased() { return yearReleased; }
    public String getPublicationInfo() { return publicationInfo; }
    public String getImageLocation() { return imageLocation; }
    
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
            //this.author.setFirstName(null);
            //this.author.setLastName(null);
            this.author = bookInfo.getString("author");
            this.genre = new Genre(bookInfo.getString("genreID"));
            this.summary = bookInfo.getString("summary");
            this.length = bookInfo.getString("length");
            this.alternateTitles = bookInfo.getString("alternateTitle");
            this.yearReleased = bookInfo.getString("publicationDate");
            this.publicationInfo = bookInfo.getString("publicationInfo");
            this.imageLocation = bookInfo.getString("imageLocation");
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

    /**
     *
     * @param isbn
     * @param title
     * @param author
     * @param genre
     * @return Table with searched data
     */
    public JTable SearchData(String isbn, String title, String author, String genre, String shelf) throws SQLException
    {

            String sqlStatement = "SELECT bookinfo.isbn, bookinfo.title, bookinfo.author, shelf.shelfName from bookinfo, shelf, genre where bookinfo.shelfID=shelf.id and bookinfo.genreID=genre.id and bookinfo.isbn like '%" + isbn + "%' and bookinfo.title like '%" + title + "%' and bookinfo.author like '%" + author + "%' and genre.genreName like '%" + genre + "%' and shelf.shelfName like '%" + shelf + "%';";
            Connection dbCon = Database.DBConnection();
            Statement dbCom = dbCon.createStatement();
            ResultSet bookInfo = dbCom.executeQuery(sqlStatement);

            JTable tblBook = new JTable();
            tblBook.setModel(DbUtils.resultSetToTableModel(bookInfo));
            dbCom.close();
            dbCon.close();
            
            return tblBook;
        

        
    }

    @Override
    public JTable SearchData()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

