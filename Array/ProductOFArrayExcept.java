public class ProductOFArrayExcept {
    public static void main(String[] args) {
        int[] a={3,2,3,5};
        int[] right=new int[a.length+1];
        int[] left=new int[a.length];
        int prod=1;
        for(int i=a.length-1;i>=0;i--){
            right[i]=prod*a[i];
            prod=prod*a[i];
        }
        prod=1;
        right[a.length]=1;
        for(int i=0;i<a.length;i++){
            int lp=prod;
            int rp=right[i+1];
            left[i]=lp*rp;
            prod=prod*a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(left[i]);
        }
    }
}
