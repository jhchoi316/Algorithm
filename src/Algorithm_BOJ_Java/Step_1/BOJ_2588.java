package Algorithm_BOJ_Java.Step_1;
import java.util.Scanner;

public class BOJ_2588 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A*(B%10));
        System.out.println(A*((B-(B/100*100))/10));
        System.out.println(A*(B/100));
        System.out.println(A*B);
    }
}
