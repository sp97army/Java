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
public class Student {
    
    String name;
    ArrayList<Course> courses;

    public Student() {
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCourse(Course course){
        
        this.courses.add(course);
    }
    
    public Course getCourse(int index){
        
        return this.courses.get(index);
    }
    
    public int getCoursesCount(){
        
        return this.courses.size();
    }
}
