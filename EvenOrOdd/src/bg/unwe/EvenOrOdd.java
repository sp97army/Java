package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        number = s.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("Result: even");
        
        }else {
            System.out.println("Result: odd2");
        }
    }
    
}
