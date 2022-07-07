package Algorithm_BOJ_Java.Step_6;
import java.util.Scanner;

public class BOJ_11720 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String num = in.next();
        in.close();

        if(num.length()!=N) {
            System.out.println("범위 밖입니다.");
        }
        else {
            int sum = 0;
            for(int i=0;i<N;i++) {
                sum += num.charAt(i)-'0';
            }
            System.out.println(sum);
        }

    }
}
