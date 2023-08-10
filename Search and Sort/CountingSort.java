import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingSort {
    public static void main(String[] args) {
        int[]  a={1, 4, 1, 2, 7, 5, 2};
        int n=a.length;
        int[] b=new int[8];
        for(int i=0;i<n;i++){
            int s=a[i];
            b[s]++;
        }
        int i=0,j=0;
        while(i<n){
            if(b[j]>0){
                int s=b[j];
                for(int l=0;l<s;l++){
                    a[i]=j;
                    i++;
                }               
            }           
            j++;
        }
        for(int k=0;k<n;k++){
            System.out.print(a[k]);
        }
}
}