/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanli.Application;

import java.io.IOException;
import quanli.controller.TeacherManager;
import quanli.model.Teacher;

public class Main {

    public static void main(String[] args) throws IOException {
        Teacher t1 = new Teacher("Hoan Hao", "HCM", "Nu", "15/04/2004","hao@gmail.com");
        Teacher t2 = new Teacher("Nhu Nguyen", "Binh Dinh", "Nu", "07/10/2004","nhu@gmail.com");
        Teacher t3 = new Teacher("Thanh Nhan", "Binh Thuan", "Nu", "20/04/2004","nhan@gmail.com");
        TeacherManager tea = new TeacherManager();
        tea.addTeacher(t1, t2, t3);
        tea.execute();
    }
}
