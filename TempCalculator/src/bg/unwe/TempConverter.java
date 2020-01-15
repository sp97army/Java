package bg.unwe;

/**
 *
 * @author SNEJKA
 */
public class TempConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double Fahrenheit = 98;
        System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
        
        double Celsius = 5 * ((Fahrenheit - 32) / 9);
        System.out.println("Temperature in Celsius is: " + Celsius);
    }
    
}
