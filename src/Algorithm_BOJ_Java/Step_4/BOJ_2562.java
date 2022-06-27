package Algorithm_BOJ_Java.Step_4;
import java.util.Scanner;

public class BOJ_2562 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        int Max = 0;
        int index = 0;

        for(int i=0;i<9;i++) {
            arr[i]=in.nextInt();
            if(Max<arr[i]) {
                Max=arr[i];
            }
        }

        while(Max!=arr[index]) {
            index++;
        }
        System.out.println(Max + "\n" + (index+1));
    }
}
