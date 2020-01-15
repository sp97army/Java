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
public class Student extends StudentRecord {
    
   int studentId;
   StudentRecord studentRecord = new StudentRecord();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public StudentRecord getStudentRecord() {
        return studentRecord;
    }

    public void setStudentRecord(StudentRecord studentRecord) {
        this.studentRecord = studentRecord;
    }
   
}
