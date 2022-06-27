package Algorithm_BOJ_Java.Step_4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10818 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int i = 0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        while(st.hasMoreTokens()) {
            arr[i]=Integer.parseInt(st.nextToken());
            i++;
        }

        Arrays.sort(arr);
        bw.write(arr[0]+" "+arr[N-1]);

        br.close();
        bw.flush();
        bw.close();
    }
}
