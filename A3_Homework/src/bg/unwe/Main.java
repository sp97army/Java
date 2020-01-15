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
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter numbers between 1 and 10");
        int[] array = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print("Number " +(i+1) + ": ");
            array[i] = sc.nextInt();
        }        
        
        System.out.println("Most popular element: " + findMostPopularElement(array));
    }
    public static int findMostPopularElement(int[] array){
    
        int mostpopular = array[0];
        int count = 1;
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            if (mostpopular == array[i]) {
                
                count++;
                count = result;
                result = array[i];
            }
        }
        return result;
}
    
}
