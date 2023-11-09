import java.util.Scanner;
public class proc3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("人数を選択(5人以上):");
        int n = scann.nextInt();
        if(n<5){
            System.out.print("5人以上選択してください");
            System.exit(0);
        }
        def3 list = new def3();
        String[][] listed = list.nyuuryoku(n);
        list.judge(listed,n);
        }
}
