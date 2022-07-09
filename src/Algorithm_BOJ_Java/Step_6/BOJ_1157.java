package Algorithm_BOJ_Java.Step_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[26];
        String st = br.readLine();

        for(int i=0;i<st.length();i++) {
            if('a'<=st.charAt(i)&&st.charAt(i)<='z') {
                count[st.charAt(i)-97]++;
            }
            else {
                count[st.charAt(i)-65]++;
            }
        }

        int max = -1;
        char ch = '?';

        for(int i=0;i<26;i++) {
            if(count[i]>max) {
                max = count[i];
                ch = (char)(i+65);
            }
            else if(count[i]==max) {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
