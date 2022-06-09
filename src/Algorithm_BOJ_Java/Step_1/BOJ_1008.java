package Algorithm_BOJ_Java.Step_1;
import java.util.Scanner;

public class BOJ_1008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextInt();
        double B = scanner.nextInt();

        if(0 < A && B < 10)
        {
            System.out.println(A/B);
        }
        else
        {
            System.out.println("범위 밖입니다.");
        }
    }
}
