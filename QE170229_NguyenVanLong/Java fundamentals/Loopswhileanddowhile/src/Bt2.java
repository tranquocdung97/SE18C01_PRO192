
import java.util.Scanner;

public class Bt2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int answer = 0;
        while (i <= n) {
            if (n % i == 0) {
                answer++;
            }
            i++;
        }
        System.out.println(answer);
    }
}
