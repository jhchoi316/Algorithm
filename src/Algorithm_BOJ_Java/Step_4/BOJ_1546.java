package Algorithm_BOJ_Java.Step_4;
import java.util.Scanner;

public class BOJ_1546 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double[] arr = new double[N];
        double[] arrNew = new double[N];
        double M = 0;
        double sum = 0;

        for(int i=0;i<N;i++) {
            arr[i] = in.nextDouble();
        }
        for(int i=0;i<N;i++) {
            if(M < arr[i]) {
                M = arr[i];
            }
        }
        for(int i=0;i<N;i++) {
            arrNew[i] = (arr[i]/M)*100;
            sum += arrNew[i];
        }

        System.out.println(sum/N);
    }
}
