package Algorithm_BOJ_Java.Step_2;
import java.util.Scanner;

public class BOJ_2884 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(H<0 || H>23 || M<0 || M>59) {
            System.out.println("범위 밖입니다.");
        }
        else if(H==0 && M<45) {
            System.out.println("23 "+(M+15));
        }
        else if (H==0 && M>=45) {
            System.out.println(H+" "+(M-45));
        }
        else if (H!=0 && M<45) {
            System.out.println((H-1)+" "+(M+15));
        }
        else {
            System.out.println((H)+" "+(M-45));
        }
    }
}
