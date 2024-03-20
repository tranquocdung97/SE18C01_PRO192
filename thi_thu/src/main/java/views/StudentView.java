/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.ArrayList;

/**
 *
 * @author trieu
 */
public class StudentView {
    public <T> void display(ArrayList<T> ArrayList){
        for(T x : ArrayList){
            System.out.println(x);
        }
    }
}
