package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("The diameter of the sphere: ");
        double diameter = sc.nextDouble();
        
        double volume = ((4 / 3.0) * Math.PI * Math.pow(diameter/2, 3));
        
        System.out.printf("The volume of a sphere with diameter %.2f is %.4f\n" ,diameter,  volume);
        
        double s = 4 * Math.PI * Math.pow(diameter/2, 2);
        
        System.out.printf("The surface area is %.4f\n", s);
        
    }
    
}
