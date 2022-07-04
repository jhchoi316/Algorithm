package Algorithm_BOJ_Java.Step_5;
import java.util.Scanner;

public class BOJ_1065 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(X(n));
    }

    public static int X(int number)
    {
        int count = 0;
        if(number < 100) {
            return number;
        }
        else {
            count = 99;
            if(number == 1000) {
                number=999;
            }
            for(int i=100;i<number+1;i++) {
                int hun = i/100;
                int ten = (i/10)%10;
                int one = i%10;
                if(hun-ten == ten-one) {
                    count++;
                }
            }
        }
        return count;
    }
}
