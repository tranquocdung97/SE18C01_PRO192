/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class baitap_1 {
    public static int checksum(int a[])
    {
        if(a.length > 12) return 0;
        int sum = 0;
        if(a.length %10==0){
            for (int i=0;i<a.length;i++ ){
            if(i%2==0) sum=sum+a[i];
            else sum =sum +a[i]*3;
            }
        }
        else for (int i=0;i<a.length;i++ ){
            if(i%2!=0) sum=sum+a[i];
            else sum =sum +a[i]*3;
        }
        if(sum%10==0) return 0;
        return (sum/10+1)*10-sum;
    }
    public static void main( String[] agrs) 
    {
        Scanner a = new Scanner(System.in);
        System.out.print ("nhap so can tinh: \n");
        long n = a.nextLong();
        int d=0;
        long e = n;
        do{
            d++;
            e=e/10;
        }while (e>0);
        int[] r=new int[d];
        int j=d;
        do{
            r[j-1]=(int) (n%10);
            n= n/10;
            j=j-1;
        }while (n>0);
        System.out.println(checksum(r));
    }    
}
