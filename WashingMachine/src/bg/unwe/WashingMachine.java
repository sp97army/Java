package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class WashingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int programme,temperature, time;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Pick a programme: ");
        programme = s.nextInt();
        
        if(programme == 1){
            System.out.println("Temperature: 60 degrees, Time: 125 minutes");
            return;
        }
        if(programme == 2){
                System.out.println("Temperature: 90 degrees, Time: 106 minutes");
                return;
            }
        if(programme == 3){
                System.out.println("Temperature: 40 degrees, Time: 98 minutes");
                return;
            }
        if(programme == 4){
                System.out.println("Temperature: 50 degrees, Time: 65 minutes");
                return;
            }
        if(programme == 5){
                System.out.print("Desired temperature: ");
                temperature = s.nextInt();
                System.out.print("Desired time: ");
                time = s.nextInt();
                System.out.printf("Temperature: %d degrees, Time: %d minutes\n", temperature, time);
            
        }else{
            System.out.println("No such programme");
        }
        
        
    }
    
}
