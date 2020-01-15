package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class AirConditioner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("External temp: ");
        double external = s.nextDouble();
        System.out.print("Internal temp: ");
        double internal = s.nextDouble();
        System.out.print("Desired temp: ");
        double desired = s.nextDouble();
        
        if(desired < internal && external > internal){
            System.out.println("MAX COLD MODE");
            return;
        }
        if(desired < internal && external <= internal){
            System.out.println("ENERGY SAVING COLD MODE");
            return;
        }
        if(desired > internal && external < internal){
            System.out.println("MAX WARM MODE");
            return;
        }
        if(desired > internal && external >= internal){
            System.out.println("ENERGY SAVING WARM MODE");
            return;
        }
        if(desired == internal){
            System.out.println("PAUSED");
            return;
        }
    }
    
}
