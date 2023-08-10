import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3;
        Arrays.sort(arr);   // 2,3,4,7,9,12,56
        int diff=Integer.MAX_VALUE,minDiff=Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++){
            diff=arr[i+m-1]-arr[i];
            minDiff=Math.min(minDiff, diff);
        }
        System.out.println(minDiff);
    }
}
