package Algorithm_BOJ_Java.Step_2;
import java.util.Scanner;

public class BOJ_2753 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(year>4000) {
            System.out.println("범위 밖입니다.");
        }
        else if((year%4==0 && year%100!=0) || (year%4==0 && year%400==0)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
