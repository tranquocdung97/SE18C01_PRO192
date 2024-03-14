/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapDiemcong;

/**
 *
 * @author Ho Phi Hung
 */
import java.util.Scanner;

public class clockRadian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap thoi gian  (hh:mm): ");
        String time = scanner.nextLine();

        String result = clockRadian(time);
        System.out.println("Goc giua kim va phut : " + result);
    }

    public static String clockRadian(String time) {
        String[] parts = time.split(":"); // tach chuỗi ở giữa : thành 2 phần 
        int h = Integer.parseInt(parts[0]);  // đưa giờ thành 1 số nguyên là 1 chỗi 
        int phut = Integer.parseInt(parts[1]);

        if (h < 0 || phut < 0 || h > 12 || phut > 60) { //kiem tra   ??? 59 -- 60 __ 59:59 == 60  
            return "Nhap sai thoi gian ";
        }

        if (h == 12) {
            h = 0;
        }

        if (phut == 60) {
            phut = 0;
            h += 1;
            if (h > 12) {
                h -= 12;
            }
        }

        double hAngle = 0.5 * (h * 60 + phut);

        double phutAngle = 6 * phut;
        double angle = Math.abs(hAngle - phutAngle);
        angle = Math.min(360 - angle, angle);

        // Rút gọn góc về dạng phân số
        float pso = ucln((float) angle, 180);
        float tu = (float) (angle / pso);
        float mau = 180 / pso;

        if (tu == 1 && mau == 1) {
            return "pi";
        }  if (tu == 1) {
            return "pi/" +(int) mau;
        }  if (mau == 1) {
            return (int) tu + "pi";
        } else {
            return (int) tu + "pi/" + (int) mau;
        }
    }

    private static float ucln(float a, float b) {// UCLN sử dụng giải thuật Euclid
                
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b); 
    }

}

