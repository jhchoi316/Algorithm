package Algorithm_BOJ_Java.Step_1;
import java.util.Scanner;

public class BOJ_10430 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (2 <= A && 2 <= B && B <= 10000 && C <= 10000)
        {
            System.out.println((A+B)%C);
            System.out.println(((A%C)+(B%C))%C);
            System.out.println((A*B)%C);
            System.out.println(((A%C)*(B%C))%C);
        }
    }
}
