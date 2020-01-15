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
        
        ArrayList<Student> students = new ArrayList<>(3);
        
        while (students.size() < 3) {
            System.out.print("Student name: ");
            String name = s.nextLine();

            if (name.length() > 0) {
                Student student = new Student();
                student.setName(name);

                    for (int i = 0; i < 2; i++) {
                    
                        System.out.printf("Course %d: ", (i+1));
                        name = s.nextLine();
                        
                        if (name.length() > 0) {
                            Course course = new Course();
                            course.setName(name);
                            
                            System.out.print("Enter Course Teacher: ");
                            name = s.nextLine();
                            
                            if (name.length() > 0) {
                                Teacher teacher = new Teacher();
                                teacher.setName(name);
                                course.setTeacher(teacher);

                                for (int j = 0; j < 2; j++) {
                                                                    
                                System.out.printf("Enter Grade %d: ", (j+1));
                                double g = s.nextDouble();
                                
                                    Grade grade = new Grade();
                                    grade.setValue(g);
                                    course.addGrade(grade);
                                    s.nextLine();
                                }
                            }else{
                                break;
                            }
                            student.addCourse(course);
                        }else{
                             break;
                        }
                }
                    students.add(student);
            }else{
                break;
               }
        }

        System.out.println("");
        
        for (int i = 0; i < students.size(); i++) {
            Student ss = students.get(i);

            System.out.print("Student " + (i + 1) + ": Name= " + ss.getName() + ", Course:");

            for (int k = 0; k < ss.getCoursesCount(); k++) {
  
                Course c = ss.getCourse(k);
                
                System.out.print("[" + (k+1) + ":Name= " + c.getName() + ", Teacher= " + c.getTeacher().getName() + 
                        ", Grades= " + c.getGrade(0).getValue() + ", " + c.getGrade(1).getValue() + "],");
            }
           
         System.out.println("");
            
        }
    }
    
}
