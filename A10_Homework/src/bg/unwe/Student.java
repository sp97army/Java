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
    
    private String name;
    private String fnumber;
    private ArrayList<Grade> grades;

    public Student() {
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFnumber() {
        return fnumber;
    }

    public void setFnumber(String fnumber) {
        this.fnumber = fnumber;
    }
    
    public void addGrade(Grade grade){
        this.grades.add(grade);
    }
    public Grade getGrade(int index){
        return this.grades.get(index);
    }
    public int getGradesCount(){
        return this.grades.size();
    }
}
