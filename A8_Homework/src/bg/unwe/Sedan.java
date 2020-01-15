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
public class Sedan extends Car{
    
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (this.length > 20) {
           return this.getRegularPrice()*0.95;
        }else{
           return this.getRegularPrice()*0.90;
        }
    }
    
}
