/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conntroller;

import java.util.ArrayList;
import views.menu;

/**
 *
 * @author trieu
 */
public class universitycontroller extends menu{
    private ArrayList<universitycontroller> listuniversitycontroller;
    private enrrolcontroller er;
    private subjectcontroller sub;
    private studentcontroller stu;

    public universitycontroller() {
        super("controller", new String[]{"enrrolcontroller", "studentcontroller", "subjectcontroller"});
        listuniversitycontroller = new ArrayList<>();
        er =new enrrolcontroller();
        sub = new subjectcontroller();
        stu = new studentcontroller();
    }
    
    
    @Override
    public void toiyeuem(int n) {
        switch (n) {
            case 1:
                er.run();
                break;
            case 2:
                stu.run();
                break;
            case 3:
                
                break;
            default:
                System.out.println("xin chao va hen gap lai");
        }
    }
    
    
}
