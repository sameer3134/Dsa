public class CeilSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 10, 10, 12, 19 };
        int n = arr.length;
        int x = 8;
        if(x==0){
            System.out.println(-1);
        }
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid= low + (high-low)/2;
            if(arr[mid]==x){
                System.out.println(arr[mid]);
            }else if(arr[mid]>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(arr[low]);
    }
}
