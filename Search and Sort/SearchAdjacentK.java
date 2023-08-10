public class SearchAdjacentK {
    public static void main(String[] args) {
         int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==x){
                System.out.println(i);
            }
            i= i+ Math.max(1,Math.abs((x-arr[i])/k));
        }
    }
}
