/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author inf2065_usr
 */
public class PizzaMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("What type of pizza do you want?: ");       
        String pizzaType = s.next();
        
        System.out.print("Diameter (in cm): ");
        int pizzaDiameter = s.nextInt();
        
        System.out.print("How thick (in cm): ");
        int pizzaThickness = s.nextInt();
        
        System.out.print("Select topping #1: ");
        String topping1 = s.next();
        
        System.out.print("Select topping #2: ");
        String topping2 = s.next();
        
        System.out.print("How many slices? ");
        int slices = s.nextInt();
        
        System.out.printf("You have ordered a %d cm %s pizza, %d cm thick. It has %s and %s. It will be cut in %d slices. \n",
                     pizzaDiameter, pizzaType, pizzaThickness, topping1, topping2, slices);
        
        double volume = Math.PI*Math.pow(pizzaDiameter/2, 2)*pizzaThickness;
        
        System.out.printf("Volume of pizza with radius %d and height %d is %.2f cm3 \n",
        pizzaDiameter/2, pizzaThickness, volume);
    }
    
}
