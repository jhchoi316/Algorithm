package Algorithm_BOJ_Java.Step_1;
import java.util.Scanner;

public class BOJ_18108 {

    public static void main(String[] args) {

        int thaiYear = 0;
        int realYear = 0;

        Scanner scanner = new Scanner(System.in);
        thaiYear = scanner.nextInt();

        if (1000 <= thaiYear && thaiYear <= 3000)
        {
            realYear = thaiYear - 543;
            System.out.println(realYear);
        }
    }
}
