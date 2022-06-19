package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_10950 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int arr[] = new int[T];

        for (int i=0;i<T;i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            arr[i] = A+B;
        }

        for(int j=0; j<T;j++) {
            System.out.println(arr[j]);
        }
    }
}
