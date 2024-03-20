package quanli.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teacher {

    static public int dem = 0;
    private int id;
    private String fullname;
    private String hometown;
    private String gender;
    private LocalDate birthDate;
    private String gmail;

    public Teacher() {
    }

    public Teacher(String fullname, String hometown, String gender, LocalDate birthDate, String gmail) {
        this.fullname = fullname;
        this.hometown = hometown;
        this.gender = gender;
        this.birthDate = birthDate;
        this.gmail = gmail;
    }

    public Teacher(String fullName, String hometown, String gender, String birthDate, String gmail) {
        this(fullName, hometown, gender,
                LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")), gmail);
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

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getBirthDateS() {
        return birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void resetID() {
        --this.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nHo va ten: " + fullname
                + "\nDia Chi: " + hometown + "\nGio tinh: " + gender
                + "\nNgay thang nam sinh: " + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +"\nGmail "+gmail;
    }
}
