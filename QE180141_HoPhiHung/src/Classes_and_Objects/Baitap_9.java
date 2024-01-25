/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes_and_Objects;

/**
 *
 * @author Ho Phi Hung
 */import java.util.Scanner;

public class Baitap_9 {
//public class Student {



        private String name;
        private int age;

        private String gender;

        private double gpa;

        public Baitap_9() {
        //public Student() {

        }

        public void getInformation() {
            Scanner sc = new Scanner(System.in);

            name = sc.nextLine();
            age = sc.nextInt();
            gender = sc.next();
            gpa= sc.nextDouble();

        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("GPA: " + gpa);

        }
        public static void main(String[] args) {
            Baitap_9 s = new Baitap_9();
            //Student s = new Student();
            s.getInformation();
            s.display();
        }
    }

/*
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String gender;
    private double gpa;
    
    public Student (String name, int age, String gender, double gpa){
        this.name = name ;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }
    
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: "+ gender);
        System.out.println("GPA: "+ gpa);
    }
}
class Entry {
    public static void main (String[] args){
        Student s1 = new Student("Ket",24,"Male",7.7);
        Student s2 = new Student("Viet",30,"Male",8.2);
        s1.display();
        s2.display();
    }
}
*/

/*import java.utill.Scanner;

public class Student {
    private String  name ; 
    private int     age  ;
    private String  gender ; 
    private double  gpa  ;

    public Student (String name ,int age ,String gender ,double gpa ) {
        this.name = name; 
        this.age  = age ; 
        this.gender = gender;
        this.gpa  = gpa ; 
    }
    public void display (){
        System.out.println(
            "Name: "+ name + "\n"+
            "Age: " + age  + "\n"+
            "Gender: " + gender + "\n"+ 
            "GPA: " + gpa
        );
    }
    public static void main(String[] args){
        Student s1 = new Student("Ket",24,"Male",7.7);
        s1.display();
        Student s2 = new Student("Viet",30,"Male",8.2);
        s2.display();
    }

} */