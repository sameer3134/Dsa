import java.util.Arrays;

public class InversionCount {
    public static void main(String[] args) {
        int[] a={8,4,2,1};
        System.out.println(mergesort(a,0,a.length-1));   
    }
    public static int mergesort(int[] a,int low, int high){
        int count =0;
        if(low<high){
            int mid= low+(high-low)/2;
            count +=mergesort(a, low, mid);
            count +=mergesort(a, mid+1, high);
            count += merge(a,low,mid,high);
        }
        return count;
    }
    public static int merge(int[] a, int l,int m, int h){
        int[] left=Arrays.copyOfRange(a, l, m+1);
        int[] right=Arrays.copyOfRange(a, m+1, h+1);
        int i=0,j=0,k=l,count=0;
        while (i < left.length && j < right.length){
            if(left[i]<=right[j]){
                a[k++]=left[i++];
            }else{
                a[k++]=right[j++];
                count +=(m + 1) - (l + i);;
            }
        }
        while (i < left.length)
            a[k++] = left[i++];
        while (j < right.length)
            a[k++] = right[j++];
        return count;
    }
}
