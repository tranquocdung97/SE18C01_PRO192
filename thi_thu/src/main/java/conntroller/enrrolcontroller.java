    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conntroller;

import java.util.ArrayList;
import model.enrroll;
import uutils.inputter;
import views.enrrolview;
import views.menu;
/**
 *
 * @author trieu
 */
public class enrrolcontroller extends menu{
    private ArrayList<enrroll> listlecture;
    private inputter input;
    private enrrolview view;
    

    public enrrolcontroller() {
        super("controller enrrol", new String[]{"addEnrrolment", "displayEnrrolment", "saveSujectToFile"});
        listlecture = new ArrayList<>();
        input = new inputter();
        view = new enrrolview();
        

    }
    public void addEnrrolment(){
        
    }
    public void saveSubjectToFile(){
        
    }
    public void displayEnrrolment(){
        
    }
    @Override
    public void toiyeuem(int n) {
        switch (n) {
            case 1:
                addEnrrolment();
                break;
            case 2:
                displayEnrrolment();
                break;
            case 3:
                saveSubjectToFile();
                break;
            default:
                System.out.println("xin chao va hen gap lai");
        }
    }
}
