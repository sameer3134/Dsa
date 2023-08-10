public class EqualMinCost {
    public static void main(String[] args) {
        int[] a={1,100,101};
        int n=a.length,y=0;
        if(n%2==1){
            y=a[n/2];
        }else{
            y=(a[n/2]+a[(n-2)/2])/2;
        }
        int s=0;
        for(int i=0;i<n;i++){
            s+= Math.abs(a[i]-y);
        }
        System.out.println(s);
    }
}
