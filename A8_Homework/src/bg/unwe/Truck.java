/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author SNEJANA
 */
public class Truck extends Car{
    
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (this.weight > 2000) {
           return this.getRegularPrice()*0.90;
        }else{
           return this.getRegularPrice()*0.80;
        }
    }
    
}
