/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progress_test;

/**
 *
 * @author FPTSHOP
 */

int gcd( int a, int b){
    if ( b==0 ){
         return a;
    } 
    return gcd(b,a%b);
}
String clockRadian(String time) {
    String[] parts = time.split(":");
    
    int hours = Integer.parseInt(parts[0]);
    int minutes = Integer.parseInt(parts[1]);

    double hourAngle = (hours % 12)* 30 + minutes* 0.5 ;
    double minuteAngle = minutes * 6;
    double angle = Math.abs(hourAngle - minuteAngle);
    if(angle>180) angle=360-angle;
    angle=angle*2;
    int gcd = gcd((int) angle, 180*2);
    int numerator = (int) (angle / gcd);
    int denominator = 180*2 / gcd;

    if( denominator == 1 ){
        if (numerator == 1) {
            return "pi";
        } 
        else {
            return numerator + "pi";
        }
    } else {
        if (numerator == 1) {
            return "pi/" + denominator;
        } 
        else {
            return numerator + "pi/" + denominator;
        }
    }
}
public class bai2 {
    public static void main(String[] args) {
        String time = "3:00" ;
        System.out.println("clockRadian(" + time + "): " + clockRadian(time));
        
}
