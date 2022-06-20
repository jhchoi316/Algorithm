package Algorithm_BOJ_Java.Step_3;
import java.util.Scanner;

public class BOJ_14681 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x>1000 || x<-1000 || y>1000 || y<-1000 || x==0 || y==0) {
            System.out.println("범위 밖입니다.");
        }
        else if (x>0 && y>0) {
            System.out.println("1");
        }
        else if (x<0 && y>0) {
            System.out.println("2");
        }
        else if (x<0 && y<0) {
            System.out.println("3");
        }
        else {
            System.out.println("4");
        }
    }
}
