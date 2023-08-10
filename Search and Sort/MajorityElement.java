import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int a[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else{
                map.put(a[i],1);
            }
            if(map.get(a[i])>a.length/2){
                System.out.println(a[i]);
            }
            if(map.get(a[i])<(a.length/2) && i==a.length-1 ){
                System.out.println("no");
            }
        }
    }
}
