class Sell{
    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};
        int diff=0,mmin=a[0],maxdiff=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            mmin=Math.min(a[i],mmin);
            diff=a[i]-mmin;
            maxdiff=Math.max(maxdiff,diff);
        }
        System.out.println(maxdiff);
    }
}