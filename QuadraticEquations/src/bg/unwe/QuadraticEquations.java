package bg.unwe;

/**
 *
 * @author SNEJKA
 */
public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = 3;
        double b = 12.5;
        double c = 9;
        
        double discriminant = b*b - 4*a*c;
        
        double x1, x2;
        
        x1 = (-b - Math.sqrt(discriminant)) / (2*a);
        x2 = (-b + Math.sqrt(discriminant)) / (2*a);
        
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
    
}
