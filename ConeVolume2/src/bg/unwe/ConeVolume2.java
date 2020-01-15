package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class ConeVolume2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double radius, height, volume;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the radius: ");
        radius = s.nextDouble();
        
        if (radius > 0) {
            System.out.print("Enter the height: ");
            height = s.nextDouble();
            
            if (height > 0) { 
                volume = (1 / 3.0) * Math.PI * radius * radius * height;
                System.out.printf("The volume of the cone is %.2f\n", volume);
            
            } else {
                System.out.println("Height must be > 0");
            
            }
        }else {
                    System.out.println("Radius must be > 0");
         }
        
        }
        
    }