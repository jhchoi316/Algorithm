package Algorithm_BOJ_Java.Step_2;
import java.util.Scanner;

public class BOJ_1330 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (-10000<=A && B<=10000 && A>B) {
            System.out.println(">");
        }
        else if (-10000<=A && B<=10000 && B>A) {
            System.out.println("<");
        }
        else if (-10000<=A && B<=10000 && A==B) {
            System.out.println("==");
        }
        else {
            System.out.println("범위 밖입니다.");
        }
    }
}
