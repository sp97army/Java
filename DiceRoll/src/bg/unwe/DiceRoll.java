package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class DiceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
	
         int dice1 = (int)(Math.random()*1*6);
         int dice2 = (int)(Math.random()*1*6);
 	 int result = (int) (dice1 + dice2);
         
         System.out.print("Desired sum of two rolls: ");
         int guess = s.nextInt();
         
         boolean hasGuessed = (result == guess);
 	  	
         System.out.printf("First roll was %d, second roll was %d, the sum is %d\n", dice1, dice2,result);
         System.out.printf("Win : %b\n", hasGuessed);
    }
    
}
