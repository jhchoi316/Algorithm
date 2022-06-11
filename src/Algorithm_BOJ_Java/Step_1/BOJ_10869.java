package Algorithm_BOJ_Java.Step_1;
import java.util.Scanner;

public class BOJ_10869 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(0 < A && B <= 10000)
        {
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);
        }
        else
        {
            System.out.println("범위 밖입니다.");
        }
    }
}
