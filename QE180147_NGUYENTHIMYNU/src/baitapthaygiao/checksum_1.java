/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapthaygiao;
   import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class checksum_1 {
 

	    public static class GTIN {

	        long number;
	        ArrayList<Integer> a = new ArrayList<>();

	        void getInformation() {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter number: ");
	            number = sc.nextLong();
	        }

	        public GTIN() {

	        }

	        int sum(long n) {
	            int s = 0;
	           while (n>0){
	        	   a.add((int)(n%10));
	        	   n/=10;
	            }
	            if (a.size()-1%2==0 && a.size() %2 ==0)
	           {
	            for (int i = a.size()-1 ; i >= 0; i--) {
	                if (i % 2 == 0) {
	                    s +=a.get(i);
	                } else {
	                    s +=a.get(i)*3;
	                }
	            }}
	           else
	           {
	        	   for (int i = a.size()-1 ; i >= 0; i--) {
	
		                if (i % 2 == 0) {
		                    s +=a.get(i)*3;
		                } else {
		                    s +=a.get(i);
		                }
		            }}
	            return s;
	        }

	        int sum1(int m) {
	            int d = 0, i = 1;
	            while (d < m) {
	                d = i * 10;
	                i++;
	            }
	            return d;
	        }

	        void display() {
	            int s = sum(number);
	          //  System.out.println("tong cac chu so cua chuoi la :" +s);
	            System.out.println( +sum1(s) + "-" + s + "=" +(sum1(s)-s) );
	        }

	        public static void main(String[] args) {
	            GTIN s1 = new GTIN();
	            s1.getInformation();
	            s1.display();
	        }
	    }
	}

