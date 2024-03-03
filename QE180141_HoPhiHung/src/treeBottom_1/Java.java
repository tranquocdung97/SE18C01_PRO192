/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treeBottom_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java {

    static int treeBottom(String tree) {
        int dodosau = 0;
        int dosaunhat = 0;
        //tach thanh n` chuoi du tren khoang trang
        String[] treeList = tree.split(" ");
        //ds de bo gtri va do sau 
        List<String> nodes = new ArrayList<>();
        //duyet chuoi con 
        for (String c : treeList) {
            //duyet qua tung ki tu 
            for (char d : c.toCharArray()) {
                if (d == '(') {
                    dodosau++;
                }
                if (d == ')') {
                    dodosau--;
                }
            }
            //xoa ( va ) 
            String newS = c.replace("(", "");
            newS = newS.replace(")", "");
            newS = newS.replace(" ", "");
            //theo doi do sau
            if (newS.length() > 0) {
                nodes.add(newS);
                nodes.add("" + dodosau);
                if (dodosau > dosaunhat) {
                    dosaunhat = dodosau;
                }
            }
        }
        //luu gia tri nut sau nhat 
        List<Integer> sol = new ArrayList<>();
        //nut va do sau 
        for (int i = 0; i < nodes.size(); i += 2) {
            int countN = Integer.parseInt(nodes.get(i + 1));
            if (countN == dosaunhat) {
                sol.add(Integer.parseInt(nodes.get(i)));
            }
        }
        int sum = 0;
        for (int i : sol) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Input : ");
        String tree = scanner.nextLine();

        int result = treeBottom(tree);
        System.out.println("Checksum cho vach ma " + tree + "la : " + result);
    }
}
