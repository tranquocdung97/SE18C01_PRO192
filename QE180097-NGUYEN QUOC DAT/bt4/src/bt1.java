import java.util.Scanner;

class Student{
        String name;
        int age;
    public void getinformation(){
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        age = sc.nextInt();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class bt1 {
       public static void main(String[]args) {
            Student s = new Student();
            s.getinformation();
            s.display();
        }
}
