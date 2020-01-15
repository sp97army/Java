/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        Book book = new Book(3);
        
        System.out.print("Book: ");
        book.setTitle(s.nextLine());
        
        for (int i = 0; i < book.getAuthorsCount(); i++) {
            System.out.printf("Author %d: ", (i+1));
            System.out.print("Name: ");
            Author author = new Author();
            author.setName(s.nextLine());
            
            System.out.print("Country: ");
            Country country = new Country();
            country.setName(s.nextLine());
            author.setCountry(country);
            
            book.addAuthor(author);
            System.out.println();
        }
        System.out.println();
        System.out.printf("Book: %s\n", book.getTitle());
        
        for (int i = 0; i < book.getAuthorsCount(); i++) {
            
            System.out.printf("Author %d: Name= %s, Country= %s.\n", (i+1),book.getAuthor(i).getName(),
            book.getAuthor(i).getCountry().getName());
        }
    }
    
}
