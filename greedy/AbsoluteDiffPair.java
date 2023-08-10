import java.util.Arrays;

public class AbsoluteDiffPair {
    public static void main(String[] args) {
        int[] a={3,2,1},b={2,1,3};
        Arrays.sort(a);
        Arrays.sort(b);
        int diff=0;
        for(int i=0;i<a.length;i++){
            diff+= Math.abs(a[i]-b[i]);
        }
        System.out.println(diff);
    }
}
