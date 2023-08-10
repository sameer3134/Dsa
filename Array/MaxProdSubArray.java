public class MaxProdSubArray {
    public static void main(String[] args) {
        int[] a={2,3,-2,4};
        int min=a[0],max=a[0],ans=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(a[i],max*a[i]);
            min=Math.min(a[i], min*a[i]);           
            ans=Math.max(ans,max);
        }
        System.out.println(ans);
    }
}
