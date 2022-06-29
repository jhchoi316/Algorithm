package Algorithm_BOJ_Java.Step_4;
import java.util.Scanner;

public class BOJ_8958 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCase;
        testCase = in.nextInt();
        String[] str = new String[testCase];

        for(int i=0;i<str.length;i++) {
            str[i]=in.next();
        }
        in.close();

        for(int i=0;i<str.length;i++) {
            int count = 0;
            int sum = 0;

            for(int j=0;j<str[i].length();j++) {
                if(str[i].charAt(j)== 'O') {
                    count++;
                }
                else {
                    count = 0;
                }
                sum+=count;
            }

            System.out.println(sum);
        }
    }
}
