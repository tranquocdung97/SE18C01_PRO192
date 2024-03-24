/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

/**
 *
 * @author doanh
 */
class Message {

    String msg = "Happy New Year!";

    public void print() {

        System.out.println(msg);

    }

}

 

class Test {

    public static void change(Message m) {

        m = new Message();

        m.msg = "Happy Holidays!";

    }
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
