
import java.util.Scanner;

public class Bt3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 1;
        while (b > 0) {
            answer *= a;
            b--;
        }
        System.out.print(answer);
    }
}
