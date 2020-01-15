package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class TriangleFace2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double a, c;
 
        System.out.print("Please enter A: ");
        a = scanner.nextDouble();
 
        System.out.print("Please enter C (hypotenuse): "); 
        c = scanner.nextDouble();

 
        double b = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
 
        double face = (a * b) / 2;

        System.out.println("The face of the triangle is " + face);
    }
    
}
