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
public class Student implements Person{
    
    String name;

    
    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public void setName(String name) {
         this.name = name;
    }
    
    
    
}
