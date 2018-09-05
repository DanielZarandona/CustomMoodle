/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.imple;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edu.salle.custommoodle.dataacces.StudentDAO;
import edu.salle.custommoodle.model.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bedo9
 */
public class StudentDAOListImple implements StudentDAO{

    private static List<Student> studentList = new ArrayList<>();
    
    
    
    
    @Override
    public Student save(Student student) {
       String id = Integer.toString(studentList.size()+1);
       student.setId(id);
       studentList.add(student);
       return student;
    }

    @Override
    public List<Student> findAll() {
       return studentList;
    }

    @Override
    public Student find(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)){
            return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findByLAstName(String name) { 
        List<Student> resstudentList = new ArrayList<>();
        name = name.toLowerCase().trim();
        Student res = null;
        for(Student student : studentList){
            if (student.getLastname().toLowerCase().contains(name) || student.getName().toLowerCase().contains(name)) {
                resstudentList.add(student);
            }
        }
        return resstudentList;
    }

    @Override
    public void Delete(Student student) {
        studentList.remove(student);
    }

    @Override
    public void Update(Student student) {
        int pos = studentList.indexOf(student);
        studentList.set(pos, student);
    }

    @Override
    public void load() {
        try{
          Gson gson = new Gson();
          BufferedReader br = new BufferedReader(new FileReader("students.json"));
          studentList = gson.fromJson(br, new TypeToken<List<Student>>(){}.getType());
          br.close();
            if (studentList == null) {
                studentList = new ArrayList<>();
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }

    @Override
    public void commitChages() {
        try{
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("students.json");
            writer.write(gson.toJson(studentList));
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
