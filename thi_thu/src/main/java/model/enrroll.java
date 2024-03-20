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
public class enrroll {
    private String enrrolID;
    private String studentID;
    private String subjectID;

    public enrroll(String enrrolID, String studentID, String subjectID) {
        this.enrrolID = enrrolID;
        this.studentID = studentID;
        this.subjectID = subjectID;
    }

    public String getEnrrolID() {
        return enrrolID;
    }

    public void setEnrrolID(String enrrolID) {
        this.enrrolID = enrrolID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
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
        final enrroll other = (enrroll) obj;
        if (!Objects.equals(this.enrrolID, other.enrrolID)) {
            return false;
        }
        if (!Objects.equals(this.studentID, other.studentID)) {
            return false;
        }
        return Objects.equals(this.subjectID, other.subjectID);
    }
    
    
}
