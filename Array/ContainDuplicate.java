import java.util.HashMap;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] a={1,2,3,1};
        boolean s=false;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }else{
               s=true;
            }
        }
        System.out.println(s);
    }
}
