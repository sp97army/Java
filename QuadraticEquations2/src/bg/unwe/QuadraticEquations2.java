package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class QuadraticEquations2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a,b,c;
        
        System.out.print("Enter a: ");
        a = sc.nextDouble();
        
        System.out.print("Enter b: ");
        b = sc.nextDouble();
        
        System.out.print("Enter c: ");
        c = sc.nextDouble();
        
        double discriminant = b*b - 4*a*c;
        
        double x1, x2;
        
        x1 = (-b - Math.sqrt(discriminant)) / (2*a);
        x2 = (-b + Math.sqrt(discriminant)) / (2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    
}
