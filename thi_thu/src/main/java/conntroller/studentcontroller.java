/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conntroller;

import java.util.ArrayList;
import java.util.Scanner;
import model.enrroll;
import model.students;
import uutils.inputter;
import views.StudentView;
import views.menu;

/**
 *
 * @author trieu
 */
public class studentcontroller extends menu{
    private ArrayList<students> liststudent;
    private inputter input;
    private StudentView view;
    private Scanner sc;

    public studentcontroller() {
        super("controller student", new String[]{"addStudent", "displayStudent", "importSubjectFromFile","saveSubjectToFile"});
        liststudent = new ArrayList<>();
        input = new inputter();
        view = new StudentView();
        sc = new Scanner(System.in);

    }
    public void addStudent(){
        double id = input.getDouble("vao id: ");
        String firstN = input.getString("first name: ");
        String lastN = input.getString("last name: ");
        String phone = input.getString("so phone: ");
        if(phone.length() != 10 ){
            System.out.println("vui long nhap lai sdt 10 so!");
        }
        String address = input.getString("address: ");
        liststudent.add(new students(id, firstN, lastN, phone, address));
    }
    public void displayStudent(){
        view.display(liststudent);
    }
    public void importSubjectFromFile(){
        
    }
    public void saveSubjectToFile(){
        
    }
    @Override
    public void toiyeuem(int n) {
        switch (n) {
            case 1:
                addStudent();
                break;
            case 2:
                displayStudent();
                break;
            case 3:
                importSubjectFromFile();
                break;
            case 4:
                saveSubjectToFile();
                break;
            default:
                System.out.println("xin chao va hen gap lai");
        }
    }    
}
