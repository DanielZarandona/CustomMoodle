/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.businesslogic;

import edu.salle.custommoodle.dataacces.StudentDAO;
import edu.salle.custommoodle.imple.StudentDAOListImple;
import edu.salle.custommoodle.model.Student;
import java.util.List;

/**
 *
 * @author bedo9
 */
public class StudentBLO {
    
    private StudentDAO studentDAO;
    
    public StudentBLO()
    {
        studentDAO = new StudentDAOListImple();
    }
    
    public Student save(Student student)
    {
     return studentDAO.save(student);
    }
    
    public List<Student> findAll()
    {
        return  studentDAO.findAll();
    }
    
    public Student find(String id)
    {
        return studentDAO.find(id);
    }
    
    public List<Student> findByLAstName(String name){
        return studentDAO.findByLAstName(name);
    }
    
    public void Delete(Student student){
        studentDAO.Delete(student);
    }
    
    public void Update(Student student){
        studentDAO.Update(student);
    }
    
    public void load(){
        studentDAO.load();
    }
    
    public void commitChanges(){
        studentDAO.commitChages();
    }
}
