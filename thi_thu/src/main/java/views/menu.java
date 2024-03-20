/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;

/**
 *
 * @author trieu
 */
public abstract class menu {
    protected String tieude;
    protected  String[] danhsach;

    public menu(String td, String[] ds) {
        tieude = td;
        danhsach = ds;
    }
    
    public void display2(){
        System.out.println(tieude);
        for(int i=0;i < danhsach.length;i++){
            System.out.println((i+1)+"."+ danhsach[i]);
        }
    }
    
    public int luachon(){
        display2();
        Scanner sc = new Scanner(System.in);
        int n ;
        while (true) {            
            try {
                System.out.print("nhap vao lua chon: ");
                n = Integer.parseInt(sc.nextLine());//chuyển chuỗi thành số nguyen
                if(1 <= n && n <= danhsach.length){
                    return n;
                }
                else
                    System.out.println("nhap tu 1 toi "+danhsach.length);
            } catch (Exception e) {
                System.err.println("nhap lai so n");    
            }
        }
    }
    
    public abstract void toiyeuem(int n);
    
    public void run(){
        while (true) {            
            int as = luachon();
            toiyeuem(as);
            if(as == danhsach.length )
                break;
        }
    }
}
