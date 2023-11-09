import java.util.Scanner;

public class def3 {
    public void judge(String[][] list,int n){
        for (int i = 0; i < n; i++) {
            if(list[i][0].equals(list[n][0])){
                if(list[i][1].equals(list[n][1])){
                    System.out.print("ログイン完了");
                    System.exit(0);
                }
            }
        }
        System.out.print("error!!");
    }

    public String[][] nyuuryoku(int n){
        Scanner scan = new Scanner(System.in);
        String[][] list = new String[n+1][2];
        for (int i = 0; i < n; i++) {
            System.out.printf("%d人目の名前を入力してください(定義用):",i+1);
            list[i][0] = scan.next();
            System.out.printf("%d人目の学籍番号を入力してください(定義用):",i+1);
            list[i][1] = scan.next();
        }
        System.out.print("名前を入力してください(ログイン用):");
        list[n][0] = scan.next();
        System.out.print("学籍番号を入力してください(ログイン用):");
        list[n][1] = scan.next();
        return list;
    }
}
