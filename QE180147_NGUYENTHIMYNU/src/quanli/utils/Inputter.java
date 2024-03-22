/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanli.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import quanli.model.Teacher;

public class Inputter {

    static final String DATE_FORMAT = "dd/MM/yyyy";
    private Teacher t = new Teacher();

    public void input() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ho va ten: ");
        t.setFullname(sc.nextLine());
        System.out.print("Que quan: ");
        t.setHometown(sc.nextLine());
        while (true) {
            System.out.print("Gioi tinh (Nu/Nam) : ");
            t.setGender(sc.nextLine().toLowerCase());
            if (t.getGender().equals("nam") || t.getGender().equals("nu")) {
                break;
            } else {
                System.out.println("Khong hop le. Vui long nhap 'nam ' hoac 'nu'");
            }
        }
        System.out.print("Ngay thang nam sinh (DD/MM/YYYY):");
        while (true) {
            try {
                LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(DATE_FORMAT));
                t.setBirthDate(birthDate);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Nhap sai dinh dang ngay sinh");
                System.out.print("Nhap lai ngay sinh (DD/MM/YYYY): ");

            }
        }
        while (true) {
            System.out.print("Gmail:");
            t.setGmail(sc.nextLine());
            if (isValidGmail(t.getGmail())) {
                break;
            } else {
                System.out.println("Khong hop le. Vui long nhap lai gmail");
            }
        }
    }

    public static boolean isValidGmail(String email) {
        // Biểu thức chính quy để kiểm tra cú pháp Gmail
        String gmailPattern = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@gmail\\.com$";
        Pattern pattern = Pattern.compile(gmailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }

}
