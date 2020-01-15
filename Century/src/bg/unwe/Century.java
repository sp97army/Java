package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Century {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Year: ");
        year = s.nextInt();
        
        if(year < 1901){
            System.out.println("Before 20th century");
        }
        else if (year >= 1901 && year < 2001){
            System.out.println("During 20th century");
        }
        else {
        System.out.println("After 20th Century");
    }
         
    }
    
}
