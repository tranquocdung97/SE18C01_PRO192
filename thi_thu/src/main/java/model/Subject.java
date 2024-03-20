/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author trieu
 */
public class Subject {
    private double id;
    private String Name;
    private String credits;
    private String professor;

    public Subject(double id, String Name, String credits, String professor) {
        this.id = id;
        this.Name = Name;
        this.credits = credits;
        this.professor = professor;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", Name=" + Name + ", credits=" + credits + ", professor=" + professor + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (Double.doubleToLongBits(this.id) != Double.doubleToLongBits(other.id)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.credits, other.credits)) {
            return false;
        }
        return Objects.equals(this.professor, other.professor);
    }
    
    
}
