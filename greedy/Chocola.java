import java.util.Arrays;
import java.util.Collections;

public class Chocola {
    public static void main(String[] args) {
        Integer[] c={2,1,3,1,4};
        Integer[] r={4,1,2};
        int m=r.length,n=c.length;
        Arrays.sort(c,Collections.reverseOrder());
        Arrays.sort(r,Collections.reverseOrder());
        int r1=1,c1=1;
        int i=0,j=0;
        int total=0;
        while(i<m && j<n){
            if(c[j]<r[i]){
                total+=c1*r[i];
                r1++;
                i++;
            }else{
                total+= r1*c[j];
                c1++;
                j++;
            }
        }
        while(i<m){
            total+=c1*r[i];
            i++;     
        }
        while(j<n){
            total+= r1*c[j];
            j++;
        }
        System.out.println(total);
    }
}
