/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanli;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hoan Hao", "HCM", "Nu", "15/04/2004");
        Teacher t2 = new Teacher("Nhu Nguyen", "Binh Dinh", "Nu", "07/10/2004");
        Teacher t3 = new Teacher("Thanh Nhan", "Binh Thuan", "Nu", "20/04/2004");
        TeacherManager t = new TeacherManager();
        t.addTeacher(t1, t2, t3);
        t.Menu();
    }
}
