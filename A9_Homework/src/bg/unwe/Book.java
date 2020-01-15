/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;

/**
 *
 * @author SNEJANA
 */
public class Book {
    
    private String title;
    private ArrayList<Author> authors;
    
    public Book(){
        
        this.authors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void addAuthor(Author author){
        
        this.authors.add(author);
    }
    public Author getAuthor(int index){
        
      return  this.authors.get(index);
    }
    public int getAuthorsCount(){
        
        return this.authors.size();
    }
}
