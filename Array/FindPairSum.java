import java.util.HashMap;

public class FindPairSum {
    public static void main(String[] args) {
        int[] a={11, 15, 26, 38, 9, 10};
        int sum=35;
        int m=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int s=sum-a[i];
            if(map.containsKey(s)){
                m=1;
            }else{
                map.put(a[i],1);
            }
        }
        if(m==0){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
