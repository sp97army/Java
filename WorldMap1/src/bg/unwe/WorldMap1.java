package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class WorldMap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double lat1, lat2, lon1, lon2;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Latitude 1: ");
        lat1 = s.nextDouble();
        System.out.print("Longitude 1: ");
        lon1 = s.nextDouble();
        System.out.print("Latitude 2: ");
        lat2 = s.nextDouble();
        System.out.print("Longitude 2: ");
        lon2 = s.nextDouble();
        
        System.out.printf("GPS 1: %f %f\n", lat1, lon1);
        System.out.printf("GPS 2: %f %f\n", lat2, lon2);       
        
        if (lat1 < lat2 && lon1 == lon2){
            System.out.println("NORTH");
        }
        if(lat1 > lat2 && lon1 == lon2){
            System.out.println("SOUTH");
        }
        if (lon2 < lon1 && lat1 == lat2){
            System.out.println("WEST");
        }
        if(lon2 > lon1 && lat1 == lat2){
            System.out.println("EAST");
        }
        if (lat2 > lat1 && lon1 < lon2){
            System.out.println("NORTHEAST");
        }
        if (lat2 < lat1 && lon1 < lon2){
            System.out.println("SOUTHEAST");
        }
        if (lat2 > lat1 && lon2 < lon1){
            System.out.println("NORTHWEST");
        }
        if (lat2 < lat1 && lon2 > lon1){
            System.out.println("SOUTHWEST");
        }
        if (lat1 == lat2 && lon1 == lon2){
            System.out.println("This is the same place");
        }
        
        
    }
    
}
