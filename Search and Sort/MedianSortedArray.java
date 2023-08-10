public class MedianSortedArray {
    public static void main(String[] args) {
        int a[] = {-5, 3,4, 6, 12}, b[] = {-12, -10, -6, -3, 4, 10};
        int m=a.length,n=b.length;
        int s=0;
        if((m+n)%2==1){
            s=(m+n+1)/2;
        }else{
            s=(m+n)/2;
        }
        System.out.println(s);
    }
}
