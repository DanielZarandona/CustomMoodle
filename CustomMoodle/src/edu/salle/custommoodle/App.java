/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle;

import edu.salle.custommoodle.businesslogic.StudentBLO;
import edu.salle.custommoodle.model.Student;
import edu.salle.custommoodle.view.StudentWindow;
import java.util.List;

/**
 *
 * @author bedo9
 */
public class App {
    public static void main(String[] args) {
//        Student s1 = new Student("Alex","Cornejo");
//        Student s2 = new Student("Francisco","Perz");
//        Student s3 = new Student("Sofia","Enriquez");
//        Student s4 = new Student("Karol","Ji");
//        
//        
//        StudentBLO studentBLO = new StudentBLO();
//        studentBLO.save(s1);
//        studentBLO.save(s2);
//        studentBLO.save(s3);
//        studentBLO.save(s4);
//        
//        List<Student> studentList = studentBLO.findAll();
//        for (Student student : studentList) {
//            System.out.println(student);
//            
//        }
//        
//        System.out.println(s1);
//    }
    

  
    StudentWindow window = new StudentWindow();
    window.setVisible(true);
    }

}
