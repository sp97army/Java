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
    private String fNumber;
   
    Grade[] grades;

    public Student() {
        
        this.grades = new Grade[5];
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getfNumber() 
    {
        return fNumber;
    }

    public void setfNumber(String fNumber) 
    {
        this.fNumber = fNumber;
    }
    
    public void addGrade(Grade grades, int index)
    {
        this.grades[index] = grades;
    }
    public Grade getGrade(int index)
    {
        return this.grades[index];
    }
    public int getGradesCount()
    {
        return this.grades.length;
    }
}
