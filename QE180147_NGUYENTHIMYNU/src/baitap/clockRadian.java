/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap;

import java.util.Scanner;

public class clockRadian {

    public static class clock {

        String time;

        void getInformation() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter time: ");
            time = sc.nextLine();
        }

        public clock() {
        }

        String clockRadian(String time) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            double hourAngle = (hours % 12 + minutes / 60.0) * 30;
            double minuteAngle = minutes * 6;
            double angle = Math.abs(hourAngle - minuteAngle);

            int gcd = gcd((int) angle, 180);
            int numerator = (int) (angle / gcd);
            int denominator = 180 / gcd;
             if(angle>180) angle=360-angle;
                angle=angle*2;
            if (denominator == 1) {
                if (numerator == 1) {
                    return "pi";
                } else {
                    return numerator + "pi";
                }
            } else {
                if (numerator == 1) {
                    return "pi/" + denominator;
                } else {
                    return numerator + "pi/" + denominator;
                }
            }
        }

        int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        void display() {
            System.out.println(clockRadian(time));
        }

        public static void main(String[] args) {
            clock s1 = new clock();
            s1.getInformation();
            s1.display();
        }
    }
}
