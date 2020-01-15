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
public class Hypotenuse3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
	  	
         System.out.print("Please enter side a: ");  	
         a = s.nextInt();
                 
         if(a <= 0){
             System.out.println("The side A cannot be less than or equal to zero");
             return;
         }
 
         System.out.print("Please enter side b: ");
         b = s.nextInt();

         if(b <= 0){
             System.out.println("The side B cannot be less than or equal to zero");
             return;
        }
        if(a == b){
            System.out.println("This is an isosceles triangle"); 
}
        
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("The length of the hypotenuse is %.2f\n", c);
}
    
    
}
