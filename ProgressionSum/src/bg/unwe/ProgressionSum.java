package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class ProgressionSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum,a1,d,n;
        
        System.out.print("Please enter the value of the first element: ");
        a1 = sc.nextInt();
        
        System.out.print("Please enter the value of the step: ");
        d = sc.nextInt();
        
        System.out.print("Please enter the number of the last element: ");
        n = sc.nextInt();
        
        sum = ((2*a1) + (n - 1)*d)/ 2 * n;
        
        System.out.println("The sum of the first " + n + " elements is " + sum);
        
    }
    
}
