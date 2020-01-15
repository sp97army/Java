/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author SNEJANA
 */
public class Book {
    
    private String title;
    Author[] authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(int authorsCount) {
        
        this.authors = new Author[authorsCount];
    }
    public void addAuthor(Author authors, int index)
    {
        this.authors[index] = authors;
    }
    public Author getAuthor(int index)
    {
        return this.authors[index];
    }
    public int getAuthorsCount ()
    {
        return this.authors.length;
    }
}
