package Algorithm_BOJ_Java.Step_6;
import java.util.Scanner;

public class BOJ_10809 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        in.close();

        int[] arr = new int[26];

        for(int i=0;i<arr.length;i++) {
            arr[i]=-1;
        }

        for(int i=0;i<S.length();i++) {
            char ch = S.charAt(i);

            if(arr[ch-'a']==-1) {
                arr[ch-'a'] = i;
            }
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
