public class MinRotatedArray {
    public static void main(String[] args) {
        int[] a={3,4,5,1,2};
        int low=0,high=a.length-1;
        int m=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low/2);
            m=Math.min(m,a[mid]);
            if(a[mid-1]>a[mid]){
                System.out.println(m);
            }
            if(a[mid]>a[high]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(m);
    }
}
