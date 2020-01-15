package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class CoffeeMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double change;
        
        System.out.print("Amount: ");
        double amount = s.nextDouble();
        
        System.out.print("1. short espresso\t0.50\n2. long espresso\t0.60\n"
                + "3. cappuccino\t0.85\n4. coffee with milk\t0.90\n5. "
                + "caffeine-free\t0.60\n");
        
        System.out.print("Your choice: ");
        int choice = s.nextInt();
        
        if (choice == 0 || choice > 5){
            System.out.println("Please select from the menu");
            return;
        }
        switch (choice){
            case 1: 
                if(amount < 0.50){
                System.out.println("Not enough money");
                return;
                }else if (amount == 0.50){
                System.out.println("Preparing your drink. . .");
                return;
                }else {
                change = amount - 0.50;
                System.out.println("Preparing your drink. . .");
                System.out.printf("Change: %.2f\n", change);
                return;
                }
            case 2: 
                if(amount < 0.60){
                System.out.println("Not enough money");   
                return;
                }else if (amount == 0.60){
                System.out.println("Preparing your drink. . ."); 
                return;
                }else {
                change = amount - 0.60;
                System.out.println("Preparing your drink. . .");
                System.out.printf("Change: %.2f\n", change);
                return;
                }
            case 3: 
                if(amount < 0.85){
                System.out.println("Not enough money");
                return;
                }else if (amount == 0.50){
                System.out.println("Preparing your drink. . .");
                return;
                }else {
                change = amount - 0.85;
                System.out.println("Preparing your drink. . .");
                System.out.printf("Change: %.2f\n", change);
                return;
                }
            case 4:
                if(amount < 0.90){
                System.out.println("Not enough money");  
                return;
                }else if (amount == 0.90){
                System.out.println("Preparing your drink. . ."); 
                return;
                }else {
                change = amount - 0.90;
                System.out.println("Preparing your drink. . .");
                System.out.printf("Change: %.2f\n", change);
                return;
                }
            case 5: 
                if(amount < 0.60){
                System.out.println("Not enough money");   
                return;
                }else if (amount == 0.60){
                System.out.println("Preparing your drink. . ."); 
                return;
                }else {
                change = amount - 0.60;
                System.out.println("Preparing your drink. . .");
                System.out.printf("Change: %.2f\n", change);
                return;
                }
        }
        }
        
        
        
    }
    

