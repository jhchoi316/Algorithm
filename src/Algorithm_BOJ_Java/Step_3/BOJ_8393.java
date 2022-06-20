package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_8393 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        if(n>=1 && n<=10000) {
            for(int i=1;i<=n;i++) {
                sum+=i;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("범위 밖입니다.");
        }
    }
}
