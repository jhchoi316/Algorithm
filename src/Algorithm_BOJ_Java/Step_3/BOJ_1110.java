package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_1110 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = 0;
        int count = 0;

        if(N<10 && N>=0) {
            X = (N*10)+(N%10);
            count++;
        }
        else if (N>=10 && N<=99) {
            X = (N%10*10)+(((N/10)+(N%10))%10);
            count++;
        }

        while(N != X) {
            X =(X%10*10)+(((X/10)+(X%10))%10);
            count++;
        }
        System.out.println(count);
    }
}
