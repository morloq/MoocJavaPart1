/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    public Library()
    {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook)
    {
        //ArrayList<Book> books = new ArrayList<Book>();
        books.add(newBook);
    }
    
    public void printBooks()
    {
        for(Book x : books)
        {
            System.out.println(x);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book x : books)
        {
            if(StringUtils.included(x.title(), title))
            {
                found.add(x);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book x : books)
        {
            if(StringUtils.included(x.publisher(), publisher))
            {
                found.add(x);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year)
    {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book x : books)
        {
            if(x.year() == year)
            {
                found.add(x);
            }
        }
        return found;
    }
    
    
}
