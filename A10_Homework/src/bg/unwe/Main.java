/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SNEJANA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<>(5);
        
         while (students.size()< 5) {
            System.out.print("Enter name of the new student or enter for break: ");
            String text = s.nextLine();

            
            if (text.length() > 0) {
                Student student = new Student();
                student.setName(text);
                System.out.print("Enter Faculty Number: ");
                String text1 = s.nextLine();
                student.setFnumber(text1);     
                 
                for (int i = 0; i < 2; i++) {
                    System.out.println("Enter new grade or enter for break: ");
                    System.out.print("Course: ");
                    String text2 = s.nextLine();
                    
                    if (text2.length() > 0) {
                        Course course = new Course();
                        course.setName(text2);
                        Grade grade = new Grade();
                        grade.setCourse(course);
                        System.out.print("Value:");
                        double text3 = s.nextDouble();
                        grade.setValue(text3); 
                        student.addGrade(grade);
                        s.nextLine();
                    }
                    else {
                        break;
                    }
                     }
                
                students.add(student);
                
            }
        
            else {
                break;
            }
        }
        
        System.out.println("");

        for (int i = 0; i < students.size(); i++) {
            Student ss = students.get(i);

            System.out.print("Student " + (i + 1) + ": Name= " + ss.getName() + ",FN= " + ss.getFnumber());

            for (int k = 0; k < ss.getGradesCount(); k++) {
                Grade g = ss.getGrade(k);

                System.out.print(",Grade " + (k + 1) + ":[Course= " + g.getCourse().getName() + ",Value= " + g.getValue() + "]");
            }

            System.out.println("");
    }
    }
    
}
