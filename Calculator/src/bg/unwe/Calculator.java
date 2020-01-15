package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x, y;
        String operator;
       
        Scanner s = new Scanner(System.in);
        
        System.out.print("First number: ");
        x = s.nextDouble();
        System.out.print("Second number: ");
        y = s.nextDouble();
        System.out.print("Operator: ");
        operator = s.next();
        
        System.out.print("Result: ");
        
        switch(operator){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Division by zero is not allowed");
                    
                }
                else {
                    System.out.println(x / y);
                }
                break;
            case "%":
                if(y == 0) {
                    System.out.println("Division by zero is not allowed");
                }
                else {
                    System.out.println(x % y);
                }
                break; 
            default:
                System.out.println("This operator is not supported");
                break;
        }
        
    }
    
}
