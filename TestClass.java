/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class TestClass {
      public static void main(String[] args) {
        Student[] students = {
            new Student("SOO1", "Eden Dape", "BSIT", 98.5),
            new Student("SOO2", "Princes May Opano", "BSIT", 97.5),
            new Student("SOO3", "Shirra Brigole", "BSIT", 96.5),
            new Student("SOO4", "Anres Caitum", "BSIT", 95.0),
            new Student("SOO5", "Richard Julve", "BSIT", 94.0),
            new Student("SOO6", "Rafael Aragon", "BSIT", 93.0),
            new Student("SOO7", "Jezilmae Carangue", "BSIT", 92.5),
            new Student("SOO8", "Princess Claryze Joy Ignacio", "BSIT", 91.5)
        };
        
          System.out.println("==========STUDENTS BEFORE SORTING===========");
          for (Student s : students) { s.display();
    }
          
          System.out.println("========= STUDENTS AFTER SORTINGS ==========");
          for (Student s : students) { s.display();
          System.out.println("\n============== TOP 3 STUDENTS ===========");
          for(int i = 1; i <3; i++){
              students[i].display();
          }
        }
    }
}
