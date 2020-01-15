package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class SaladMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many tomato slices do you want? ");
        int tomato_slices = sc.nextInt();
        
        System.out.print("How many cucumber slices do you want? ");
        int cucumber_slices = sc.nextInt();
        
        System.out.print("How much olive oil do you want ? (in ml) ");
        double quantity_olive_oil = sc.nextDouble();
        
        System.out.print("How much salt do you want? (in g) ");
        double grams_salt = sc.nextDouble();
        
        double weight = (tomato_slices * 30) + (cucumber_slices * 14) + (quantity_olive_oil * 1.2);
        
        System.out.printf("The salad contains %d tomato slices, %d cucumber slices, %.1fml olive oil and %.1fmg salt. The wight is %.2f\n",
                tomato_slices, cucumber_slices, quantity_olive_oil, grams_salt, weight);
        
        System.out.print("What's the target weight of the salad? ");
        double target_weight = sc.nextDouble();
        
        int difference_weight = (int) ((int) target_weight - weight);
        
        System.out.printf("You should put %d slices of tomato or %d slices of cucumber in the salad to reach the target weight of %.2f g.\n",
                difference_weight/30, difference_weight/14, target_weight);
    }
    
}
