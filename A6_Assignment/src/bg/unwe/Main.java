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
    
    public static void main(String[] args){
        
    Scanner s = new Scanner(System.in);
    
    Book book = new Book(3);
    
        System.out.print("Book: ");
        book.setTitle(s.nextLine());
        for (int i = 0; i < book.authors.length; i++) {
            
            System.out.printf("Author %s:", (i+1));
            System.out.println("Name= ");
            book.addAuthor(s.nextLine(), i);
        }
    }
}
