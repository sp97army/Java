/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        
        Student student = new Student();
        
        System.out.print("Student:\nName= ");
        student.setName(s.nextLine());
        System.out.print("FN= ");
        student.setfNumber(s.nextLine());
        
        for (int i = 0; i < student.grades.length; i++) 
        {
            student.grades[i] = new Grade();
            
            System.out.printf("Grade %s:\n", (i+1));
            System.out.print("Name: ");
            student.grades[i].course.setName(s.nextLine());
            System.out.print("Value: ");
            student.grades[i].setValue(Double.parseDouble(s.nextLine())); 
            student.addGrade(student.grades[i], i);
        }
        
        
        
        System.out.printf("Student: Name= %s,FN= %s\n",student.getName(),student.getfNumber());
        
                for (int i = 0; i < student.getGradesCount(); i++)
        {
            System.out.printf("Grade %s: Course= %s, Value= %s\n", (i + 1),student.getGrade(i).course.getName(), student.getGrade(i).getValue());
        }
        
    }
}
