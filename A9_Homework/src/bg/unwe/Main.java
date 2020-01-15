/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;
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
        
        ArrayList<Book> books = new ArrayList<>(3);
        
         while(books.size() < 3){
            System.out.print("Enter new title or enter for break: ");
            String text = s.nextLine();
            
             if (text.length() > 0) {
                 Book book = new Book();
                 book.setTitle(text);
             
                 for (int i = 0; i < 2; i++) {

                 System.out.println("Enter new author or enter for break: ");     
                 System.out.print("Name: ");
                 String text1 = s.nextLine();
               
                     if (text1.length() > 0) { 
                         Author author = new Author();
                         author.setName(text1);
                         System.out.print("Country: ");
                         String text2 = s.nextLine();
                         Country country = new Country();
                         country.setName(text2);
                         author.setCountry(country); 
                         book.addAuthor(author);
                   
                }else{
                    break;
                  }
                 }  
                  books.add(book);
             }else{
                 break;
             }
                
         }
          
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);

            System.out.print("Book " + (i + 1) + ": Title= " + b.getTitle());

            for (int k = 0; k < b.getAuthorsCount(); k++) {
                Author a = b.getAuthor(k);

                System.out.print(", Author " + (k + 1) + ":[Name= " + a.getName() + ", Country= " + a.getCountry().getName() + "]");
               
            }

            System.out.println("");


        }
        
         
       

    }
}
