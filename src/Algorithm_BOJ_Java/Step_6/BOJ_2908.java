package Algorithm_BOJ_Java.Step_6;
import java.util.Scanner;

public class BOJ_2908 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        System.out.println(compare(A,B));
    }

    public static int compare(int A, int B)
    {
        int newA = (A%10*100) + (((A/10)%10)*10) + (A/100);
        int newB = (B%10*100) + (((B/10)%10)*10) + (B/100);
        A = newA;
        B = newB;

        if(A>B) {
            return A;
        }
        else {
            return B;
        }
    }
}
