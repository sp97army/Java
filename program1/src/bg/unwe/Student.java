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
public class Student {
    
    private String name;
    private String fc;
    private Course course;

    public Student() {
        this.course = new Course();
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }
    
    

}
