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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        Student student = new Student();
        
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Name: ");
            String name = s.nextLine();
            student.setName(name);
            System.out.print("Faculty number: ");
            name = s.nextLine();
            student.setFc(name);
            
            System.out.print("Course: ");
            name = s.nextLine();
            Course course = new Course();
            course.setName(name);
            
            
        }
    }
    
}
