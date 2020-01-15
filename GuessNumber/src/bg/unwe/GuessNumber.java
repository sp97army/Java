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
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
  	
         int randomNumber = (int)(Math.random()*10);
	  	
         System.out.print("Your guess: ");  	
         int guess = s.nextInt();
	
         boolean hasGuessed = (randomNumber == guess);
         System.out.printf("Your guess is %b - it was %d!\n", 
                 hasGuessed, randomNumber);
    }
    
}
