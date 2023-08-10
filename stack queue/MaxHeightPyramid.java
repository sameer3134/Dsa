import java.util.Arrays;

public class MaxHeightPyramid {
    public static void main(String[] args) {
        int[] a={40,100,20,30};
        Arrays.sort(a);   //20,30,40,100
        int prev_count=1,prev_width=a[0];
        int curr_count=0,curr_width=0;
        int ans=1;
        for(int i=1;i<a.length;i++){
            curr_count+=1;
            curr_width+=a[i];
            if(prev_count<curr_count && prev_width<curr_width){
                prev_count=curr_count;
                prev_width=curr_width;
                curr_count=0;
                curr_width=0;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
