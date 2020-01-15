package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class ArithmeticProgression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int element,a1,d,n;
        
        System.out.print("Please enter the value of the first element: ");
        a1 = sc.nextInt();
        
        System.out.print("Please enter the value of the step: ");
        d = sc.nextInt();
        
        System.out.print("Please enter the number of the element you'd want to be calculated: ");
        n = sc.nextInt();
        
        element = a1 + (n - 1)*d;
        
        System.out.println("Element " + n + " is " + element);
        
        
    }
    
}
