import java.util.Arrays;

public class MinCOstKExtracoin {
    public static void main(String[] args) {
        int[] coin={100,20,50,10,2,5};
        int k=3;
        Arrays.sort(coin);
        int s=(int)Math.ceil(coin.length/(k+1));
        int total=0;
        for(int i=0;i<=s;i++){
            total += coin[i];
        }
        System.out.println(total);
    }
}
