import java.util.Scanner;
public class proc2 {
    public static void main(String[] args) {

        int[] num = new int[5];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("数字%dつ目:", i);
            num[i] = scan.nextInt();
        }

        Keisan goukei = new Keisan();
        int x = goukei.tasu(num);
        goukei.hanntei(x);
    }
}