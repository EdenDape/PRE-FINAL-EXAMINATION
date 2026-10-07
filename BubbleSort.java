/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BubbleSort {
    public static void BubbleSort(Student[] students) {
        
        int n = students.length;
        
        for (int i = 0; i < students.length - 1;i ++) {
            for (int j = 0; j < - 1 - i; j ++) {
                
                if (students[j].finalGrade < students[j + 1].finalGrade){
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp; 
                    
                }
            }
        }        
    }
}
