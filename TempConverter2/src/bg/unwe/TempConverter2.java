package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class TempConverter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double C; 
        System.out.print("Enter temperature in Celsius: ");
        C = sc.nextDouble();
        
        double F = (9 / 5.0 * C) + 32;
        System.out.println("Temperature in Fahrenheit is: " + F);
    }
    
}
