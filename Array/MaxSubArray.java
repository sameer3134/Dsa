public class MaxSubArray {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0,maxsum=a[0];
        for(int i=0;i<a.length;i++){
            sum+= a[i];
            maxsum= Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
            System.out.print(sum);
            System.out.println(maxsum);
        }
        System.out.println(maxsum);

    }
}
