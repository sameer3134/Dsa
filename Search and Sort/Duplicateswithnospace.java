public class Duplicateswithnospace {
    public static void main(String[] args) {
        int[] a={2,1,2,3,7,1,7,4};
        int size=a.length;
        for(int i=0;i<size;i++){
            if(a[Math.abs(a[i])]>=0){
                a[Math.abs(a[i])]=-a[Math.abs(a[i])];
            }else{
                System.out.println(Math.abs(a[i]));
            }
        }
    }
}
