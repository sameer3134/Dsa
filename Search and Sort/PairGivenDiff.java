import java.util.HashMap;

public class PairGivenDiff {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, 40, 100};
        int n=60;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
            if(n==0 && map.get(arr[i])>1){
                System.out.println(arr[i]);
            }
        }
        if(n==0){
            System.out.println("no. not found");
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]+n)){
                System.out.println(arr[i]);
                System.out.println(arr[i]+n);
            }
        }
    }
}
