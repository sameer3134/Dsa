import java.util.Arrays;

public class MaxSumConsecDiff {
    public static void main(String[] args) {
        int[] arr={4,2,1,8};
        Arrays.sort(arr);
        int sum=0,n=arr.length;
        for(int i=0;i<n/2;i++){
            sum-=2*arr[i];
            sum+=2*arr[n-i-1];
        }
        System.out.println(sum);
    }
}
