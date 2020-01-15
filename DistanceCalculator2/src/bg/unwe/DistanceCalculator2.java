package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class DistanceCalculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);      
        
        System.out.print("Insert average speed: ");
        double speed = s.nextDouble();
        
        System.out.print("Insert how many hours you have travelled: ");
        double hours = s.nextDouble();
        
        double distance = speed * hours;
        
        System.out.println("The distance is " + distance + " km"); 
        
        
    }
    
}
