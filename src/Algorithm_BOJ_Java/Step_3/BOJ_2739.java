package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_2739 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if(0<N && N<=9) {
            for (int i=1;i<10;i++) {
                System.out.println(N + " * " + i + " = " + N*i);
            }
        }
    }
}
