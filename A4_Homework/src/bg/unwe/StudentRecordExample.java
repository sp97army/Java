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
public class StudentRecordExample {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Student[] students = new Student[3];
        
        for (int i = 0; i < students.length; i++) 
        {
            students[i] = new Student();
        }
        for (int i = 0; i < students.length; i++) 
        {
            System.out.printf("Student %d : ", (i+1));
            System.out.println();
            System.out.print("ID : ");
            students[i].setStudentId(Integer.parseInt(sc.nextLine()));
            System.out.print("Name : ");
            students[i].setName(sc.nextLine());

            System.out.println("Grades = "); 
            System.out.print("Math : ");
            students[i].setMathGrade(Double.parseDouble(sc.nextLine()));
            System.out.print("English : ");
            students[i].setEnglishGrade(Double.parseDouble(sc.nextLine()));
            System.out.print("Science : ");
            students[i].setScienceGrade(Double.parseDouble(sc.nextLine()));
            System.out.println();
        }
        
        
        for (int i = 0; i < students.length; i++) {
            
            System.out.printf("Student %d: Id = %d, Name = %s, Grades = Math: %.2f, English: %.2f, Science: %.2f.\n", 
                    (i+1), students[i].getStudentId(), students[i].getName(), students[i].getMathGrade(), 
                    students[i].getEnglishGrade(), students[i].getScienceGrade());
        }
        
    }
}
