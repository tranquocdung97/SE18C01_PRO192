package QE180149_DuongThao;

import java.util.Scanner;

public class BT38 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score <= 10 && score >= 0) {
            System.out.println("The score is valid");
        } else {
            System.out.println("The score is not valid");
        }
    }
}
