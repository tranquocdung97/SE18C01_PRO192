/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaitapDiemcong;

/**
 *
 * @author Ho Phi Hung
 */
import static BaitapDiemcong.clockRadian.clockRadian;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class clockHandAngle2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap goc (degree): ");
        int angle = scanner.nextInt();
        System.out.print("Nhap thoi gian  (hh:mm:ss): ");
        String timeNow = scanner.next();
        String result = clockHandAngle2(angle, timeNow);
        System.out.println("Thoi gian tiep theo co goc giua kim gio va phut la " + angle + " do: " + result);
    }

    public static String clockHandAngle2(int angle, String timeNow) {
        LocalTime time = LocalTime.parse(timeNow);
        while (true) {
            double hourAngle = time.getHour() % 12 * 30 + time.getMinute() * 0.5;
            double minuteAngle = time.getMinute() * 6;
            double diff = Math.abs(hourAngle - minuteAngle);
            diff = Math.min(diff, 360 - diff);
            if (Math.abs(diff - angle) < 0.5) {
                break;
            }
            time = time.plusMinutes(1);
        }
        return time.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }
}
