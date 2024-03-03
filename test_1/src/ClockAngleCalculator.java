
import java.util.Date;
import java.util.Scanner;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */


public class ClockAngleCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the hour (1-12): ");
        int hour = scanner.nextInt();

        System.out.print("Enter the minute (0-59): ");
        int minute = scanner.nextInt();

        
        double angle = calculateClockAngle(hour, minute);
        System.out.println("The angle between the hour and minute hands is: " + formatAngle(angle));
    }

    
    private static double calculateClockAngle(int hour, int minute) {
        
        hour = hour % 12;
        

        
        double angle = Math.abs(30 * hour - 11.0 / 2 * minute + 1.0 / 2 * minute);

        
        angle = Math.min(angle, 360 - angle);

        
        return Math.toRadians(angle);
    }

    
    private static String formatAngle(double angle) {
        
        int numerator = (int) (angle * 180 / Math.PI);
        int denominator = 180;

        
        int gcd = findGCD(numerator, denominator);

        
        numerator /= gcd;
        denominator /= gcd;

        
        if (denominator == 1) {
            return Integer.toString(numerator);
        } else {
            
            return numerator + "pi/" + denominator;
        }
    }

    
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

