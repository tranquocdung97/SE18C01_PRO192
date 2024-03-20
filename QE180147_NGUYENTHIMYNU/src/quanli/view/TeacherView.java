/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanli.view;

import java.util.ArrayList;
import quanli.model.Teacher;

public class TeacherView {
    public void displayList(ArrayList<Teacher> teachers){
        for (Teacher teacher : teachers) {
           System.out.println(teacher);
        }
    } 
}
