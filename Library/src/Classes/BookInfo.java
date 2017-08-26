/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.*;

/**
 *
 * @author jncor
 */
public class BookInfo
{
    private String isbn;
    private String title;
    private Author author = new Author();
    private BookType type = new BookType();
    private String summary;
    private String length;
    private String alternateTitles;
    private String yearReleased;
    private String publicationInfo;
    
    BookInfo(String isbn) throws SQLException
    {
        this.isbn = isbn;
        GetBookInfo();
    }
    
    public String getISBN() { return isbn; }
    public String getTitle() { return title; }
    public Author getAuthor() { return author; }
    public BookType getBookType() { return type; }
    public String getSummary() { return summary; }
    public String getLength() { return length; }
    public String getAlternateTitles() { return alternateTitles; }
    public String getYearReleased() { return yearReleased; }
    public String getPublicationInfo() { return publicationInfo; }
    
    public void GetBookInfo() throws SQLException
    {
        String sqlStatement = "select * from bookinfo where isbn='" + this.isbn + "';";
        ResultSet bookInfo = Database.ExecuteQuery(sqlStatement);
        
        this.title = bookInfo.getString("title");
        this.author.setFirstName(null);
        this.author.setLastName(null);
        //set booktype
        this.summary = bookInfo.getString("summary");
        this.length = bookInfo.getString("length");
        this.alternateTitles = bookInfo.getString("alternateTitle");
        this.yearReleased = bookInfo.getString("yearReleased");
        this.publicationInfo = bookInfo.getString("publicationInfo");
    }
}

