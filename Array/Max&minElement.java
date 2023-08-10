class MaxminElement{
    public static void main(String[] args) {
    int[] a= {7,9,8,1,3};
    int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        min=Math.min(a[i],min);
        max=Math.max(max,a[i]);
    }
    System.out.println(min);
    System.out.println(max);
}}