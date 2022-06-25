package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_10871 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr;
        arr = new int[10000];

        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<N;j++) {
            if(arr[j]<X && arr[j]!=0) {
                System.out.print(arr[j]+" ");
            }
        }
    }
}
