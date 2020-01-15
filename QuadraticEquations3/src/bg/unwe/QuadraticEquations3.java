package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class QuadraticEquations3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b, c;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        a = s.nextInt();
        System.out.print("Enter B: ");
        b = s.nextInt();
        System.out.print("Enter C: ");
        c = s.nextInt();
        
        if(a == 0){
            System.out.println("a cannot be zero");
            return;
        }
        double d = b*b - 4*a*c;
        if(d < 0){
            System.out.println("No solution");
        }
        else if(d == 0){
            double x1 = -b / (2*a);
            System.out.printf(" x1 = %.2f\n" , x1);
        }else {
            double x1 = (-b - Math.sqrt(d)) / (2*a);
            double x2 = (-b + Math.sqrt(d)) / (2*a);
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
            
        }
    }
    
}
