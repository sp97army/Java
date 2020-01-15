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
    private Author[] authors;
    private int nextIndex;

    public Book(int authorsCount ) {
        
        this.authors = new Author[authorsCount];
        this.nextIndex = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addAuthor(Author author){
        if (nextIndex == authors.length) {
            System.out.println("Error");
            return;
        }
        this.authors[nextIndex] = author;
        nextIndex++;
    }
    public Author getAuthor(int index){
        if (index < authors.length) {
            return this.authors[index];
        }
        return null;
    }
    public int getAuthorsCount(){
        return authors.length;
    }
}
