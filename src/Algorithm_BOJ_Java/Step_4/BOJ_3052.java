package Algorithm_BOJ_Java.Step_4;
import java.util.Scanner;

public class BOJ_3052 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;
        int tmp = 0;

        for(int i=0;i<arr.length;i++) {
            arr[i]=in.nextInt()%42;
        }
        for(int j=0;j<arr.length;j++) {
            tmp = 0;
            for(int k=j+1;k<arr.length;k++) {
                if(arr[j]==arr[k]) {
                    tmp++;
                }
            }
            if(tmp==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
