package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Average2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte first, second, third, fourth;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("First number: ");
        first = s.nextByte();
        System.out.print("Second number: ");
        second = s.nextByte();
        System.out.print("Third number: ");
        third = s.nextByte();
        System.out.print("Fourth number: ");
        fourth = s.nextByte();
        
        double average = (double) (first+second+third+fourth) / 4.0;
        System.out.printf("The average, calculated with whole number division is %.0f.\n", average);
        System.out.printf("The average, calculated with decimal number division is %.2f\n", average);
        
    }
    
}
