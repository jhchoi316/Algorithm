package Algorithm_BOJ_Java.Step_2;
import java.util.Scanner;

public class BOJ_2525 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(A<0 || A>24 || B<0 || B>60 || C<0 || C>1000) {
            System.out.println("범위 밖입니다.");
        }
        else if(A+((B+C)/60)>=24) {
            A=(A+((B+C)/60))-24;
            B=((B+C)%60);
        }
        else if(A+((B+C)/60)<24) {
            A=(A+((B+C)/60));
            B=((B+C)%60);
        }

        System.out.println(A + " " + B);
    }

}
