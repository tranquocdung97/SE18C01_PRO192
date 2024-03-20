package quanli;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Teacher {
    static public int dem;

   
    private int id = ++dem;
    private String fullname;
    private String hometown;
    private String gender;
    private LocalDate birthDate;

    static final String DATE_FORMAT = "dd/MM/yyyy";
    static Scanner sc = new Scanner(System.in);
    

    public Teacher() {
    }
    public Teacher(String fullname, String hometown, String gender, LocalDate birthDate) {
        this.fullname = fullname;
        this.hometown = hometown;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public Teacher(String fullName, String hometown, String gender, String birthDate) {
        this(fullName, hometown, gender,
                LocalDate.parse(birthDate, DateTimeFormatter.ofPattern(DATE_FORMAT)));
    }
  
    public void input() {
        System.out.print("Ho va ten: ");
        this.fullname = sc.nextLine();
        System.out.print("Que quan: ");
        this.hometown = sc.nextLine();
        while (true) {
            System.out.print("Gioi tinh (Nu/Nam) : ");
            this.gender = sc.nextLine().toLowerCase();
            if (gender.equals("nam") || gender.equals("nu")) {
                this.setGender(gender);
                break;
            } else {
                System.out.println("Khong hop le. Vui long nhap 'nam ' hoac 'nu'");
            }
        }
        System.out.print("Ngay thang nam sinh (DD/MM/YYYY):");
        while (true) {
            try {
                this.birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern(DATE_FORMAT));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Nhap sai dinh dang ngay sinh");
                System.out.print("Nhap lai ngay sinh (DD/MM/YYYY): ");

            }
        }

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

   public void display() {
       System.out.println("Id: " + id);
       System.out.println("Ten: " + fullname);
        System.out.println("gioi tinh: " + gender);
        System.out.println("dia chi: " + hometown);
        System.out.println("ngay thang nam sinh: " + birthDate.format(DateTimeFormatter.ofPattern(DATE_FORMAT)));
    }

}
