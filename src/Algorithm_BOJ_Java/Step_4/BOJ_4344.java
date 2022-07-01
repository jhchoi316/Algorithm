package Algorithm_BOJ_Java.Step_4;
import java.util.Scanner;

public class BOJ_4344 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int C = in.nextInt();

        for(int i=0;i<C;i++) {
            double count = 0;
            double sum = 0;
            int N = in.nextInt();
            int[] arr = new int[N];
            for(int j=0;j<N;j++) {
                int value = in.nextInt();
                arr[j] = value;
                sum += value;
            }
            double mean = (sum/N);
            for(int k=0;k<N;k++) {
                if(mean<arr[k]) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
        in.close();
    }
}
