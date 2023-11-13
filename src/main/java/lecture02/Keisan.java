public class Keisan {
    public void hanntei(int x){
        if (x>=100){
            System.out.println("great!!");
        }else if(x>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
    public int tasu(int[] num){
        int x = 0;
        for (int j = 0; j < 5; j++) {
            x += num[j];
        }
        System.out.printf("合計値：%d\n",x);
        return x;
    }
}
