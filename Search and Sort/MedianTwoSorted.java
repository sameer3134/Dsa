public class MedianTwoSorted {
    public static void main(String[] args) {
        int[] a={-5,3,6,12,15,17,20},b={-12,-10,-6,-3,4,10};
        
        int l=median(a,b);
        System.out.println(l);
        }
    public static int median(int[] a,int[] b){
        if(a.length>b.length){
            median(b,a);
        }
        int n=a.length, m=b.length;
        int hald=(a.length+b.length+1)/2;
        int left=0, right=a.length;
        while(left<=right){
            int i=(left+right)/2;    //a
            int s=hald-i;       //b
            int lefta= (i>0)? a[i-1]: Integer.MIN_VALUE;
            int righta=(s>0)? b[i-1]: Integer.MIN_VALUE;
            int leftb=(i<n)?a[i]:Integer.MAX_VALUE;
            int rightb=(s<n)?b[i]:Integer.MAX_VALUE;
            if(lefta<=rightb && righta<=leftb){
                if((m+n)%2==0){
                    return (Math.max(lefta,leftb)+Math.min(righta,rightb))/2;
                }else{
                    return Math.max(lefta, leftb);
                }     
            }else if(lefta>rightb){
                right=i-1;
            }else{
                left=i+1;
            }
        }
        return 0;
    }
}
