/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Student {
    String studentId;
    String  name;
    String  program;
    Double finalGrade;

    public Student(String studentId, String name, String program, Double finalGrade) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.finalGrade = finalGrade;
    }

   
    
    public void display(){
        System.out.println(studentId + " | " + name + " | " + program + " | " + finalGrade);
    }
}
