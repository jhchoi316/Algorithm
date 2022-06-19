package Algorithm_BOJ_Java.Step_2;
import java.util.Scanner;

public class BOJ_2480 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int prize = 0;

        if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && A!=B && B!=C && A!=C && A>B && A>C) {
            prize = A*100;
            System.out.println(prize);
        }
        else if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && A!=B && B!=C && A!=C && B>A && B>C) {
            prize = B*100;
            System.out.println(prize);
        }
        else if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && A!=B && B!=C && A!=C && C>A && C>B) {
            prize = C*100;
            System.out.println(prize);
        }
        else if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && (A==B && B!=C)||(A==C && B!=C)) {
            prize = 1000+(A*100);
            System.out.println(prize);
        }
        else if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && B==C && A!=C) {
            prize = 1000+(C*100);
            System.out.println(prize);
        }
        else if ((A>0 && A<7 && B>0 && B<7 && C>0 && C<7) && A==B && B==C) {
            prize = 10000+(A*1000);
            System.out.println(prize);
        }
        else {
            System.out.println("범위 밖입니다.");
        }
    }
}
