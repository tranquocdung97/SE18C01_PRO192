/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trieu
 */
class Math{
    public static double PI = 3.14;
    
    public static int abs(int x){
        if(x<0){
          x=-x;
        }
        return x;
    }
    
    public static int add(int x,int y){
        return x+y;
    }
    
    public static int subtract(int x,int y){
        return x-y;
    }
    
    public static int min(double x, double y){
        if(x<y){
            return x;
        }else{
            return y;
        }
    }
    public static int max(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    public static int pow(int x , int y){
        int s=1;
        for(int i=0;i<y;i++){
            s=s*x;
        }
        return s;
    }

    static double toRadians(double angle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static double toRadians(double angle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


public class Bai1 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-2));
        System.out.println(Math.add(2, 3));
        System.out.println(Math.subtract(2, 3));
        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(2, 3));
    }
}
