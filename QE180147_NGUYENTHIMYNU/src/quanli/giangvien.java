/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanli;



/**
 *
 * @author ASUS
 */
public class giangvien {
    private String fullname;
    private String hometown;
    private String gender;
    private String birthDate;
    
    public giangvien (){
    }
    public giangvien( String fullname, String hometown, String gender, String birthDate) {
        this.fullname = fullname;
        this.hometown = hometown;
        this.gender = gender;
        this.birthDate =birthDate;
    }
    public void show(){
        System.out.println("Ten giang vien "+this.fullname);
        System.out.println("Que quan"+this.hometown);
        System.out.println("gioi tinh "+this.gender);
        System.out.println("ngay sinh"+this.birthDate);
    }
    
    
         
}
