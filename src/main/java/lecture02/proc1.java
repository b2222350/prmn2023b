import java.util.Scanner;
public class proc1 {
    public static void main(String[] args) {
        String number = "B2001000";
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        String gakuseki = scan.next();

        Gakuseki gakuseki1 = new Gakuseki();
        gakuseki1.hannbetu(number,gakuseki);
    }
}