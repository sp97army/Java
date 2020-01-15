package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class WindTurbine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double w , b; 
        
        System.out.print("Enter the wind speed (in m/s): ");
        w = sc.nextDouble();
        
        System.out.print("Enter the blade length (in m): ");
        b = sc.nextDouble();
        
        double WindTurbine = (((1.23/2) * (Math.PI * Math.pow(b, 2) * Math.pow(w, 3)))/ 1000000);
        
        System.out.println("The wind power is " + WindTurbine);
    }
    
}
