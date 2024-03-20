
package model;


public class giangVien {
    private int id;
    private String ten;
    private String email;

    public giangVien(int id, String ten, String email) {
        this.id = id;
        this.ten = ten;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "giangVien{" + "id=" + id + ", ten=" + ten + ", email=" + email + '}';
    }
    
}
