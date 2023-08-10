import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,4,7,8,10},arr2={3,5,6,9};
        int m=arr1.length,n=arr2.length;
        int i=0;
        while(arr1[m-1]>arr2[0]){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                Arrays.sort(arr2);
            }
            i++;
        }
        for(int j=0;j<m;j++){
            System.out.print(arr1[j]);
        }
        for(int j=0;j<n;j++){
            System.out.print(arr2[j]);
        }
    }
}
