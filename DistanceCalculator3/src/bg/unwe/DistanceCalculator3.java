/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class DistanceCalculator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double speed, hours;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Speed (in km/h): ");
        speed = s.nextDouble();
        
        if (speed <= 0){
            System.out.println("Inalid speed");
            return;
        }
        if (speed > 100){
            System.out.println("You're driving too fast!");    
        }
        
        System.out.print("Duration (in hours): ");
        hours = s.nextDouble();
        
        if (hours <= 0){
            System.out.println("Invalid duration");
            return;
        }
        if (hours > 10){
            System.out.println("You need some rest!");
        }
        
        double distance = speed * hours;
        
        System.out.printf("Distance: %.2f km\n", distance);
    }
    
}
