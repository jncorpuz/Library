/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jncor
 */
public class Book extends BookInfo
{
    private String id;
    private Shelf shelf;
    private boolean isBorrowed;
    
    public Book(String bookISBN)
    {
        super(bookISBN);
    }
    
    
}
