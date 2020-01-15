package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJKA
 */
public class ConeVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        double volume,r,h;
        
        System.out.print("Enter the radius: ");
        r = sc.nextInt();
        
        System.out.print("Enter the height: ");
        h = sc.nextInt();
        
        volume = (1/3.0) * Math.PI * r * r * h;
        
        System.out.println("The volume of the cone is " + volume);
        
    }
    
}
