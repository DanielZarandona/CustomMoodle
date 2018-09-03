/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.salle.custommoodle.model;

/**
 *
 * @author bedo9
 */
public class Student {
    private String name;
    private String lastname;
    private String id;

    public Student(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("id=%s,\n name=%s,\n lastname=%s", id,name,lastname);
    }
    
    
            
}
