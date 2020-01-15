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
public class StudentExample {
    
    public static void main(String [] args){
        
        Scanner s = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        for (int i = 0; i < students.length; i++) {
            
            students[i] = new Student();
            
            System.out.printf("Student %d : ", (i+1));
            System.out.print("ID = ");
            students[i].setStudentId(Integer.parseInt(s.nextLine()));
            System.out.print("Name = ");
            students[i].setName(s.nextLine());
            System.out.println("Grades: ");
            System.out.print("Math = ");
            students[i].setMathGrade(Double.parseDouble(s.nextLine()));
            System.out.print("english = ");
            students[i].setEnglishGrade(Double.parseDouble(s.nextLine()));
            System.out.print("science = ");
            students[i].setScienceGrade(Double.parseDouble(s.nextLine()));
        }
        
        for (int i = 0; i < students.length; i++) {
            
            System.out.printf("Student %d: Id = %d , Name = %s , Grades = Math: %f, Enlish: %f, Science: %f \n",(i+1)
            , students[i].getStudentId(),students[i].getName(),students[i].getMathGrade(),
            students[i].getEnglishGrade(),students[i].getScienceGrade());
         
        }
        
    }
}
