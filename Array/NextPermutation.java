class Permuation{
    public static void main(String[] args) {
        int[] a={2,1};
        if(a == null || a.length == 1) return;
        int i=a.length-2;
        while(i>=0 && a[i]>=a[i+1])i--;
        if(i>=0){
            int j=a.length-1;
            while(a[j]<=a[i])j--;
            swap(a,i,j);
        }
        reverse(a, i+1, a.length-1);
        for(int l=0;l<a.length;l++){
            System.out.println(a[l]);
        }
    }
    public static void swap(int[] a,int m,int n){
        int temp=0;
        temp=a[m];
        a[m]=a[n];
        a[n]=temp;
    }
    public static void reverse(int[] a,int i,int j){
        while(i<j){
            swap(a,i++,j--);
        }
    }
}