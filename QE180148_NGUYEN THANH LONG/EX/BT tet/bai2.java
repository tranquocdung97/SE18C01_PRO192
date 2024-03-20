
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * 
 */
public class bai2 {
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao day so (1-10^11)");
        long a = sc.nextLong();
        if(dem(a) == 0 ){ 
        System.out.println("nhap vao sai");
        }else{
        System.out.println(" "+checksumPart1(a));
       }
    }
    private static int checksumPart1(long a){
        int sum =0;
        int n = dem(a);
        for(int i=1;i<=n+1;i++){
            if(i%2 == 0){
                sum += (a%10 *1);
            }else{
                sum += (a%10 *3);
            }
            a/=10;
        }
        sum=checksum(sum);
        return sum;
    }
    
    private static int checksum(int sum){
        int tong = (sum/10+1)*10; 
        sum = Math.abs(tong - sum);
        return sum;
    }
    
    private static int dem(long a){
        String str = String.valueOf(a);
        int n = str.length();
        if(n<0 && n> 11){
            return 0;
        }
        return n;
    }
}
