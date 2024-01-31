/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dealine;

import static dealine.time1.time1;
import java.util.Scanner;

/**
 *
 * @author XUAN HIEN
 */

class time1{
    public static String time1(String time){
        String[] timec = time.split(":");  // tách time thành hai chuỗi theo dấu ":"
        
        int hour = Integer.parseInt(timec[0]);
        int minutes = Integer.parseInt(timec[1]);// chuyển chuỗi thành số để thực hiện tính toán
        
        if(hour < 1 || hour >12 || minutes < 0 || minutes > 59)   return "no result";  // dữ liệu nhập vào sai trả về 
        float angle = (float) (Math.abs( 6*minutes - 0.5*(60*hour + minutes) )); //công thức tính góc giữa kim giờ và kim phút
        
        int numerator = (int) angle; //gán tử số bằng góc
        int denominator =180;   //gán mẫu số bằng 180 độ
        int gcd = 1;
        for (int i = 1;i<=Math.min(numerator, denominator); i++) {   //viết hàm tìm ước chung lớn nhất
            if ( numerator% i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = (int)numerator /gcd;
        denominator = (int)denominator/gcd;
        // rút gọn tử và mẫu cho ucln.
        String result;
        if (denominator == 1) {
            if(numerator == 1)  result = "pi";
            else result = Integer.toString(numerator)+"pi";   //kết quả nếu mẫu số bằng 1
        } else {
            if(numerator == 1) result = "pi/" + denominator;
            else   result = numerator + "pi/" + denominator;   //kết quả nếu mẫu số khác 1
        }

        return result; //trả về kết quả cuối cùng
    }
}
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next(); // nhập thời gian vào chuỗi
        System.out.println(time1(time));  // thực hiện gọi và in ra kết quả
    }
}
