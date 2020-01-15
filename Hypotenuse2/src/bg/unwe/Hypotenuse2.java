package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class Hypotenuse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Please enter side A: ");
        int a = s.nextInt();
        System.out.println("Side A is " + a);
        
        System.out.print("Please enter side B: ");
        int b = s.nextInt();
        System.out.println("Side B is " + b);
        
        double c = Math.sqrt(a * a + b * b);
        System.out.println("The length of the hypotenuse is " + c);
        
    }
    
}
