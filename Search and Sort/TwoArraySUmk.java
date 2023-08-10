import java.util.*;

public class TwoArraySUmk {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 2, 1},b = { 3, 3, 3, 4 };
        int k = 5, f=0;
        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            if(a[i]+b[i]>k){
                f=0;
            }else{
                f=1;
            }
        }
        if(f==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
