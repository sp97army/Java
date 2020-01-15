/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;

/**
 *
 * @author SNEJANA
 */
public class Course {
    
    private String name;
    private ArrayList<Student> students;

    public Course() {
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
