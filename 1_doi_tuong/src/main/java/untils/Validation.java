/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package untils;

/**
 *
 * @author trieu
 */
public class Validation {

    public Validation() {
    }
    public boolean checkEmpty(String a){
        return a.isEmpty();//kiếm tra chuỗi rỗng
    }
   public boolean checkPositiveNumber(int n) {
        return n > 0;//kiểm tra số nguyên dương
    }
}
