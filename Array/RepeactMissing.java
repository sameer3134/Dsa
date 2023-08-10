import java.util.HashMap;

public class  RepeactMissing {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        HashMap<Integer,Boolean> map= new HashMap<>();
        for(Integer i : arr){
            if(map.get(i)==null){
                map.put(i,true);
            }else{
                System.out.println("Repeatng no"+ i);
            }
        }
        for(int i=1;i<arr.length;i++){
            if(map.get(i)==null){
                System.out.println("Missing no. "+i);
            }
        }
    }
}
